
package de.dhl.onlinefrankierung.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Informationen über ein Basisprodukt. Ein Basisprodukt
 * 				ist ein Produkt ohne Services.
 * 			
 * 
 * <p>Java-Klasse für BaseProductType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseProductType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}NamedReferenceType">
 *       &lt;sequence>
 *         &lt;element name="Prices" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}PricesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BaseProductDesc" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}BaseProductDescType" minOccurs="0"/>
 *         &lt;element name="Product" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}ProductType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="defaultProduct" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ekp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="priceLevels" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseProductType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb", propOrder = {
    "prices",
    "baseProductDesc",
    "product"
})
public class BaseProductType
    extends NamedReferenceType
{

    @XmlElement(name = "Prices")
    protected List<PricesType> prices;
    @XmlElement(name = "BaseProductDesc")
    protected BaseProductDescType baseProductDesc;
    @XmlElement(name = "Product")
    protected List<ProductType> product;
    @XmlAttribute(name = "defaultProduct")
    protected String defaultProduct;
    @XmlAttribute(name = "ekp")
    protected String ekp;
    @XmlAttribute(name = "priceLevels")
    protected Boolean priceLevels;

    /**
     * Gets the value of the prices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricesType }
     * 
     * 
     */
    public List<PricesType> getPrices() {
        if (prices == null) {
            prices = new ArrayList<PricesType>();
        }
        return this.prices;
    }

    /**
     * Ruft den Wert der baseProductDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductDescType }
     *     
     */
    public BaseProductDescType getBaseProductDesc() {
        return baseProductDesc;
    }

    /**
     * Legt den Wert der baseProductDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductDescType }
     *     
     */
    public void setBaseProductDesc(BaseProductDescType value) {
        this.baseProductDesc = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getProduct() {
        if (product == null) {
            product = new ArrayList<ProductType>();
        }
        return this.product;
    }

    /**
     * Ruft den Wert der defaultProduct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultProduct() {
        return defaultProduct;
    }

    /**
     * Legt den Wert der defaultProduct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultProduct(String value) {
        this.defaultProduct = value;
    }

    /**
     * Ruft den Wert der ekp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEkp() {
        return ekp;
    }

    /**
     * Legt den Wert der ekp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEkp(String value) {
        this.ekp = value;
    }

    /**
     * Ruft den Wert der priceLevels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPriceLevels() {
        if (priceLevels == null) {
            return false;
        } else {
            return priceLevels;
        }
    }

    /**
     * Legt den Wert der priceLevels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceLevels(Boolean value) {
        this.priceLevels = value;
    }

}
