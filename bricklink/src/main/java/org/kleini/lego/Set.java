/*
 * GPL v3
 */

package org.kleini.lego;

import java.math.BigDecimal;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class Set {

    private final int identifier;
    private String name;
    private BigDecimal retailPrice;

    public Set(int identifier) {
        super();
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getIdentifier() {
        return identifier;
    }
}
