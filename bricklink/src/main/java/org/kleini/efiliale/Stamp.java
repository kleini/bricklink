/*
 * GPL v3
 */

package org.kleini.efiliale;

import java.math.BigDecimal;

/**
 * Different possible stamp values.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum Stamp {

    GROSSBRIEF(new BigDecimal("1.75"), BigDecimal.ZERO),
    MAXIBRIEF(new BigDecimal("2.70"), BigDecimal.ZERO),
    MAXIBRIEF_EINSCHREIBEN(new BigDecimal("2.70"), new BigDecimal("2.15")),
    GROSSBRIEF_INTERNATIONAL(new BigDecimal("3.75"), BigDecimal.ZERO);

    private BigDecimal postage;
    private BigDecimal insurance;

    private Stamp(BigDecimal postage, BigDecimal insurance) {
        this.postage = postage;
        this.insurance = insurance;
    }

    public static Stamp byValue(BigDecimal postage, BigDecimal insurance) throws Exception {
        for (Stamp tmp : values()) {
            if (tmp.postage.compareTo(postage) == 0 && tmp.insurance.compareTo(insurance) == 0) {
                return tmp;
            }
        }
        throw new Exception("No stamp found for postage " + postage.toString() + " and insurance " + insurance.toString());
    }
}
