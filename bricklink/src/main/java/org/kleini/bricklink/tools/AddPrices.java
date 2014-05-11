/*
 * GPL v3
 */

package org.kleini.bricklink.tools;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.PriceGuideRequest;
import org.kleini.bricklink.data.Condition;
import org.kleini.bricklink.data.Country;
import org.kleini.bricklink.data.GuideType;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.PriceDetail;
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
    private final BrickLinkSelenium selenium;

    public AddPrices(BrickLinkClient client, BrickLinkSelenium selenium) {
        super();
        this.client = client;
        this.selenium = selenium;
    }

    public void addMissing(Item item) throws Exception {
//        System.out.print("Compare: ");
//        compare(item, selenium, client);
//        System.out.println();
        System.out.print(Condition.valueOf(item.getCondition()).toString() + ' ' + item.getColorName() + ' ' + item.getItemName());
//        BigDecimal price = determinePrice(item, selenium);
//        System.out.print(' ' + price.toString() + ' ' + item.getRemarks());
        BigDecimal price = determinePrice(item, client);
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

    private static BigDecimal determinePrice(Item item, BrickLinkSelenium selenium) throws Exception {
        PriceGuide soldGuide = selenium.getPriceGuide(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.SOLD, Condition.valueOf(item.getCondition()), false);
        List<PriceDetail> offersDE;
        try {
            PriceGuide offersGuide = selenium.getPriceGuide(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.STOCK, Condition.valueOf(item.getCondition()), true);
            offersDE = PriceGuideTools.extract(offersGuide.getDetail(), Country.DE);
            if (offersDE.isEmpty()) {
                offersDE = offersGuide.getDetail();
            }
        } catch (Exception e) {
            offersDE = Collections.emptyList();
        }
        return determinePrice(item, soldGuide, offersDE);
    }

    private static BigDecimal determinePrice(Item item, BrickLinkClient client) throws Exception {
        PriceGuide soldGuide = client.execute(new PriceGuideRequest(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.SOLD, Condition.valueOf(item.getCondition()))).getPriceGuide();
        List<PriceDetail> offersDE;
        try {
            PriceGuide offersGuide = client.execute(new PriceGuideRequest(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.STOCK, Condition.valueOf(item.getCondition()), Country.DE)).getPriceGuide();
            offersDE = offersGuide.getDetail();
            if (offersDE.isEmpty()) {
                offersGuide = client.execute(new PriceGuideRequest(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.STOCK, Condition.valueOf(item.getCondition()))).getPriceGuide();
                offersDE = offersGuide.getDetail();
            }
        } catch (Exception e) {
            offersDE = Collections.emptyList();
        }
        return determinePrice(item, soldGuide, offersDE);
    }

    private static BigDecimal determinePrice(Item item, PriceGuide soldGuide, List<PriceDetail> offersDE) throws Exception {
        BigDecimal averageSold = soldGuide.getQuantityAveragePrice();
        BigDecimal price = averageSold.setScale(2, RoundingMode.HALF_UP);
        StringBuilder remarks = new StringBuilder();
        remarks.append(averageSold.toString());
        remarks.append(',');
        boolean apply = false;
        if (offersDE.isEmpty()) {
            remarks.append(PriceGuideTools.getMyPosition(item.getQty(), price, offersDE) + 1);
            remarks.append(" of ");
            remarks.append(offersDE.size());
            apply = true;
        } else if (offersDE.size() <= 5) {
            PriceDetail lowDetail = offersDE.get(0);
            PriceDetail highDetail = offersDE.get(offersDE.size() - 1);
            remarks.append(lowDetail.getPrice());
            remarks.append(',');
            remarks.append(highDetail.getPrice());
            remarks.append(',');
            remarks.append(PriceGuideTools.getMyPosition(item.getQty(), price, offersDE) + 1);
            remarks.append(" of ");
            remarks.append(offersDE.size());
            apply = true;
        } else {
            BigDecimal lowPrice = offersDE.get(3).getPrice();
            BigDecimal highPrice = offersDE.get(Math.min(offersDE.size() - 1, 9)).getPrice();
            remarks.append(lowPrice);
            remarks.append(',');
            remarks.append(highPrice);
            remarks.append(',');
            int myPos = PriceGuideTools.getMyPosition(item.getQty(), price, offersDE);
            remarks.append(myPos + 1);
            if (myPos < 3 || myPos > 9) {
                if (myPos < 3) {
                    price = lowPrice.setScale(2, RoundingMode.UP);
                }
                if (myPos > 9) {
                    price = highPrice.setScale(2, RoundingMode.DOWN);
                }
                myPos = PriceGuideTools.getMyPosition(item.getQty(), price, offersDE);
                remarks.append(',');
                remarks.append(myPos + 1);
            }
            apply = myPos >= 3 && myPos <= 9;
        }
        if (apply && item.getPrice().compareTo(BigDecimal.ZERO) == 0) {
            item.setPrice(price);
        } else if (item.getPrice().compareTo(price) != 0) {
            item.setComments(price.toString());
        }
        item.setRemarks(remarks.toString());
        return price;
    }
}
