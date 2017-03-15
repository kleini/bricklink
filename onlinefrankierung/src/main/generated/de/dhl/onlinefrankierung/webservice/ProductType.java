
package de.dhl.onlinefrankierung.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Ein Produkt ist die Kombination eines Basisproduktes
 * 				mit einem spezifischen Set an Services.
 * 
 * <p>Java-Klasse für ProductType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProductType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}NamedReferenceType">
 *       &lt;sequence>
 *         &lt;element name="ProductDesc" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}ProductDescType" minOccurs="0"/>
 *         &lt;element name="Service" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}ServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="collectionServices" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb", propOrder = {
    "productDesc",
    "service"
})
public class ProductType
    extends NamedReferenceType
{

    @XmlElement(name = "ProductDesc")
    protected ProductDescType productDesc;
    @XmlElement(name = "Service")
    protected List<ServiceType> service;
    @XmlAttribute(name = "collectionServices")
    protected String collectionServices;

    /**
     * Ruft den Wert der productDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductDescType }
     *     
     */
    public ProductDescType getProductDesc() {
        return productDesc;
    }

    /**
     * Legt den Wert der productDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDescType }
     *     
     */
    public void setProductDesc(ProductDescType value) {
        this.productDesc = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * 
     * 
     */
    public List<ServiceType> getService() {
        if (service == null) {
            service = new ArrayList<ServiceType>();
        }
        return this.service;
    }

    /**
     * Ruft den Wert der collectionServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionServices() {
        return collectionServices;
    }

    /**
     * Legt den Wert der collectionServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionServices(String value) {
        this.collectionServices = value;
    }

}
