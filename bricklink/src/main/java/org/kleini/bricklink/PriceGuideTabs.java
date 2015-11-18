/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.io.File;

import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.selenium.BrickLinkSelenium;
import org.kleini.brickstore.BrickStoreDeSerializer;
import org.kleini.brickstore.data.BrickStoreXML;
import org.kleini.brickstore.data.Item;

/**
 * Opens all parts of a BrickStore file in browser tabs.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class PriceGuideTabs {

    public PriceGuideTabs() {
        super();
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BrickStoreDeSerializer deSerializer = new BrickStoreDeSerializer();
        File file = new File(args[0]);
        final BrickStoreXML brickStore = deSerializer.load(file);
        Configuration configuration = new Configuration();
        BrickLinkSelenium selenium = new BrickLinkSelenium(configuration);
        int count = 0;
        for (Item item : brickStore.getInventory().getItem()) {
            selenium.openPriceGuideTab(item.getItemID(), item.getColorID());
            if (++count == 2) {
                break;
            }
        }
    }
}
