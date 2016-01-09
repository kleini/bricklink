/*
 * GPL v3
 */

package org.kleini.bricklink.selenium.data;

import java.math.BigDecimal;

/**
 * Data from the part out value page.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class PartOutData {

    private final BigDecimal value;

    public PartOutData(BigDecimal value) {
        super();
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
