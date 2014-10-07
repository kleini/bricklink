/*
 * GPL v3
 */

package org.kleini.bricklink.tools;

import java.math.BigDecimal;
import java.util.List;

import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.InventoriesRequest;
import org.kleini.bricklink.api.InventoriesRequest.Status;
import org.kleini.bricklink.api.InventoriesResponse;
import org.kleini.bricklink.data.Category;
import org.kleini.bricklink.data.Color;
import org.kleini.bricklink.data.Condition;
import org.kleini.bricklink.data.Inventory;
import org.kleini.bricklink.data.ItemType;
import org.kleini.brickstore.data.Item;

/**
 * {@link InventoryHelper}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class InventoryHelper {

    private final BrickLinkClient client;

    public InventoryHelper(BrickLinkClient client) {
        super();
        this.client = client;
    }

    public Item markHavingItems(Item item) throws Exception {
        InventoriesRequest request = new InventoriesRequest(ItemType.byID(item.getItemTypeID()), Status.AVAILABLE, Category.byId(item.getCategoryID()), Color.byId(item.getColorID()));
        InventoriesResponse response = client.execute(request);
        List<Inventory> list = response.getInventories();
        Inventory inventory = findMatchingItem(list, item);
        Item retval = null;
        if (null == inventory) {
            if ("X".equals(item.getStatus())) {
                item.setStatus("I");
            }
        } else {
            if (item.getPrice().compareTo(BigDecimal.ZERO) == 0) {
                item.setPrice(inventory.getPrice());
            } else {
                item.setComments(inventory.getPrice().toString());
            }
            item.setStatus("X");
            retval = new Item();
            retval.setQty(inventory.getQuantity());
            retval.setPrice(inventory.getPrice());
        }
        return retval;
    }

    private static Inventory findMatchingItem(List<Inventory> list, Item item) {
        for (Inventory inventory : list) {
            if (inventory.getItem().getIdentifier().equals(item.getItemID()) && inventory.getCondition().equals(Condition.valueOf(item.getCondition()))) {
                return inventory;
            }
        }
        return null;
    }
}
