/*
 * GPL v3
 */

package org.kleini.bricklink.selenium.data;

import java.math.BigDecimal;

import org.kleini.bricklink.data.ItemType;

/**
 * Data from the part out value page.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class PartOutData {

    private final BigDecimal value;
    private final ItemType type;

    public PartOutData(BigDecimal value, ItemType type) {
        super();
        this.value = value;
        this.type = type;
    }

    public BigDecimal getValue() {
        return value;
    }

    public ItemType getType() {
        return type;
    }
}
