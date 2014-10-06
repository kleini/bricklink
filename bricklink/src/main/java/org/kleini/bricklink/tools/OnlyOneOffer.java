/*
 * GPL v3
 */

package org.kleini.bricklink.tools;

import java.math.BigDecimal;

import org.kleini.bricklink.data.PriceGuide;
import org.kleini.brickstore.data.Item;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class OnlyOneOffer implements Determiner {

    public OnlyOneOffer() {
        super();
    }

    @Override
    public BigDecimal determine(Item item, Item having, PriceGuide soldGuide, PriceGuide offersGuide, PriceGuide offersDEGuide, StringBuilder remarks) throws Exception {
        if (offersGuide.getUnits() == 1) {
            remarks.append("only one offer");
            return AddPrices.round(offersGuide.getQuantityAveragePrice()).subtract(new BigDecimal("0.01"));
        }
        return null;
    }
}
