/*
 * GPL v3
 */

package org.kleini.bricklink.tools;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

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

    private final BrickLinkSelenium selenium;

    public AddPrices(BrickLinkSelenium selenium) {
        super();
        this.selenium = selenium;
    }

    public void addMissing(Item item) throws Exception {
        long start = System.currentTimeMillis();
        determinePrice(item, selenium);
        System.out.println("Time: " + ((System.currentTimeMillis() - start)/1000));
    }

    private static void determinePrice(Item item, BrickLinkSelenium selenium) throws Exception {
        System.out.print(item.getColorName() + ' ' + item.getItemName());
        PriceGuide soldGuide = selenium.getPriceGuide(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.SOLD, Condition.valueOf(item.getCondition()), false);
        BigDecimal averageSold = soldGuide.getQuantityAveragePrice();
        StringBuilder remarks = new StringBuilder();
        remarks.append(averageSold.toString());
        remarks.append(',');
        BigDecimal price = averageSold.setScale(2, RoundingMode.HALF_UP);
        PriceGuide offersGuide = selenium.getPriceGuide(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.STOCK, Condition.valueOf(item.getCondition()), true);
        List<PriceDetail> offersDE = PriceGuideTools.extract(offersGuide.getDetail(), Country.DE);
        if (offersDE.isEmpty()) {
            offersDE = offersGuide.getDetail();
        }
        boolean apply = false;
        if (offersDE.size() <= 5) {
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
        System.out.println(' ' + price.toString() + ' ' + remarks.toString());
    }
}
