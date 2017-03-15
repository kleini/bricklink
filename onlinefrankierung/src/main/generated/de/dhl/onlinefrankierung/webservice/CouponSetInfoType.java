
package de.dhl.onlinefrankierung.webservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Informationen zu einem CouponSet
 * 
 * <p>Java-Klasse für CouponSetInfoType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CouponSetInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsageContext" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popps}VoucherUsageContextType" maxOccurs="unbounded"/>
 *         &lt;element name="Chunk" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popps}CouponSetChunkInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EncashProduct" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}ProductIdType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="symbolName" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}ProductIdType" />
 *       &lt;attribute name="maxUsageCounter" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="creditAbs" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}AmountType" />
 *       &lt;attribute name="creditRel" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="screenName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponSetInfoType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popps", propOrder = {
    "usageContext",
    "chunk",
    "encashProduct"
})
public class CouponSetInfoType {

    @XmlElement(name = "UsageContext", required = true)
    @XmlSchemaType(name = "string")
    protected List<VoucherUsageContextType> usageContext;
    @XmlElement(name = "Chunk")
    protected List<CouponSetChunkInfoType> chunk;
    @XmlElement(name = "EncashProduct", required = true)
    protected List<String> encashProduct;
    @XmlAttribute(name = "symbolName")
    protected String symbolName;
    @XmlAttribute(name = "maxUsageCounter")
    protected BigInteger maxUsageCounter;
    @XmlAttribute(name = "creditAbs")
    protected BigDecimal creditAbs;
    @XmlAttribute(name = "creditRel")
    protected BigInteger creditRel;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "screenName")
    protected String screenName;

    /**
     * Gets the value of the usageContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoucherUsageContextType }
     * 
     * 
     */
    public List<VoucherUsageContextType> getUsageContext() {
        if (usageContext == null) {
            usageContext = new ArrayList<VoucherUsageContextType>();
        }
        return this.usageContext;
    }

    /**
     * Gets the value of the chunk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chunk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChunk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponSetChunkInfoType }
     * 
     * 
     */
    public List<CouponSetChunkInfoType> getChunk() {
        if (chunk == null) {
            chunk = new ArrayList<CouponSetChunkInfoType>();
        }
        return this.chunk;
    }

    /**
     * Gets the value of the encashProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encashProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncashProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEncashProduct() {
        if (encashProduct == null) {
            encashProduct = new ArrayList<String>();
        }
        return this.encashProduct;
    }

    /**
     * Ruft den Wert der symbolName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolName() {
        return symbolName;
    }

    /**
     * Legt den Wert der symbolName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolName(String value) {
        this.symbolName = value;
    }

    /**
     * Ruft den Wert der maxUsageCounter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxUsageCounter() {
        return maxUsageCounter;
    }

    /**
     * Legt den Wert der maxUsageCounter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxUsageCounter(BigInteger value) {
        this.maxUsageCounter = value;
    }

    /**
     * Ruft den Wert der creditAbs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditAbs() {
        return creditAbs;
    }

    /**
     * Legt den Wert der creditAbs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditAbs(BigDecimal value) {
        this.creditAbs = value;
    }

    /**
     * Ruft den Wert der creditRel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreditRel() {
        return creditRel;
    }

    /**
     * Legt den Wert der creditRel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreditRel(BigInteger value) {
        this.creditRel = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der screenName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * Legt den Wert der screenName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenName(String value) {
        this.screenName = value;
    }

}
