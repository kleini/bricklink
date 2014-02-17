/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Item} An object representation of the item
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class Item {

    /**
     * Item's identification number in BL catalog
     */
    private String identifier;

    /**
     * The type of the item
     */
    private ItemType type;

    public Item() {
        super();
    }

    @JsonProperty("no")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("no")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("type")
    public ItemType getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(ItemType type) {
        this.type = type;
    }
}
