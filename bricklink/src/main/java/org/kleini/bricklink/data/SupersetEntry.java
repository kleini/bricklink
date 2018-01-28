/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link SupersetEntry}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class SupersetEntry {

    private Item item;
    private int quantity;
    private AppearAs appearAs;

    public SupersetEntry() {
        super();
    }

    @JsonProperty("item")
    public Item getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(Item item) {
        this.item = item;
    }

    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("appears_as")
    public AppearAs getAppearAs() {
        return appearAs;
    }

    @JsonProperty("appears_as")
    public void setAppearAs(AppearAs appearAs) {
        this.appearAs = appearAs;
    }

    @Override
    public String toString() {
        return appearAs + " " + quantity + " " + item;
    }
}
