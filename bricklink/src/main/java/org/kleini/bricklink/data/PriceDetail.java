/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link PriceDetail}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
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

    @JsonProperty("qunatity")
    public int getQuantity() {
        return quantity;
    }

    @JsonProperty("qunatity")
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
}
