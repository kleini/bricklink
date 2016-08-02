/*
 * GPL v3
 */

package org.kleini.bricklink.data;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Inventory}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
@JsonIgnoreProperties({"color_name","my_weight","tier_quantity1","tier_quantity2","tier_quantity3","tier_price1","tier_price2","tier_price3"})
public final class Inventory {

    /**
     * The ID of the inventory
     */
    private int identifier;

    /**
     * An object representation of the item
     */
    private Item item;

    /**
     * The color of the item
     */
    private Color color;

    /**
     * The number of items included in this inventory
     */
    private int quantity;

    /**
     * Indicates whether the item is new or used
     */
    private Condition condition;

    /**
     * Indicates whether the set is complete or incomplete
     * (This value is valid only for SET type)
     */
    private Completeness completeness;

    /**
     * The original price of this item per sale unit
     */
    private BigDecimal price;

    /**
     * The ID of the parent lot that this lot is bound to
     */
    private int bindId;

    /**
     * A short description for this inventory
     */
    private String description;

    /**
     * User remarks on this inventory
     */
    private String remarks;

    /**
     * Buyers can buy this item only in multiples of the bulk amount
     */
    private int bulk;

    /**
     * Indicates whether the item retains in inventory after it is sold out
     */
    private boolean retain;

    /**
     * Indicates whether the item appears only in owner’s inventory
     */
    private boolean stockRoom;

    /**
     * Indicates the stockroom that the item to be placed when the user uses multiple stockroom
     */
    private String stockRoomId;

    /**
     * Sale value to adjust item price.
     * Must be less than 100. 20 for 20% sale.
     */
    private int saleRate;

    /**
     * The time this lot is created
     */
    private Date created;

    /**
     * My Cost value to tracking the cost of item.
     */
    private BigDecimal cost;

    public Inventory() {
        super();
    }

    @JsonProperty("inventory_id")
    public int getIdentifier() {
        return identifier;
    }

    @JsonProperty("inventory_id")
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("item")
    public Item getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(Item item) {
        this.item = item;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @JsonProperty("color_id")
    public void setColorID(int colorId) throws Exception {
        this.color = Color.byId(colorId);
    }

    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("new_or_used")
    public Condition getCondition() {
        return condition;
    }

    @JsonProperty("new_or_used")
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Completeness getCompleteness() {
        return completeness;
    }

    public void setCompleteness(Completeness completeness) {
        this.completeness = completeness;
    }

    @JsonProperty("completeness")
    public void setCompleteness(char identifier) throws Exception {
        this.completeness = Completeness.byId(identifier);
    }

    @JsonProperty("unit_price")
    public BigDecimal getPrice() {
        return price;
    }

    @JsonProperty("unit_price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @JsonProperty("bind_id")
    public int getBindId() {
        return bindId;
    }

    @JsonProperty("bind_id")
    public void setBindId(int bindId) {
        this.bindId = bindId;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @JsonProperty("bulk")
    public int getBulk() {
        return bulk;
    }

    @JsonProperty("bulk")
    public void setBulk(int bulk) {
        this.bulk = bulk;
    }

    @JsonProperty("is_retain")
    public boolean isRetain() {
        return retain;
    }

    @JsonProperty("is_retain")
    public void setRetain(boolean retain) {
        this.retain = retain;
    }

    @JsonProperty("is_stock_room")
    public boolean isStockRoom() {
        return stockRoom;
    }

    @JsonProperty("is_stock_room")
    public void setStockRoom(boolean stockRoom) {
        this.stockRoom = stockRoom;
    }

    @JsonProperty("stock_room_id")
    public String getStockRoomId() {
        return stockRoomId;
    }

    @JsonProperty("stock_room_id")
    public void setStockRoomId(String stockRoomId) {
        this.stockRoomId = stockRoomId;
    }

    @JsonProperty("sale_rate")
    public int getSaleRate() {
        return saleRate;
    }

    @JsonProperty("sale_rate")
    public void setSaleRate(int saleRate) {
        this.saleRate = saleRate;
    }

    @JsonProperty("date_created")
    public Date getCreated() {
        return created;
    }

    @JsonProperty("date_created")
    public void setCreated(Date created) {
        this.created = created;
    }

    @JsonProperty("my_cost")
    public BigDecimal getCost() {
        return cost;
    }

    @JsonProperty("my_cost")
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Inventory [identifier=" + identifier + ", item=" + item + ", color=" + color + ", quantity=" + quantity + ", condition=" + condition + ", price=" + price + ", bulk=" + bulk + ", retain=" + retain + ", stockRoom=" + stockRoom + ", stockRoomId=" + stockRoomId + ", created=" + created + "]";
    }
}
