
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Basis Typ für Warenkorb-Items
 * 
 * <p>Java-Klasse für ItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Price" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ItemPriceType" minOccurs="0"/>
 *         &lt;element name="ItemError" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ItemErrorsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="couponCode" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}CouponCodeType" />
 *       &lt;attribute name="itemId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="customerReference">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="35"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="cancelReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="canceledAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="cancelAmount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "price",
    "itemError"
})
@XmlSeeAlso({
    PickupItemType.class,
    CouponSetItemType.class,
    ShipmentItemType.class
})
public class ItemType {

    @XmlElement(name = "Price")
    protected ItemPriceType price;
    @XmlElement(name = "ItemError")
    protected ItemErrorsType itemError;
    @XmlAttribute(name = "couponCode")
    protected String couponCode;
    @XmlAttribute(name = "itemId")
    protected Integer itemId;
    @XmlAttribute(name = "customerReference")
    protected String customerReference;
    @XmlAttribute(name = "cancelReason")
    protected String cancelReason;
    @XmlAttribute(name = "canceledAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar canceledAt;
    @XmlAttribute(name = "cancelAmount")
    protected Double cancelAmount;

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemPriceType }
     *     
     */
    public ItemPriceType getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPriceType }
     *     
     */
    public void setPrice(ItemPriceType value) {
        this.price = value;
    }

    /**
     * Ruft den Wert der itemError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemErrorsType }
     *     
     */
    public ItemErrorsType getItemError() {
        return itemError;
    }

    /**
     * Legt den Wert der itemError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemErrorsType }
     *     
     */
    public void setItemError(ItemErrorsType value) {
        this.itemError = value;
    }

    /**
     * Ruft den Wert der couponCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Legt den Wert der couponCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponCode(String value) {
        this.couponCode = value;
    }

    /**
     * Ruft den Wert der itemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Legt den Wert der itemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemId(Integer value) {
        this.itemId = value;
    }

    /**
     * Ruft den Wert der customerReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Legt den Wert der customerReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Ruft den Wert der cancelReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Legt den Wert der cancelReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Ruft den Wert der canceledAt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCanceledAt() {
        return canceledAt;
    }

    /**
     * Legt den Wert der canceledAt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCanceledAt(XMLGregorianCalendar value) {
        this.canceledAt = value;
    }

    /**
     * Ruft den Wert der cancelAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCancelAmount() {
        return cancelAmount;
    }

    /**
     * Legt den Wert der cancelAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCancelAmount(Double value) {
        this.cancelAmount = value;
    }

}
