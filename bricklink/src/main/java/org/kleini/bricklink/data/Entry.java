/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Entry}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class Entry {

    /**
     * An object representation of the item that is included in the specified item
     */
    private Item item;

    /**
     * The ID of the color of the item
     */
    private Color color;

    /**
     * The number of items that are included in
     */
    private int quantity;

    /**
     * The number of items that are appear as "extra" item
     */
    private int extraQuantity;

    /**
     * Indicates that the item is appear as "alternate" item in this specified item
     */
    private boolean alternate;

    public Entry() {
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @JsonProperty("color_id")
    public void setColorID(int colorId) throws Exception {
        this.color = Color.byId(colorId);
    }

    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("extra_quantity")
    public int getExtraQuantity() {
        return extraQuantity;
    }

    @JsonProperty("extra_quantity")
    public void setExtraQuantity(int extraQuantity) {
        this.extraQuantity = extraQuantity;
    }

    @JsonProperty("is_alternate")
    public boolean isAlternate() {
        return alternate;
    }

    @JsonProperty("is_alternate")
    public void setAlternate(boolean alternate) {
        this.alternate = alternate;
    }

    @Override
    public String toString() {
        return "Entry [" + quantity + '+' + extraQuantity + ' ' + color + ' ' + item + ',' + alternate + ']';
    }
}
