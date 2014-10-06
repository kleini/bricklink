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
interface Determiner {

    BigDecimal determine(Item item, Item having, PriceGuide soldGuide, PriceGuide offersGuide, PriceGuide offersDEGuide, StringBuilder remarks) throws Exception;

}
