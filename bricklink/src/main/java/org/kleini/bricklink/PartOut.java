/*
 * GPLv3
 */

package org.kleini.bricklink;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.api.SubsetsRequest;
import org.kleini.bricklink.api.SubsetsResponse;
import org.kleini.bricklink.data.Condition;
import org.kleini.bricklink.data.Entry;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.Subset;
import org.kleini.brickstore.BrickStoreDeSerializer;
import org.kleini.brickstore.data.BrickStoreXML;
import org.kleini.brickstore.data.Inventory;
import org.kleini.brickstore.data.Item;

/**
 * {@link PartOut}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class PartOut {

    public PartOut() {
        super();
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println(PartOut.class.getName() + " setId <multiplier>");
            System.exit(1);
        }
        int multiplier = 1;
        if (args.length > 1) {
            multiplier = Integer.parseInt(args[1]);
        }
        String itemID = args[0];
        Configuration configuration = new Configuration();
        BrickLinkClient client = new BrickLinkClient(configuration);
        List<Item> items = new LinkedList<Item>();
        try {
            SubsetsResponse response = client.execute(new SubsetsRequest(ItemType.SET, args[0]));
            for (Subset subset : response.getSubsets()) {
                System.out.println(subset);
                boolean counterParts = subset.getEntries().size() > 1;
                for (Entry entry : subset.getEntries()) {
                    Item item = new Item();
                    item.setStatus("I");
                    item.setItemID(entry.getItem().getIdentifier());
                    item.setItemName(entry.getItem().getName());
                    item.setItemTypeID(entry.getItem().getType().getId());
                    item.setItemTypeName(entry.getItem().getType().name());
                    item.setCategoryID(entry.getItem().getCategory().getIdentifier());
                    item.setCategoryName(entry.getItem().getCategory().getName());
                    item.setColorID(entry.getColor().getIdentifier());
                    item.setColorName(entry.getColor().getName());
                    item.setQty(entry.getQuantity() * multiplier);
                    item.setCondition(Condition.N.name());
                    if (counterParts) {
                        item.setComments("" + subset.getIdentifier() + ',' + entry.isAlternate());
                    }
                    items.add(item);
                    if (entry.getExtraQuantity() > 0) {
                        if (entry.getQuantity() == entry.getExtraQuantity()) {
                            // Part is only an extra part
                            item.setStatus("E");
                        } else {
                            item = item.clone();
                            item.setQty(entry.getExtraQuantity() * multiplier);
                            item.setStatus("E");
                            items.add(item);
                        }
                    }
                }
            }
        } finally {
            client.close();
        }
        BrickStoreXML brickStore = new BrickStoreXML();
        Inventory inventory = new Inventory();
        brickStore.setInventory(inventory);
        inventory.setItem(items);
        BrickStoreDeSerializer deSerializer = new BrickStoreDeSerializer();
        deSerializer.save(brickStore, new File(itemID + ".bsx"));
    }
}
