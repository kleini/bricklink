/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.data.Condition;
import org.kleini.bricklink.data.Country;
import org.kleini.bricklink.data.GuideType;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.PriceDetail;
import org.kleini.bricklink.data.PriceGuide;
import org.kleini.bricklink.selenium.BrickLinkSelenium;
import org.kleini.bricklink.tools.PriceGuideTools;
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
        BrickLinkSelenium selenium = new BrickLinkSelenium(configuration);
        try {
            addMissingPrices(brickStore, selenium);
        } finally {
            selenium.close();
        }
        deSerializer.save(brickStore, new File(file.getParentFile(), "output.bsx"));
    }

    private static void addMissingPrices(BrickStoreXML brickStore, BrickLinkSelenium selenium) throws Exception {
        List<Item> list = brickStore.getInventory().getItem();
        for (Item item : list) {
            long start = System.currentTimeMillis();
            determinePrice(item, selenium);
            System.out.println("" + ((System.currentTimeMillis() - start)/1000));
        }
    }

    private static void determinePrice(Item item, BrickLinkSelenium selenium) throws Exception {
        System.out.print(item.getColorName() + ' ' + item.getItemName());
        PriceGuide guide = selenium.getPriceGuide(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.SOLD, Condition.valueOf(item.getCondition()), false);
        BigDecimal averageSold = guide.getQuantityAveragePrice();
        StringBuilder remarks = new StringBuilder();
        remarks.append(averageSold.toString());
        remarks.append(',');
        BigDecimal price = averageSold.setScale(2, RoundingMode.HALF_UP);
        PriceGuide guideDE = selenium.getPriceGuide(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.STOCK, Condition.valueOf(item.getCondition()), true);
        List<PriceDetail> offersDE = PriceGuideTools.extract(guideDE.getDetail(), Country.DE);
        boolean apply = false;
        if (offersDE.size() <= 5) {
            remarks.append(PriceGuideTools.getMyPosition(item.getQty(), price, offersDE) + 1);
            remarks.append(',');
            remarks.append(offersDE.size());
            apply = true;
        } else {
            PriceDetail lowDetail = offersDE.get(2);
            PriceDetail highDetail = offersDE.get(Math.min(offersDE.size() - 1, 9));
            apply = lowDetail.getPrice().compareTo(price) == -1 && highDetail.getPrice().compareTo(price) == 1;
            remarks.append(lowDetail.getPrice());
            remarks.append(',');
            remarks.append(highDetail.getPrice());
            remarks.append(',');
            remarks.append(PriceGuideTools.getMyPosition(item.getQty(), price, offersDE) + 1);
        }
        if (apply && item.getPrice().compareTo(BigDecimal.ZERO) == 0) {
            item.setPrice(price);
        } else {
            item.setComments(price.toString());
        }
        item.setRemarks(remarks.toString());
        System.out.println(' ' + price.toString() + ' ' + remarks.toString());
    }
}
