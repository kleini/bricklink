
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
 * 				Ein Service, der einem Produkt zugeordnet ist.
 * 			
 * 
 * <p>Java-Klasse für ServiceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}NamedReferenceType">
 *       &lt;sequence>
 *         &lt;element name="ServiceDesc" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}ServiceDescType"/>
 *         &lt;element name="Prices" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}PricesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="priceLevels" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="ekp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb", propOrder = {
    "serviceDesc",
    "prices"
})
public class ServiceType
    extends NamedReferenceType
{

    @XmlElement(name = "ServiceDesc", required = true)
    protected ServiceDescType serviceDesc;
    @XmlElement(name = "Prices")
    protected List<PricesType> prices;
    @XmlAttribute(name = "priceLevels")
    protected Boolean priceLevels;
    @XmlAttribute(name = "selected")
    protected Boolean selected;
    @XmlAttribute(name = "ekp")
    protected String ekp;
    @XmlAttribute(name = "disabled")
    protected Boolean disabled;

    /**
     * Ruft den Wert der serviceDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDescType }
     *     
     */
    public ServiceDescType getServiceDesc() {
        return serviceDesc;
    }

    /**
     * Legt den Wert der serviceDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDescType }
     *     
     */
    public void setServiceDesc(ServiceDescType value) {
        this.serviceDesc = value;
    }

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

    /**
     * Ruft den Wert der selected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSelected() {
        if (selected == null) {
            return true;
        } else {
            return selected;
        }
    }

    /**
     * Legt den Wert der selected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelected(Boolean value) {
        this.selected = value;
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
     * Ruft den Wert der disabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisabled() {
        if (disabled == null) {
            return false;
        } else {
            return disabled;
        }
    }

    /**
     * Legt den Wert der disabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

}
