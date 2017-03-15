
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *     Ein Maxitransport Item.
 * 
 *     Auftragsadresse ist immer vom Warenkorb.
 * 
 *     Alternativ kann xsi:type="sc_2_0:MTItemMulticollieType verwendet werden fuer echte Multicollie-Sendungen.
 *    
 * 
 * <p>Java-Klasse für MTItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MTItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ShipmentItemType">
 *       &lt;attribute name="shipmentDescription">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="55"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="gplOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pickupDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTItemType")
public class MTItemType
    extends ShipmentItemType
{

    @XmlAttribute(name = "shipmentDescription")
    protected String shipmentDescription;
    @XmlAttribute(name = "gplOrderNo")
    protected String gplOrderNo;
    @XmlAttribute(name = "pickupDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupDate;

    /**
     * Ruft den Wert der shipmentDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentDescription() {
        return shipmentDescription;
    }

    /**
     * Legt den Wert der shipmentDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentDescription(String value) {
        this.shipmentDescription = value;
    }

    /**
     * Ruft den Wert der gplOrderNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGplOrderNo() {
        return gplOrderNo;
    }

    /**
     * Legt den Wert der gplOrderNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGplOrderNo(String value) {
        this.gplOrderNo = value;
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

}
