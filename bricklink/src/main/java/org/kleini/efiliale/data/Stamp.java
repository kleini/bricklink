/*
 * GPL v3
 */

package org.kleini.efiliale.data;

import static java.math.BigDecimal.ZERO;
import static org.kleini.efiliale.data.Domestic.INTERNATIONAL;
import static org.kleini.efiliale.data.Domestic.NATIONAL;
import static org.kleini.efiliale.data.Type.LETTER;
import static org.kleini.efiliale.data.Type.PARCEL;

import java.math.BigDecimal;

/**
 * Different possible stamp values.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum Stamp {

    KOMPAKTBRIEF(new BigDecimal("0.90"), ZERO, LETTER, NATIONAL),
    GROSSBRIEF(new BigDecimal("1.75"), ZERO, LETTER, NATIONAL),
    MAXIBRIEF(new BigDecimal("2.70"), ZERO, LETTER, NATIONAL),
    MAXIBRIEF_EINSCHREIBEN(new BigDecimal("2.70"), new BigDecimal("2.15"), LETTER, NATIONAL),
    GROSSBRIEF_INTERNATIONAL(new BigDecimal("3.75"), ZERO, LETTER, INTERNATIONAL),
    GROSSBRIEF_INTERNATIONAL_EINSCHREIBEN(new BigDecimal("3.75"), new BigDecimal("2.15"), LETTER, INTERNATIONAL),
    GROSSBRIEF_INTERNATIONAL_100EURO(new BigDecimal("3.75"), new BigDecimal("3.65"), LETTER, INTERNATIONAL),
    PAKET_2KG(new BigDecimal("5.50"), ZERO, PARCEL, NATIONAL);

    private final BigDecimal postage;
    private final BigDecimal insurance;
    private final Type type;
    private final Domestic domestic;

    private Stamp(BigDecimal postage, BigDecimal insurance, Type type, Domestic domestic) {
        this.postage = postage;
        this.insurance = insurance;
        this.type = type;
        this.domestic = domestic;
    }

    public static Stamp byValue(BigDecimal postage, BigDecimal insurance) throws Exception {
        for (Stamp tmp : values()) {
            if (tmp.postage.compareTo(postage) == 0 && tmp.insurance.compareTo(insurance) == 0) {
                return tmp;
            }
        }
        throw new Exception("No stamp found for postage " + postage.toString() + " and insurance " + insurance.toString());
    }

    public Type getType() {
        return type;
    }

    public Domestic getDomestic() {
        return domestic;
    }
}
