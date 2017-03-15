
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Filtern des Responses.
 * 
 * <p>Java-Klasse für ProductInfoFilterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProductInfoFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="countryFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productGroupFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="viewEKP" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="viewAdditionalAttributes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="viewPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="viewFuturePrices" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="viewDisplayText" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="viewDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="viewFeatures" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="viewTransitions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="noXmlCompression" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maxWeigth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInfoFilterType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb")
public class ProductInfoFilterType {

    @XmlAttribute(name = "countryFilter")
    protected String countryFilter;
    @XmlAttribute(name = "productGroupFilter")
    protected String productGroupFilter;
    @XmlAttribute(name = "productFilter")
    protected String productFilter;
    @XmlAttribute(name = "viewEKP")
    protected Boolean viewEKP;
    @XmlAttribute(name = "viewAdditionalAttributes")
    protected Boolean viewAdditionalAttributes;
    @XmlAttribute(name = "viewPrice")
    protected Boolean viewPrice;
    @XmlAttribute(name = "viewFuturePrices")
    protected Boolean viewFuturePrices;
    @XmlAttribute(name = "viewDisplayText")
    protected Boolean viewDisplayText;
    @XmlAttribute(name = "viewDimension")
    protected Boolean viewDimension;
    @XmlAttribute(name = "viewFeatures")
    protected Boolean viewFeatures;
    @XmlAttribute(name = "viewTransitions")
    protected Boolean viewTransitions;
    @XmlAttribute(name = "noXmlCompression")
    protected Boolean noXmlCompression;
    @XmlAttribute(name = "maxWeigth")
    protected Integer maxWeigth;

    /**
     * Ruft den Wert der countryFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryFilter() {
        return countryFilter;
    }

    /**
     * Legt den Wert der countryFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryFilter(String value) {
        this.countryFilter = value;
    }

    /**
     * Ruft den Wert der productGroupFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroupFilter() {
        return productGroupFilter;
    }

    /**
     * Legt den Wert der productGroupFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroupFilter(String value) {
        this.productGroupFilter = value;
    }

    /**
     * Ruft den Wert der productFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductFilter() {
        return productFilter;
    }

    /**
     * Legt den Wert der productFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductFilter(String value) {
        this.productFilter = value;
    }

    /**
     * Ruft den Wert der viewEKP-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isViewEKP() {
        if (viewEKP == null) {
            return false;
        } else {
            return viewEKP;
        }
    }

    /**
     * Legt den Wert der viewEKP-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewEKP(Boolean value) {
        this.viewEKP = value;
    }

    /**
     * Ruft den Wert der viewAdditionalAttributes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isViewAdditionalAttributes() {
        if (viewAdditionalAttributes == null) {
            return false;
        } else {
            return viewAdditionalAttributes;
        }
    }

    /**
     * Legt den Wert der viewAdditionalAttributes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewAdditionalAttributes(Boolean value) {
        this.viewAdditionalAttributes = value;
    }

    /**
     * Ruft den Wert der viewPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isViewPrice() {
        if (viewPrice == null) {
            return true;
        } else {
            return viewPrice;
        }
    }

    /**
     * Legt den Wert der viewPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewPrice(Boolean value) {
        this.viewPrice = value;
    }

    /**
     * Ruft den Wert der viewFuturePrices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isViewFuturePrices() {
        if (viewFuturePrices == null) {
            return false;
        } else {
            return viewFuturePrices;
        }
    }

    /**
     * Legt den Wert der viewFuturePrices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewFuturePrices(Boolean value) {
        this.viewFuturePrices = value;
    }

    /**
     * Ruft den Wert der viewDisplayText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isViewDisplayText() {
        if (viewDisplayText == null) {
            return false;
        } else {
            return viewDisplayText;
        }
    }

    /**
     * Legt den Wert der viewDisplayText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewDisplayText(Boolean value) {
        this.viewDisplayText = value;
    }

    /**
     * Ruft den Wert der viewDimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isViewDimension() {
        if (viewDimension == null) {
            return false;
        } else {
            return viewDimension;
        }
    }

    /**
     * Legt den Wert der viewDimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewDimension(Boolean value) {
        this.viewDimension = value;
    }

    /**
     * Ruft den Wert der viewFeatures-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isViewFeatures() {
        if (viewFeatures == null) {
            return false;
        } else {
            return viewFeatures;
        }
    }

    /**
     * Legt den Wert der viewFeatures-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewFeatures(Boolean value) {
        this.viewFeatures = value;
    }

    /**
     * Ruft den Wert der viewTransitions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isViewTransitions() {
        if (viewTransitions == null) {
            return false;
        } else {
            return viewTransitions;
        }
    }

    /**
     * Legt den Wert der viewTransitions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewTransitions(Boolean value) {
        this.viewTransitions = value;
    }

    /**
     * Ruft den Wert der noXmlCompression-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoXmlCompression() {
        return noXmlCompression;
    }

    /**
     * Legt den Wert der noXmlCompression-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoXmlCompression(Boolean value) {
        this.noXmlCompression = value;
    }

    /**
     * Ruft den Wert der maxWeigth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxWeigth() {
        return maxWeigth;
    }

    /**
     * Legt den Wert der maxWeigth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxWeigth(Integer value) {
        this.maxWeigth = value;
    }

}
