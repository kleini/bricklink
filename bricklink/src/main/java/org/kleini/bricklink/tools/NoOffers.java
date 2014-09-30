/*
 * GPL v3
 */

package org.kleini.bricklink.tools;

import static org.kleini.bricklink.tools.AddPrices.round;

import java.math.BigDecimal;

import org.kleini.bricklink.data.PriceGuide;
import org.kleini.brickstore.data.Item;

/**
 * Nobody offers the part. We need to determine the price in a different way.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class NoOffers implements Determiner {

    public NoOffers() {
        super();
    }

    @Override
    public BigDecimal determine(Item item, PriceGuide soldGuide, PriceGuide offersGuide, PriceGuide offersDEGuide, StringBuilder remarks) {
        if (offersGuide.getDetail().isEmpty()) {
            remarks.append("no offers");
            return round(soldGuide.getQuantityAveragePrice());
        }
        return null;
    }
}
