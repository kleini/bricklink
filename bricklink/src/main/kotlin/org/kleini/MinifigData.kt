package org.kleini

import org.kleini.bricklink.api.BrickLinkClient
import org.kleini.bricklink.api.Configuration
import org.kleini.bricklink.api.PriceGuideRequest
import org.kleini.bricklink.data.Condition
import org.kleini.bricklink.data.GuideType
import org.kleini.bricklink.data.ItemType
import org.kleini.brickstore.BrickStoreDeSerializer
import java.io.File

class MinifigData {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MinifigData().run(args)
        }
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
            }
        }
        deSerializer.save(brickStore, File("minifig_out.bsx"))
    }
}
