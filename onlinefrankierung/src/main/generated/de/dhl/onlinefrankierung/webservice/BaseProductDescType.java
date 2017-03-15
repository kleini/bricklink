
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Beschreibung des Basisproduktes
 * 			
 * 
 * <p>Java-Klasse für BaseProductDescType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseProductDescType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}ProductServiceDescBaseType">
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="symbols" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orderKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cp71limit" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="cn2223limit" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="sendCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxLength" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxDepth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxWeight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxGurtmass" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxDiameter" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minLength" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minDepth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minWeight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minGurtmass" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minDiameter" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseProductDescType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb")
public class BaseProductDescType
    extends ProductServiceDescBaseType
{

    @XmlAttribute(name = "hidden")
    protected Boolean hidden;
    @XmlAttribute(name = "symbols")
    protected String symbols;
    @XmlAttribute(name = "orderKey")
    protected String orderKey;
    @XmlAttribute(name = "cp71limit")
    protected Double cp71Limit;
    @XmlAttribute(name = "cn2223limit")
    protected Double cn2223Limit;
    @XmlAttribute(name = "sendCountry")
    protected String sendCountry;
    @XmlAttribute(name = "maxLength")
    protected Integer maxLength;
    @XmlAttribute(name = "maxWidth")
    protected Integer maxWidth;
    @XmlAttribute(name = "maxDepth")
    protected Integer maxDepth;
    @XmlAttribute(name = "maxWeight")
    protected Integer maxWeight;
    @XmlAttribute(name = "maxGurtmass")
    protected Integer maxGurtmass;
    @XmlAttribute(name = "maxDiameter")
    protected Integer maxDiameter;
    @XmlAttribute(name = "minLength")
    protected Integer minLength;
    @XmlAttribute(name = "minWidth")
    protected Integer minWidth;
    @XmlAttribute(name = "minDepth")
    protected Integer minDepth;
    @XmlAttribute(name = "minWeight")
    protected Integer minWeight;
    @XmlAttribute(name = "minGurtmass")
    protected Integer minGurtmass;
    @XmlAttribute(name = "minDiameter")
    protected Integer minDiameter;

    /**
     * Ruft den Wert der hidden-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHidden() {
        if (hidden == null) {
            return false;
        } else {
            return hidden;
        }
    }

    /**
     * Legt den Wert der hidden-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    /**
     * Ruft den Wert der symbols-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbols() {
        return symbols;
    }

    /**
     * Legt den Wert der symbols-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbols(String value) {
        this.symbols = value;
    }

    /**
     * Ruft den Wert der orderKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderKey() {
        return orderKey;
    }

    /**
     * Legt den Wert der orderKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderKey(String value) {
        this.orderKey = value;
    }

    /**
     * Ruft den Wert der cp71Limit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCp71Limit() {
        return cp71Limit;
    }

    /**
     * Legt den Wert der cp71Limit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCp71Limit(Double value) {
        this.cp71Limit = value;
    }

    /**
     * Ruft den Wert der cn2223Limit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCn2223Limit() {
        return cn2223Limit;
    }

    /**
     * Legt den Wert der cn2223Limit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCn2223Limit(Double value) {
        this.cn2223Limit = value;
    }

    /**
     * Ruft den Wert der sendCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendCountry() {
        return sendCountry;
    }

    /**
     * Legt den Wert der sendCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendCountry(String value) {
        this.sendCountry = value;
    }

    /**
     * Ruft den Wert der maxLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Legt den Wert der maxLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
    }

    /**
     * Ruft den Wert der maxWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxWidth() {
        return maxWidth;
    }

    /**
     * Legt den Wert der maxWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxWidth(Integer value) {
        this.maxWidth = value;
    }

    /**
     * Ruft den Wert der maxDepth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDepth() {
        return maxDepth;
    }

    /**
     * Legt den Wert der maxDepth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDepth(Integer value) {
        this.maxDepth = value;
    }

    /**
     * Ruft den Wert der maxWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxWeight() {
        return maxWeight;
    }

    /**
     * Legt den Wert der maxWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxWeight(Integer value) {
        this.maxWeight = value;
    }

    /**
     * Ruft den Wert der maxGurtmass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxGurtmass() {
        return maxGurtmass;
    }

    /**
     * Legt den Wert der maxGurtmass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxGurtmass(Integer value) {
        this.maxGurtmass = value;
    }

    /**
     * Ruft den Wert der maxDiameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDiameter() {
        return maxDiameter;
    }

    /**
     * Legt den Wert der maxDiameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDiameter(Integer value) {
        this.maxDiameter = value;
    }

    /**
     * Ruft den Wert der minLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinLength() {
        return minLength;
    }

    /**
     * Legt den Wert der minLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinLength(Integer value) {
        this.minLength = value;
    }

    /**
     * Ruft den Wert der minWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinWidth() {
        return minWidth;
    }

    /**
     * Legt den Wert der minWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinWidth(Integer value) {
        this.minWidth = value;
    }

    /**
     * Ruft den Wert der minDepth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinDepth() {
        return minDepth;
    }

    /**
     * Legt den Wert der minDepth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinDepth(Integer value) {
        this.minDepth = value;
    }

    /**
     * Ruft den Wert der minWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinWeight() {
        return minWeight;
    }

    /**
     * Legt den Wert der minWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinWeight(Integer value) {
        this.minWeight = value;
    }

    /**
     * Ruft den Wert der minGurtmass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinGurtmass() {
        return minGurtmass;
    }

    /**
     * Legt den Wert der minGurtmass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinGurtmass(Integer value) {
        this.minGurtmass = value;
    }

    /**
     * Ruft den Wert der minDiameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinDiameter() {
        return minDiameter;
    }

    /**
     * Legt den Wert der minDiameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinDiameter(Integer value) {
        this.minDiameter = value;
    }

}
