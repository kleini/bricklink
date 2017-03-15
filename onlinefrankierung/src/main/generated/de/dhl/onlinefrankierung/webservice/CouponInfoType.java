
package de.dhl.onlinefrankierung.webservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *     Information zu einem (Einzel-) Coupon.
 * 
 *     Diese Struktur wird später um evtl. um weitere Informationen ergänzt
 *    
 * 
 * <p>Java-Klasse für CouponInfoType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CouponInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CouponSet" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popps}CouponSetInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="couponCode" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}CouponCodeType" />
 *       &lt;attribute name="validUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="usageCounter" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="createComment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createdAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInfoType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popps", propOrder = {
    "couponSet"
})
public class CouponInfoType {

    @XmlElement(name = "CouponSet")
    protected CouponSetInfoType couponSet;
    @XmlAttribute(name = "couponCode")
    protected String couponCode;
    @XmlAttribute(name = "validUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntil;
    @XmlAttribute(name = "usageCounter")
    protected BigInteger usageCounter;
    @XmlAttribute(name = "createComment")
    protected String createComment;
    @XmlAttribute(name = "createdAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;

    /**
     * Ruft den Wert der couponSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CouponSetInfoType }
     *     
     */
    public CouponSetInfoType getCouponSet() {
        return couponSet;
    }

    /**
     * Legt den Wert der couponSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSetInfoType }
     *     
     */
    public void setCouponSet(CouponSetInfoType value) {
        this.couponSet = value;
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
     * Ruft den Wert der validUntil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntil() {
        return validUntil;
    }

    /**
     * Legt den Wert der validUntil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntil(XMLGregorianCalendar value) {
        this.validUntil = value;
    }

    /**
     * Ruft den Wert der usageCounter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsageCounter() {
        return usageCounter;
    }

    /**
     * Legt den Wert der usageCounter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsageCounter(BigInteger value) {
        this.usageCounter = value;
    }

    /**
     * Ruft den Wert der createComment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateComment() {
        return createComment;
    }

    /**
     * Legt den Wert der createComment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateComment(String value) {
        this.createComment = value;
    }

    /**
     * Ruft den Wert der createdAt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Legt den Wert der createdAt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

}
