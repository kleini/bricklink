/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import java.util.List;
import org.springframework.hateoas.ResourceSupport;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link ShopProduct2}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class ShopProduct2 {

    private String shopProductUUID;
    private List<ShopItem2> shopItems;

    public ShopProduct2() {
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
    public List<ShopItem2> getShopItems() {
        return shopItems;
    }

    @JsonProperty("shopItems")
    public void setShopItems(List<ShopItem2> shopItems) {
        this.shopItems = shopItems;
    }
}
