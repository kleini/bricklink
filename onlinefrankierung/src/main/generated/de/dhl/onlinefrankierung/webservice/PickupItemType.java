
package de.dhl.onlinefrankierung.webservice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Enthält eine Abholung.
 * 
 * <p>Java-Klasse für PickupItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PickupItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ItemType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}BaseLabelAddressType"/>
 *         &lt;element name="curPickupTime" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PickupTimeType"/>
 *         &lt;element name="availablePickupTimes" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PickupTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pickupItemCount">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minExclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupItemType", propOrder = {
    "address",
    "curPickupTime",
    "availablePickupTimes"
})
public class PickupItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected BaseLabelAddressType address;
    @XmlElement(required = true)
    protected PickupTimeType curPickupTime;
    protected List<PickupTimeType> availablePickupTimes;
    @XmlAttribute(name = "pickupItemCount")
    protected BigInteger pickupItemCount;

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BaseLabelAddressType }
     *     
     */
    public BaseLabelAddressType getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseLabelAddressType }
     *     
     */
    public void setAddress(BaseLabelAddressType value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der curPickupTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PickupTimeType }
     *     
     */
    public PickupTimeType getCurPickupTime() {
        return curPickupTime;
    }

    /**
     * Legt den Wert der curPickupTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupTimeType }
     *     
     */
    public void setCurPickupTime(PickupTimeType value) {
        this.curPickupTime = value;
    }

    /**
     * Gets the value of the availablePickupTimes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availablePickupTimes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailablePickupTimes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PickupTimeType }
     * 
     * 
     */
    public List<PickupTimeType> getAvailablePickupTimes() {
        if (availablePickupTimes == null) {
            availablePickupTimes = new ArrayList<PickupTimeType>();
        }
        return this.availablePickupTimes;
    }

    /**
     * Ruft den Wert der pickupItemCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPickupItemCount() {
        return pickupItemCount;
    }

    /**
     * Legt den Wert der pickupItemCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPickupItemCount(BigInteger value) {
        this.pickupItemCount = value;
    }

}
