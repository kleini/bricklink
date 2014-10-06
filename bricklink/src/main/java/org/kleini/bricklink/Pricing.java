/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.io.File;

import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.selenium.BrickLinkSelenium;
import org.kleini.bricklink.tools.AddPrices;
import org.kleini.bricklink.tools.InventoryHelper;
import org.kleini.brickstore.BrickStoreDeSerializer;
import org.kleini.brickstore.data.BrickStoreXML;
import org.kleini.brickstore.data.Item;

/**
 * This class is a starter and should read a Brickstore file and assign prices to all parts listed there.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Pricing {

    public Pricing() {
        super();
    }

    public static void main(String[] args) throws Exception {
        BrickStoreDeSerializer deSerializer = new BrickStoreDeSerializer();
        File file = new File(args[0]);
        final BrickStoreXML brickStore = deSerializer.load(file);
        Configuration configuration = new Configuration();
        BrickLinkClient client = new BrickLinkClient(configuration);
        BrickLinkSelenium selenium = new BrickLinkSelenium(configuration);
        InventoryHelper inventoryHelper = new InventoryHelper(client);
        AddPrices prices = new AddPrices(client, selenium);
        try {
            for (Item item : brickStore.getInventory().getItem()) {
                Item having = inventoryHelper.markHavingItems(item);
                prices.addMissing(item, having);
            }
        } finally {
            selenium.close();
            client.close();
        }
        deSerializer.save(brickStore, new File(file.getParentFile(), "output.bsx"));
    }
}
