//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.17 at 10:55:44 AM CET 
//

package org.kleini.brickstore.data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * {@link Item} of the BrickStore file.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemID",
    "itemTypeID",
    "colorID",
    "itemName",
    "itemTypeName",
    "colorName",
    "categoryID",
    "categoryName",
    "status",
    "quantity",
    "price",
    "condition",
    "remarks",
    "bulk",
    "originalPrice",
    "originalQuantity"
})
@XmlRootElement(name = "Item")
public class Item {

    @XmlElement(name = "ItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String itemID;

    @XmlElement(name = "ItemTypeID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String itemTypeID;

    @XmlElement(name = "ColorID", required = true)
    protected int colorID;

    @XmlElement(name = "ItemName", required = true)
    protected String itemName;

    @XmlElement(name = "ItemTypeName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String itemTypeName;

    @XmlElement(name = "ColorName", required = true)
    protected String colorName;

    @XmlElement(name = "CategoryID", required = true)
    protected int categoryID;

    @XmlElement(name = "CategoryName", required = true)
    protected String categoryName;

    @XmlElement(name = "Status", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String status;

    @XmlElement(name = "Qty", required = true)
    protected int quantity;

    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;

    @XmlElement(name = "Condition", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String condition;

    @XmlElement(name = "Remarks")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String remarks;

    @XmlElement(name = "Bulk")
    protected int bulk;

    @XmlElement(name = "OrigPrice")
    protected BigDecimal originalPrice;

    @XmlElement(name = "OrigQty", required = true)
    protected int originalQuantity;

    public Item() {
        super();
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemTypeID() {
        return itemTypeID;
    }

    public void setItemTypeID(String itemTypeID) {
        this.itemTypeID = itemTypeID;
    }

    public int getColorID() {
        return colorID;
    }

    public void setColorID(int colorID) {
        this.colorID = colorID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQty() {
        return quantity;
    }

    public void setQty(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getBulk() {
        return bulk;
    }

    public void setBulk(int bulk) {
        this.bulk = bulk;
    }

    public BigDecimal getOrigPrice() {
        return originalPrice;
    }

    public void setOrigPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public int getOrigQty() {
        return originalQuantity;
    }

    public void setOrigQty(int originalQuantity) {
        this.originalQuantity = originalQuantity;
    }
}