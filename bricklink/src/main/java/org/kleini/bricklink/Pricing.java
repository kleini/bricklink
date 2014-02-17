/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.List;
import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.api.PriceGuideRequest;
import org.kleini.bricklink.api.PriceGuideResponse;
import org.kleini.bricklink.data.Condition;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.PriceGuide;
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
        URL url = Pricing.class.getClassLoader().getResource("79109.bsx");
        final BrickStoreXML brickStore = deSerializer.load(url);
        Configuration configuration = new Configuration();
        BrickLinkClient client = new BrickLinkClient(configuration);
        try {
            addMissingPrices(brickStore, client);
        } finally {
            client.close();
        }
        deSerializer.save(brickStore, new File("test.bsx"));
    }

    private static void addMissingPrices(BrickStoreXML brickStore, BrickLinkClient client) throws Exception {
        List<Item> list = brickStore.getInventory().getItem();
        for (Item item : list) {
            System.out.println(item.getColorName() + ' ' + item.getItemName());
            PriceGuideRequest request = new PriceGuideRequest(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), Condition.valueOf(item.getCondition()));
            PriceGuideResponse response = client.execute(request);
            PriceGuide guide = response.getPriceGuide();
            if (item.getPrice().compareTo(BigDecimal.ZERO) == 0) {
                item.setPrice(guide.getQuantityAveragePrice().setScale(2, RoundingMode.HALF_UP));
            }
            item.setRemarks(guide.getQuantityAveragePrice().toString());
        }
    }
}
