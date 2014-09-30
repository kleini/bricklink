/*
 * GPL v3
 */

package org.kleini.bricklink.tools;

import static org.kleini.bricklink.tools.AddPrices.round;

import java.math.BigDecimal;

import org.kleini.bricklink.data.PriceGuide;
import org.kleini.brickstore.data.Item;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class MoreSoldThanOffered implements Determiner {

    public MoreSoldThanOffered() {
        super();
    }

    @Override
    public BigDecimal determine(Item item, PriceGuide soldGuide, PriceGuide offersGuide, PriceGuide offersDEGuide, StringBuilder remarks) throws Exception {
        double soldOffersCountRatio = ((double) soldGuide.getQuantity()) / offersGuide.getQuantity();
        if (soldOffersCountRatio > 1) {
            remarks.append("more sold than offered");
            return round(offersGuide.getDetail().get(0).getPrice()).subtract(new BigDecimal("0.01"));
        }
        return null;
    }
}
