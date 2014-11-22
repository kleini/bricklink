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
     * Item's identification number in BrickLink catalog
     */
    private String identifier;

    /**
     * The name of this item
     */
    private String name;

    /**
     * The type of the item
     */
    private ItemType type;

    /**
     * The main category of the item
     */
    private Category category;

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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public ItemType getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(ItemType type) {
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("category_id")
    public void setCategoryById(int identifier) throws Exception {
        this.category = Category.byId(identifier);
    }

    @Override
    public String toString() {
        return name + '(' + identifier + ')';
    }
}
