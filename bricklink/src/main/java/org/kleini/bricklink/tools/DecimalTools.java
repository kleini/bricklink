/*
 * GPLv3
 */

package org.kleini.bricklink.tools;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * {@link DecimalTools}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class DecimalTools {

    private DecimalTools() {
        super();
    }

    public static BigDecimal getAverage(BigDecimal... values) {
        BigDecimal sum = new BigDecimal(0);
        int scale = 0;
        for (BigDecimal value : values) {
            scale = Math.max(scale, value.scale());
            sum = sum.add(value);
        }
        return sum.divide(new BigDecimal(values.length), scale, RoundingMode.HALF_UP);
    }

    public static BigDecimal round(BigDecimal decimal) {
        return decimal.setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal round(BigDecimal decimal, int newScale) {
        return decimal.setScale(newScale, RoundingMode.HALF_UP);
    }

    public static int compareMinScale(BigDecimal decimal1, BigDecimal decimal2) {
        int scale = Math.min(decimal1.scale(), decimal2.scale());
        return round(decimal1, scale).compareTo(round(decimal2, scale));
    }
}
