/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link ItemMapping} represents a mapping between BrickLink items and LEGO article numbers.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class ItemMapping {

    /**
     * An object representation of the item.
     */
    private Item item;

    /**
     * An object representation of the item.
     */
    private String identifier;

    /**
     * The type of the item. Will mostly be a {@link ItemType#PART}.
     */
    private ItemType type;

    /**
     * Color of the item.
     */
    private Color color;

    /**
     * Element ID of the item in specific color.
     */
    private String elementId;

    public ItemMapping() {
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

    @JsonProperty("item.no")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("item.no")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("item.type")
    public ItemType getType() {
        return type;
    }

    @JsonProperty("item.type")
    public void setType(ItemType type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @JsonProperty("color_id")
    public void setColorId(int colorId) throws Exception {
        this.color = Color.byId(colorId);
    }

    @JsonProperty("element_id")
    public String getElementId() {
        return elementId;
    }

    @JsonProperty("element_id")
    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(item.getType().getLongId());
        sb.append(',');
        sb.append(item.getIdentifier());
        sb.append(',');
        sb.append(color.toString());
        sb.append("->");
        sb.append(elementId);
        return sb.toString();
    }
}
