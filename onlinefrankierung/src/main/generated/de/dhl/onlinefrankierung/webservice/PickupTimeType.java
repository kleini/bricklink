
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für PickupTimeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PickupTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="pickupType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="TAS"/>
 *             &lt;enumeration value="EAO"/>
 *             &lt;enumeration value="AZF"/>
 *             &lt;enumeration value="ALB"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pickupDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="pickupWindowId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pickupFromTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="pickupToTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupTimeType")
public class PickupTimeType {

    @XmlAttribute(name = "pickupType", required = true)
    protected String pickupType;
    @XmlAttribute(name = "pickupDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupDate;
    @XmlAttribute(name = "pickupWindowId")
    protected String pickupWindowId;
    @XmlAttribute(name = "pickupFromTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar pickupFromTime;
    @XmlAttribute(name = "pickupToTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar pickupToTime;

    /**
     * Ruft den Wert der pickupType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupType() {
        return pickupType;
    }

    /**
     * Legt den Wert der pickupType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupType(String value) {
        this.pickupType = value;
    }

    /**
     * Ruft den Wert der pickupDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupDate() {
        return pickupDate;
    }

    /**
     * Legt den Wert der pickupDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupDate(XMLGregorianCalendar value) {
        this.pickupDate = value;
    }

    /**
     * Ruft den Wert der pickupWindowId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupWindowId() {
        return pickupWindowId;
    }

    /**
     * Legt den Wert der pickupWindowId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupWindowId(String value) {
        this.pickupWindowId = value;
    }

    /**
     * Ruft den Wert der pickupFromTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupFromTime() {
        return pickupFromTime;
    }

    /**
     * Legt den Wert der pickupFromTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupFromTime(XMLGregorianCalendar value) {
        this.pickupFromTime = value;
    }

    /**
     * Ruft den Wert der pickupToTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupToTime() {
        return pickupToTime;
    }

    /**
     * Legt den Wert der pickupToTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupToTime(XMLGregorianCalendar value) {
        this.pickupToTime = value;
    }

}
