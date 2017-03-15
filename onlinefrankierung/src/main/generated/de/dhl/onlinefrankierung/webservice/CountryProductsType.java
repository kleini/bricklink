
package de.dhl.onlinefrankierung.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Produkte für ein Land.
 * 				Attribute name in NamedReference
 * 				enthält Alphanumerisches ISO3 Kennung des
 * 				Landes.
 * 
 * <p>Java-Klasse für CountryProductsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CountryProductsType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}NamedReferenceType">
 *       &lt;sequence>
 *         &lt;element name="BaseProduct" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}BaseProductType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isSyntetic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="iso2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="iso3num" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultBaseProduct" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryProductsType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb", propOrder = {
    "baseProduct"
})
public class CountryProductsType
    extends NamedReferenceType
{

    @XmlElement(name = "BaseProduct")
    protected List<BaseProductType> baseProduct;
    @XmlAttribute(name = "isSyntetic")
    protected Boolean isSyntetic;
    @XmlAttribute(name = "iso2")
    protected String iso2;
    @XmlAttribute(name = "iso3num")
    protected Integer iso3Num;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "defaultBaseProduct")
    protected String defaultBaseProduct;

    /**
     * Gets the value of the baseProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseProductType }
     * 
     * 
     */
    public List<BaseProductType> getBaseProduct() {
        if (baseProduct == null) {
            baseProduct = new ArrayList<BaseProductType>();
        }
        return this.baseProduct;
    }

    /**
     * Ruft den Wert der isSyntetic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsSyntetic() {
        if (isSyntetic == null) {
            return false;
        } else {
            return isSyntetic;
        }
    }

    /**
     * Legt den Wert der isSyntetic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSyntetic(Boolean value) {
        this.isSyntetic = value;
    }

    /**
     * Ruft den Wert der iso2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIso2() {
        return iso2;
    }

    /**
     * Legt den Wert der iso2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso2(String value) {
        this.iso2 = value;
    }

    /**
     * Ruft den Wert der iso3Num-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIso3Num() {
        return iso3Num;
    }

    /**
     * Legt den Wert der iso3Num-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIso3Num(Integer value) {
        this.iso3Num = value;
    }

    /**
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der defaultBaseProduct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultBaseProduct() {
        return defaultBaseProduct;
    }

    /**
     * Legt den Wert der defaultBaseProduct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultBaseProduct(String value) {
        this.defaultBaseProduct = value;
    }

}
