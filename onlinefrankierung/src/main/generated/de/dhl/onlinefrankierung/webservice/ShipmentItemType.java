
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Basistyp für Shipments
 * 
 * <p>Java-Klasse für ShipmentItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ItemType">
 *       &lt;sequence>
 *         &lt;element name="SenderAddress" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}BaseLabelAddressType"/>
 *         &lt;element name="ReceiverAddress" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}BaseLabelAddressType"/>
 *         &lt;element name="Dimension" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}ShipmentDimensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="productId" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}ProductIdType" />
 *       &lt;attribute name="shipmentId">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="39"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="routingCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="30"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="airwayBillNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentItemType", propOrder = {
    "senderAddress",
    "receiverAddress",
    "dimension"
})
@XmlSeeAlso({
    LabelItemType.class,
    MTItemType.class
})
public class ShipmentItemType
    extends ItemType
{

    @XmlElement(name = "SenderAddress", required = true)
    protected BaseLabelAddressType senderAddress;
    @XmlElement(name = "ReceiverAddress", required = true)
    protected BaseLabelAddressType receiverAddress;
    @XmlElement(name = "Dimension")
    protected ShipmentDimensionType dimension;
    @XmlAttribute(name = "productId")
    protected String productId;
    @XmlAttribute(name = "shipmentId")
    protected String shipmentId;
    @XmlAttribute(name = "routingCode")
    protected String routingCode;
    @XmlAttribute(name = "airwayBillNumber")
    protected String airwayBillNumber;

    /**
     * Ruft den Wert der senderAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BaseLabelAddressType }
     *     
     */
    public BaseLabelAddressType getSenderAddress() {
        return senderAddress;
    }

    /**
     * Legt den Wert der senderAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseLabelAddressType }
     *     
     */
    public void setSenderAddress(BaseLabelAddressType value) {
        this.senderAddress = value;
    }

    /**
     * Ruft den Wert der receiverAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BaseLabelAddressType }
     *     
     */
    public BaseLabelAddressType getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * Legt den Wert der receiverAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseLabelAddressType }
     *     
     */
    public void setReceiverAddress(BaseLabelAddressType value) {
        this.receiverAddress = value;
    }

    /**
     * Ruft den Wert der dimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDimensionType }
     *     
     */
    public ShipmentDimensionType getDimension() {
        return dimension;
    }

    /**
     * Legt den Wert der dimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDimensionType }
     *     
     */
    public void setDimension(ShipmentDimensionType value) {
        this.dimension = value;
    }

    /**
     * Ruft den Wert der productId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Legt den Wert der productId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Ruft den Wert der shipmentId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentId() {
        return shipmentId;
    }

    /**
     * Legt den Wert der shipmentId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentId(String value) {
        this.shipmentId = value;
    }

    /**
     * Ruft den Wert der routingCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * Legt den Wert der routingCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCode(String value) {
        this.routingCode = value;
    }

    /**
     * Ruft den Wert der airwayBillNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirwayBillNumber() {
        return airwayBillNumber;
    }

    /**
     * Legt den Wert der airwayBillNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirwayBillNumber(String value) {
        this.airwayBillNumber = value;
    }

}
