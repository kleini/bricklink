/*
 * GPL v3
 */

package org.kleini.bricklink.tools;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.PriceGuideRequest;
import org.kleini.bricklink.data.Condition;
import org.kleini.bricklink.data.Country;
import org.kleini.bricklink.data.GuideType;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.PriceGuide;
import org.kleini.bricklink.selenium.BrickLinkSelenium;
import org.kleini.brickstore.data.Item;

/**
 * {@link AddPrices}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class AddPrices {

    private BrickLinkClient client;

    public AddPrices(BrickLinkClient client) {
        super();
        this.client = client;
    }

    public void addMissing(Item item, Item having) throws Exception {
//        System.out.print("Compare: ");
//        compare(item, selenium, client);
//        System.out.println();
        System.out.print(Condition.valueOf(item.getCondition()).toString() + ' ' + item.getColorName() + ' ' + item.getItemName());
//        BigDecimal price = determinePrice(item, selenium);
//        System.out.print(' ' + price.toString() + ' ' + item.getRemarks());
        BigDecimal price = determinePrice(item, having, client);
        System.out.println(' ' + price.toString() + ' ' + item.getRemarks());
    }

    private static void compare(Item item, BrickLinkSelenium selenium, BrickLinkClient client) throws Exception {
        PriceGuide soldGuide = selenium.getPriceGuide(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.SOLD, Condition.valueOf(item.getCondition()), true);
        PriceGuide soldGuide2 = client.execute(new PriceGuideRequest(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.SOLD, Condition.valueOf(item.getCondition()))).getPriceGuide();
        if (!soldGuide.equals(soldGuide2)) {
            System.out.print("Kaka");
        }
        PriceGuide offersGuide = selenium.getPriceGuide(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.STOCK, Condition.valueOf(item.getCondition()), true);
        PriceGuide offersGuide2 = client.execute(new PriceGuideRequest(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.STOCK, Condition.valueOf(item.getCondition()))).getPriceGuide();
        if (!offersGuide.equals(offersGuide2)) {
            System.out.print("Kaka");
        }
    }

    private static BigDecimal determinePrice(Item item, Item having, BrickLinkClient client) throws Exception {
        PriceGuide soldGuide = client.execute(new PriceGuideRequest(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.SOLD, Condition.valueOf(item.getCondition()))).getPriceGuide();
        PriceGuide offersGuide;
        try {
            offersGuide = client.execute(new PriceGuideRequest(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.STOCK, Condition.valueOf(item.getCondition()))).getPriceGuide();
        } catch (Exception e) {
            offersGuide = null;
        }
        PriceGuide offersDEGuide;
        try {
            offersDEGuide = client.execute(new PriceGuideRequest(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.STOCK, Condition.valueOf(item.getCondition()), Country.DE)).getPriceGuide();
        } catch (Exception e) {
            offersDEGuide = null;
        }
        return determinePrice(item, having, soldGuide, offersGuide, offersDEGuide);
    }

    private static BigDecimal determinePrice(Item item, Item having, PriceGuide soldGuide, PriceGuide offersGuide, PriceGuide offersDEGuide) throws Exception {
        BigDecimal averageSold = soldGuide.getQuantityAveragePrice();
        BigDecimal price = averageSold.setScale(2, RoundingMode.HALF_UP);
        StringBuilder remarks = new StringBuilder();
        remarks.append(averageSold.toString());
        remarks.append(',');
        boolean apply = false;
        for (Determiner determiner : new Determiner[] { new NoOffers(), new OnlyOneOffer(), new MoreSoldThanOffered(), new FewOffers(), new MyDEPosition() }) {
            BigDecimal retval = determiner.determine(item, having, soldGuide, offersGuide, offersDEGuide, remarks);
            if (null != retval) {
                price = retval;
                apply = true;
                break;
            }
        }
        apply(item, price, apply);
        item.setRemarks(remarks.toString());
        return price;
    }

    static BigDecimal round(BigDecimal decimal) {
        return decimal.setScale(2, RoundingMode.HALF_UP);
    }

    static void apply(Item item, BigDecimal price, boolean apply) {
        if (apply && item.getPrice().compareTo(BigDecimal.ZERO) == 0) {
            item.setPrice(price);
        } else if (item.getPrice().compareTo(price) != 0) {
            item.setComments(price.toString());
        }
    }
}
