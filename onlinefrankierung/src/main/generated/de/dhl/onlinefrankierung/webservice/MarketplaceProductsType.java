
package de.dhl.onlinefrankierung.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * PartnerID aka Marktplatz. Ist identisch aus dem
 * 				Request.
 * 
 * <p>Java-Klasse für MarketplaceProductsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MarketplaceProductsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductGroup" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}ProductGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="partnerId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="configTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="popConfigId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketplaceProductsType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb", propOrder = {
    "productGroup"
})
public class MarketplaceProductsType {

    @XmlElement(name = "ProductGroup")
    protected List<ProductGroupType> productGroup;
    @XmlAttribute(name = "partnerId", required = true)
    protected String partnerId;
    @XmlAttribute(name = "configTime", required = true)
    protected String configTime;
    @XmlAttribute(name = "popConfigId", required = true)
    protected String popConfigId;
    @XmlAttribute(name = "defaultGroup")
    protected String defaultGroup;

    /**
     * Gets the value of the productGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductGroupType }
     * 
     * 
     */
    public List<ProductGroupType> getProductGroup() {
        if (productGroup == null) {
            productGroup = new ArrayList<ProductGroupType>();
        }
        return this.productGroup;
    }

    /**
     * Ruft den Wert der partnerId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Legt den Wert der partnerId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Ruft den Wert der configTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigTime() {
        return configTime;
    }

    /**
     * Legt den Wert der configTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigTime(String value) {
        this.configTime = value;
    }

    /**
     * Ruft den Wert der popConfigId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopConfigId() {
        return popConfigId;
    }

    /**
     * Legt den Wert der popConfigId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopConfigId(String value) {
        this.popConfigId = value;
    }

    /**
     * Ruft den Wert der defaultGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultGroup() {
        return defaultGroup;
    }

    /**
     * Legt den Wert der defaultGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultGroup(String value) {
        this.defaultGroup = value;
    }

}
