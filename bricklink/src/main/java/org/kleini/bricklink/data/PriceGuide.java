/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link PriceGuide}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class PriceGuide {

    /**
     * An object representation of the item.
     */
    private Item item;

    /**
     * Indicates whether the price guide is for new or used
     */
    private Condition newOrUsed;

    /**
     * The currency code of the price
     */
    private Currency currency;

    /**
     * The lowest price of the item (in stock / that was sold for last 6 months )
     */
    private BigDecimal minPrice;

    /**
     * The highest price of the item (in stock / that was sold for last 6 months )
     */
    private BigDecimal maxPrice;

    /**
     * The average price of the item (in stock / that was sold for last 6 months )
     */
    private BigDecimal averagePrice;

    /**
     * The average price of the item (in stock / that was sold for last 6 months ) by quantity
     */
    private BigDecimal quantityAveragePrice;

    /**
     * The number of times the item has been sold for last 6 months
     * The number of inventories that include the item
     */
    private int units;

    /**
     * The number of items has been sold for last 6 months
     * The total number of the items in stock
     */
    private int quantity;

    private List<PriceDetail> detail;

    public PriceGuide() {
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

    @JsonProperty("new_or_used")
    public Condition getNewOrUsed() {
        return newOrUsed;
    }

    @JsonProperty("new_or_used")
    public void setNewOrUsed(Condition newOrUsed) {
        this.newOrUsed = newOrUsed;
    }

    @JsonProperty("currency_code")
    public Currency getCurrency() {
        return currency;
    }

    @JsonProperty("currency_code")
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @JsonProperty("min_price")
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    @JsonProperty("min_price")
    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    @JsonProperty("max_price")
    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    @JsonProperty("max_price")
    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    @JsonProperty("avg_price")
    public BigDecimal getAveragePrice() {
        return averagePrice;
    }

    @JsonProperty("avg_price")
    public void setAveragePrice(BigDecimal averagePrice) {
        this.averagePrice = averagePrice;
    }

    @JsonProperty("qty_avg_price")
    public BigDecimal getQuantityAveragePrice() {
        return quantityAveragePrice;
    }

    @JsonProperty("qty_avg_price")
    public void setQuantityAveragePrice(BigDecimal quantityAveragePrice) {
        this.quantityAveragePrice = quantityAveragePrice;
    }

    @JsonProperty("unit_quantity")
    public int getUnits() {
        return units;
    }

    @JsonProperty("unit_quantity")
    public void setUnits(int units) {
        this.units = units;
    }

    @JsonProperty("total_quantity")
    public int getQuantity() {
        return quantity;
    }

    @JsonProperty("total_quantity")
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("price_detail")
    public List<PriceDetail> getDetail() {
        return detail;
    }

    @JsonProperty("price_detail")
    public void setDetail(List<PriceDetail> detail) {
        this.detail = detail;
    }
}
