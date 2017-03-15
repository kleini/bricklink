
package de.dhl.onlinefrankierung.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Stellt eine Abholung dar. Attribute name in
 * 				NamedReference enthält POP-interne Kennung des Abholservices.
 * 				(ALB,AZF,EAO,TAS)
 * 
 * <p>Java-Klasse für CollectionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}NamedReferenceType">
 *       &lt;sequence>
 *         &lt;element name="CollectionDesc" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}CollectionDescType" minOccurs="0"/>
 *         &lt;element name="Prices" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}PricesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nonWorkingWeekDays" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="earliestPickupOffset" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pickupTimeLimit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxCollectableItems" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="timeWindows" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allowStandalone" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb", propOrder = {
    "collectionDesc",
    "prices"
})
public class CollectionType
    extends NamedReferenceType
{

    @XmlElement(name = "CollectionDesc")
    protected CollectionDescType collectionDesc;
    @XmlElement(name = "Prices")
    protected List<PricesType> prices;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "nonWorkingWeekDays")
    protected String nonWorkingWeekDays;
    @XmlAttribute(name = "earliestPickupOffset")
    protected Integer earliestPickupOffset;
    @XmlAttribute(name = "pickupTimeLimit")
    protected String pickupTimeLimit;
    @XmlAttribute(name = "maxCollectableItems")
    protected Integer maxCollectableItems;
    @XmlAttribute(name = "timeWindows")
    protected String timeWindows;
    @XmlAttribute(name = "allowStandalone")
    protected Boolean allowStandalone;

    /**
     * Ruft den Wert der collectionDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollectionDescType }
     *     
     */
    public CollectionDescType getCollectionDesc() {
        return collectionDesc;
    }

    /**
     * Legt den Wert der collectionDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionDescType }
     *     
     */
    public void setCollectionDesc(CollectionDescType value) {
        this.collectionDesc = value;
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
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der nonWorkingWeekDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonWorkingWeekDays() {
        return nonWorkingWeekDays;
    }

    /**
     * Legt den Wert der nonWorkingWeekDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonWorkingWeekDays(String value) {
        this.nonWorkingWeekDays = value;
    }

    /**
     * Ruft den Wert der earliestPickupOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEarliestPickupOffset() {
        return earliestPickupOffset;
    }

    /**
     * Legt den Wert der earliestPickupOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEarliestPickupOffset(Integer value) {
        this.earliestPickupOffset = value;
    }

    /**
     * Ruft den Wert der pickupTimeLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTimeLimit() {
        return pickupTimeLimit;
    }

    /**
     * Legt den Wert der pickupTimeLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTimeLimit(String value) {
        this.pickupTimeLimit = value;
    }

    /**
     * Ruft den Wert der maxCollectableItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCollectableItems() {
        return maxCollectableItems;
    }

    /**
     * Legt den Wert der maxCollectableItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCollectableItems(Integer value) {
        this.maxCollectableItems = value;
    }

    /**
     * Ruft den Wert der timeWindows-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeWindows() {
        return timeWindows;
    }

    /**
     * Legt den Wert der timeWindows-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeWindows(String value) {
        this.timeWindows = value;
    }

    /**
     * Ruft den Wert der allowStandalone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowStandalone() {
        return allowStandalone;
    }

    /**
     * Legt den Wert der allowStandalone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowStandalone(Boolean value) {
        this.allowStandalone = value;
    }

}
