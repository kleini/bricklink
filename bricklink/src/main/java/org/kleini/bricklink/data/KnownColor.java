/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link KnownColor}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class KnownColor {

    private Color color;
    private int quantity;

    KnownColor() {
        super();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @JsonProperty("color_id")
    public void setColor(int identifier) throws Exception {
        this.color = Color.byId(identifier);
    }

    public int getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}