package org.kleini

import org.kleini.bricklink.api.BrickLinkClient
import org.kleini.bricklink.api.Configuration
import org.kleini.bricklink.api.InventoriesRequest
import org.kleini.bricklink.api.PriceGuideRequest
import org.kleini.bricklink.data.Category
import org.kleini.bricklink.data.Color
import org.kleini.bricklink.data.Condition
import org.kleini.bricklink.data.GuideType
import org.kleini.bricklink.data.Inventory
import org.kleini.bricklink.data.ItemType
import org.kleini.brickstore.BrickStoreDeSerializer
import org.kleini.brickstore.data.Item
import java.io.File
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat

class CollectItemData {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            CollectItemData().run(args)
        }
        val decimalFormat = DecimalFormat("000%")
    }

    private fun run(args: Array<String>) {
        val deSerializer = BrickStoreDeSerializer()
        val brickStore = deSerializer.load(File(args[0]))
        val configuration = Configuration()
        BrickLinkClient(configuration).use { client ->
            brickStore.inventory.item.forEach { item ->
                val soldGuide = client.execute(
                    PriceGuideRequest(
                        ItemType.byID(item.itemTypeID),
                        item.itemID,
                        item.colorID,
                        GuideType.SOLD,
                        Condition.valueOf(item.condition)
                    )
                ).priceGuide
                item.bulk = soldGuide.quantity
                val stockGuide = client.execute(
                    PriceGuideRequest(
                        ItemType.byID(item.itemTypeID),
                        item.itemID,
                        item.colorID,
                        GuideType.STOCK,
                        Condition.valueOf(item.condition)
                    )
                ).priceGuide
                val percentageSold = soldGuide.quantity.toBigDecimal().divide(stockGuide.quantity.toBigDecimal(), 2, RoundingMode.HALF_UP)
                item.comments = "${decimalFormat.format(percentageSold)} durchlauf (${soldGuide.quantity} / ${stockGuide.quantity})"
                val marge = soldGuide.quantityAveragePrice.divide(item.price.multiply(1.19f.toBigDecimal()), 2, RoundingMode.HALF_UP).minus(BigDecimal.ONE)
                val inventoryItem = findMatchingItem(client.execute(InventoriesRequest(
                    ItemType.byID(item.itemTypeID),
                    InventoriesRequest.Status.AVAILABLE,
                    Category.byId(item.categoryID),
                    Color.byId(item.colorID)
                )).inventories, item)
                val inventoryCount = inventoryItem?.quantity ?: 0
                item.remarks = "${decimalFormat.format(marge)} marge (bestand $inventoryCount)"
            }
        }
        deSerializer.save(brickStore, File("minifig_out.bsx"))
    }

    private fun findMatchingItem(list: List<Inventory>, item: Item): Inventory? {
        return list.find { inventory ->
            inventory.item.identifier == item.itemID && inventory.condition == Condition.valueOf(item.condition)
        }
    }
}
