/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Item} An object representation of the item
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
@JsonIgnoreProperties({"thumbnail_url", "weight", "dim_x", "dim_y", "dim_z", "year_released", "description", "is_obsolete", "alternate_no"})
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
     * Image link for this item
     */
    private String imageUrl;

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

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (identifier == null) {
            if (other.identifier != null)
                return false;
        } else if (!identifier.equals(other.identifier))
            return false;
        if (type != other.type)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    }
}
