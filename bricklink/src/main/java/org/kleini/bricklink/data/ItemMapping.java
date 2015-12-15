/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link ItemMapping}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class ItemMapping {

    private Item item;

    private String identifier;

    private ItemType type;

    private Color color;

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
