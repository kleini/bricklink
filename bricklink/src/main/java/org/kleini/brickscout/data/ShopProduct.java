/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import java.util.List;

import org.springframework.hateoas.Resources;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link ShopProduct}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
@JsonIgnoreProperties({"bulky","bestseller","highlighted","boundingBox","weightInGram"})
public class ShopProduct extends Resources<CatalogItem> {

    private String shopProductUUID;
    private List<ShopItem> shopItems;

    public ShopProduct() {
        super();
    }

    @JsonProperty("shopProductUUID")
    public String getShopProductUUID() {
        return shopProductUUID;
    }

    @JsonProperty("shopProductUUID")
    public void setShopProductUUID(String shopProductUUID) {
        this.shopProductUUID = shopProductUUID;
    }

    @JsonProperty("shopItems")
    public List<ShopItem> getShopItems() {
        return shopItems;
    }

    @JsonProperty("shopItems")
    public void setShopItems(List<ShopItem> shopItems) {
        this.shopItems = shopItems;
    }
}
