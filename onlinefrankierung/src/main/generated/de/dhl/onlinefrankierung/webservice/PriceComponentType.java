
package de.dhl.onlinefrankierung.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Eine Preiskomponente
 * 
 * <p>Java-Klasse für PriceComponentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PriceComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="bruttoAmount" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}AmountType" />
 *       &lt;attribute name="vat" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}VatType" />
 *       &lt;attribute name="productId" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}ProductIdType" />
 *       &lt;attribute name="productCountry" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}CountryCodeType" />
 *       &lt;attribute name="encashVoucherAmount" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}AmountType" />
 *       &lt;attribute name="encashVoucherId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="encashDiscountReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="encashDiscountAmount" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}AmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceComponentType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase")
public class PriceComponentType {

    @XmlAttribute(name = "bruttoAmount")
    protected BigDecimal bruttoAmount;
    @XmlAttribute(name = "vat")
    protected BigDecimal vat;
    @XmlAttribute(name = "productId")
    protected String productId;
    @XmlAttribute(name = "productCountry")
    protected String productCountry;
    @XmlAttribute(name = "encashVoucherAmount")
    protected BigDecimal encashVoucherAmount;
    @XmlAttribute(name = "encashVoucherId")
    protected String encashVoucherId;
    @XmlAttribute(name = "encashDiscountReason")
    protected String encashDiscountReason;
    @XmlAttribute(name = "encashDiscountAmount")
    protected BigDecimal encashDiscountAmount;

    /**
     * Ruft den Wert der bruttoAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBruttoAmount() {
        return bruttoAmount;
    }

    /**
     * Legt den Wert der bruttoAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBruttoAmount(BigDecimal value) {
        this.bruttoAmount = value;
    }

    /**
     * Ruft den Wert der vat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVat() {
        return vat;
    }

    /**
     * Legt den Wert der vat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVat(BigDecimal value) {
        this.vat = value;
    }

    /**
     * Ruft den Wert der productId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Legt den Wert der productId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Ruft den Wert der productCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCountry() {
        return productCountry;
    }

    /**
     * Legt den Wert der productCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCountry(String value) {
        this.productCountry = value;
    }

    /**
     * Ruft den Wert der encashVoucherAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEncashVoucherAmount() {
        return encashVoucherAmount;
    }

    /**
     * Legt den Wert der encashVoucherAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEncashVoucherAmount(BigDecimal value) {
        this.encashVoucherAmount = value;
    }

    /**
     * Ruft den Wert der encashVoucherId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncashVoucherId() {
        return encashVoucherId;
    }

    /**
     * Legt den Wert der encashVoucherId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncashVoucherId(String value) {
        this.encashVoucherId = value;
    }

    /**
     * Ruft den Wert der encashDiscountReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncashDiscountReason() {
        return encashDiscountReason;
    }

    /**
     * Legt den Wert der encashDiscountReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncashDiscountReason(String value) {
        this.encashDiscountReason = value;
    }

    /**
     * Ruft den Wert der encashDiscountAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEncashDiscountAmount() {
        return encashDiscountAmount;
    }

    /**
     * Legt den Wert der encashDiscountAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEncashDiscountAmount(BigDecimal value) {
        this.encashDiscountAmount = value;
    }

}
