/*
 * GPL v3
 */

package org.kleini.bricklink.tools;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.kleini.bricklink.data.PriceDetail;
import org.kleini.bricklink.data.PriceGuide;
import org.kleini.brickstore.data.Item;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class MyDEPosition implements Determiner {

    public MyDEPosition() {
        super();
    }

    @Override
    public BigDecimal determine(Item item, Item having, PriceGuide soldGuide, PriceGuide offersGuide, PriceGuide offersDEGuide, StringBuilder remarks) throws Exception {
        List<PriceDetail> offers = offersDEGuide.getDetail();
        if (offers.isEmpty()) {
            offers = offersGuide.getDetail();
        }
        BigDecimal lowPrice = minimum(item, having, offers);
        BigDecimal highPrice = offers.get(Math.min(offers.size() - 1, 9)).getPrice();
        remarks.append(lowPrice);
        remarks.append(',');
        remarks.append(highPrice);
        remarks.append(',');
        BigDecimal quantityAveragePrice = AddPrices.round(soldGuide.getQuantityAveragePrice());
        BigDecimal price = quantityAveragePrice;
        int myPos = PriceGuideTools.getMyPosition(item.getQty(), price, offers);
        remarks.append(myPos + 1);
        if (myPos < 3 || myPos > 9) {
            if (myPos < 3) {
                price = lowPrice.setScale(2, RoundingMode.UP);
            }
            if (myPos > 9) {
                price = highPrice.setScale(2, RoundingMode.DOWN);
            }
            myPos = PriceGuideTools.getMyPosition(item.getQty(), price, offers);
            remarks.append(',');
            remarks.append(myPos + 1);
        }
        if ((myPos >= 3 && myPos <= 9) || lowPrice.setScale(2, RoundingMode.UP).equals(highPrice.setScale(2, RoundingMode.DOWN))) {
            return price;
        }
        return null;
    }

    private BigDecimal minimum(Item item, Item having, List<PriceDetail> offers) {
        BigDecimal retval = offers.get(3).getPrice();
        for (int i = 0; i <= 3; i++) {
            PriceDetail detail = offers.get(i);
            retval = detail.getPrice();
            if (sumQuantity(item, having) < detail.getQuantity()) {
                // TODO apply
                break;
            }
        }
        return retval;
    }

    private int sumQuantity(Item item, Item having) {
        int retval = item.getQty();
        if (null != having) {
            retval += having.getQty();
        }
        return retval;
    }
}
