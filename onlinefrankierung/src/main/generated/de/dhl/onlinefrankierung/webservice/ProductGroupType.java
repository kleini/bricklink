
package de.dhl.onlinefrankierung.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Eine Produktgruppe fasst eine Gruppe von Produkten
 * 				zusammen.
 * 
 * 
 * <p>Java-Klasse für ProductGroupType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProductGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="CountryProducts" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}CountryProductsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Collection" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}CollectionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="displayText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductGroupType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb", propOrder = {
    "countryProducts",
    "collection"
})
public class ProductGroupType {

    @XmlElement(name = "CountryProducts")
    protected List<CountryProductsType> countryProducts;
    @XmlElement(name = "Collection")
    protected List<CollectionType> collection;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "displayText")
    protected String displayText;

    /**
     * Gets the value of the countryProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryProductsType }
     * 
     * 
     */
    public List<CountryProductsType> getCountryProducts() {
        if (countryProducts == null) {
            countryProducts = new ArrayList<CountryProductsType>();
        }
        return this.countryProducts;
    }

    /**
     * Gets the value of the collection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionType }
     * 
     * 
     */
    public List<CollectionType> getCollection() {
        if (collection == null) {
            collection = new ArrayList<CollectionType>();
        }
        return this.collection;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der displayText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Legt den Wert der displayText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

}
