/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import java.math.BigDecimal;
import java.util.Date;
import org.kleini.address.Country;
import org.kleini.bricklink.tools.DecimalTools;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link PriceDetail}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
@JsonIgnoreProperties({"qunatity"})
public final class PriceDetail {

    /**
     * The number of the items in the inventory
     */
    private int quantity;

    /**
     * The original price of this item per sale unit
     */
    private BigDecimal price;

    /**
     * Indicates whether or not the seller ships to your country(based on the user profile)
     */
    private boolean shippingAvailable;

    /**
     * The country code of the seller's location
     */
    private Country sellerCountry;

    private String store;

    /**
     * The country code of the buyer's location
     */
    private Country buyerCountry;

    /**
     * The time the order was created
     */
    private Date ordered;

    public PriceDetail() {
        super();
    }

    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("unit_price")
    public BigDecimal getPrice() {
        return price;
    }

    @JsonProperty("unit_price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @JsonProperty("shipping_available")
    public boolean getShippingAvailable() {
        return shippingAvailable;
    }

    @JsonProperty("shipping_available")
    public void setShippingAvailable(boolean shippingAvailable) {
        this.shippingAvailable = shippingAvailable;
    }

    @JsonProperty("seller_country_code")
    public Country getSellerCountry() {
        return sellerCountry;
    }

    @JsonProperty("seller_country_code")
    public void setSellerCountry(Country sellerCountry) {
        this.sellerCountry = sellerCountry;
    }

    @JsonProperty("store_name")
    public String getStore() {
        return store;
    }

    @JsonProperty("store_name")
    public void setStore(String store) {
        this.store = store;
    }

    @JsonProperty("buyer_country_code")
    public Country getBuyerCountry() {
        return buyerCountry;
    }

    @JsonProperty("buyer_country_code")
    public void setBuyerCountry(Country buyerCountry) {
        this.buyerCountry = buyerCountry;
    }

    @JsonProperty("date_ordered")
    public Date getOrdered() {
        return ordered;
    }

    @JsonProperty("date_ordered")
    public void setOrdered(Date ordered) {
        this.ordered = ordered;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((buyerCountry == null) ? 0 : buyerCountry.hashCode());
        result = prime * result + ((ordered == null) ? 0 : ordered.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + quantity;
        result = prime * result
                + ((sellerCountry == null) ? 0 : sellerCountry.hashCode());
        result = prime * result + (shippingAvailable ? 1231 : 1237);
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
        PriceDetail other = (PriceDetail) obj;
//        if (buyerCountry != other.buyerCountry)
//            return false;
//        if (ordered == null) {
//            if (other.ordered != null)
//                return false;
//        } else if (!ordered.equals(other.ordered))
//            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (0 != DecimalTools.compareMinScale(price, other.price))
            return false;
        if (quantity != other.quantity)
            return false;
//        if (sellerCountry != other.sellerCountry)
//            return false;
//        if (shippingAvailable != other.shippingAvailable)
//            return false;
        return true;
    }
}
