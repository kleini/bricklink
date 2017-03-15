
package de.dhl.onlinefrankierung.webservice;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * Beschreibung des Produktes.
 * 
 * <p>Java-Klasse für ProductDescType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProductDescType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}ProductServiceDescBaseType">
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
 *       &lt;attribute name="noPackstation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="licencePlateType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="routingCodeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="leitcodeProductCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberRangeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="svgtLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="amselProductKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sendCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDescType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb")
public class ProductDescType
    extends ProductServiceDescBaseType
{

    @XmlAttribute(name = "hidden")
    protected Boolean hidden;
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
    @XmlAttribute(name = "noPackstation")
    protected Boolean noPackstation;
    @XmlAttribute(name = "licencePlateType")
    protected String licencePlateType;
    @XmlAttribute(name = "routingCodeType")
    protected String routingCodeType;
    @XmlAttribute(name = "productKey")
    protected String productKey;
    @XmlAttribute(name = "leitcodeProductCode")
    protected String leitcodeProductCode;
    @XmlAttribute(name = "numberRangeName")
    protected String numberRangeName;
    @XmlAttribute(name = "svgtLabel")
    protected String svgtLabel;
    @XmlAttribute(name = "amselProductKey")
    protected String amselProductKey;
    @XmlAttribute(name = "sendCountry")
    protected String sendCountry;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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

    /**
     * Ruft den Wert der noPackstation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNoPackstation() {
        if (noPackstation == null) {
            return false;
        } else {
            return noPackstation;
        }
    }

    /**
     * Legt den Wert der noPackstation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoPackstation(Boolean value) {
        this.noPackstation = value;
    }

    /**
     * Ruft den Wert der licencePlateType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicencePlateType() {
        return licencePlateType;
    }

    /**
     * Legt den Wert der licencePlateType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicencePlateType(String value) {
        this.licencePlateType = value;
    }

    /**
     * Ruft den Wert der routingCodeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCodeType() {
        return routingCodeType;
    }

    /**
     * Legt den Wert der routingCodeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCodeType(String value) {
        this.routingCodeType = value;
    }

    /**
     * Ruft den Wert der productKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * Legt den Wert der productKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductKey(String value) {
        this.productKey = value;
    }

    /**
     * Ruft den Wert der leitcodeProductCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeitcodeProductCode() {
        return leitcodeProductCode;
    }

    /**
     * Legt den Wert der leitcodeProductCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeitcodeProductCode(String value) {
        this.leitcodeProductCode = value;
    }

    /**
     * Ruft den Wert der numberRangeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberRangeName() {
        return numberRangeName;
    }

    /**
     * Legt den Wert der numberRangeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberRangeName(String value) {
        this.numberRangeName = value;
    }

    /**
     * Ruft den Wert der svgtLabel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvgtLabel() {
        return svgtLabel;
    }

    /**
     * Legt den Wert der svgtLabel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvgtLabel(String value) {
        this.svgtLabel = value;
    }

    /**
     * Ruft den Wert der amselProductKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmselProductKey() {
        return amselProductKey;
    }

    /**
     * Legt den Wert der amselProductKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmselProductKey(String value) {
        this.amselProductKey = value;
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
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
