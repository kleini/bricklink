/*
 * GPL v3
 */

package org.kleini.bricklink.tools;

import static org.kleini.bricklink.tools.AddPrices.round;

import java.math.BigDecimal;
import java.util.List;

import org.kleini.bricklink.data.PriceDetail;
import org.kleini.bricklink.data.PriceGuide;
import org.kleini.brickstore.data.Item;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class FewOffers implements Determiner {

    public FewOffers() {
        super();
    }

    @Override
    public BigDecimal determine(Item item, Item having, PriceGuide soldGuide, PriceGuide offersGuide, PriceGuide offersDEGuide, StringBuilder remarks) throws Exception {
        List<PriceDetail> offers = offersDEGuide.getDetail();
        if (offers.isEmpty()) {
            offers = offersGuide.getDetail();
        }
        if (offers.size() <= 5) {
            PriceDetail lowDetail = offers.get(0);
            PriceDetail highDetail = offers.get(offers.size() - 1);
            remarks.append(lowDetail.getPrice());
            remarks.append(',');
            remarks.append(highDetail.getPrice());
            remarks.append(',');
            BigDecimal price = round(soldGuide.getQuantityAveragePrice());
            remarks.append(PriceGuideTools.getMyPosition(item.getQty(), price, offers) + 1);
            remarks.append(" of ");
            remarks.append(offers.size() + 1);
            return price;
        }
        return null;
    }

}
