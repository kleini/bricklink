
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Marketplace Toolset Eingangs-Schnittstelle
 *                 Siehe auch:
 *                 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc" xmlns:ws="https://www.dhl.de/popweb/gw/ws/schema/1.0/popws" xmlns:ws_2_0="https://www.dhl.de/popweb/gw/ws/schema/2.0/popws"&gt;ShoppingCartOpenResponseType&lt;/link&gt;
 * </pre>
 * 
 *                 .
 *             
 * 
 * <p>Java-Klasse für ShoppingCartOpenRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartOpenRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}WsRequestType">
 *       &lt;sequence>
 *         &lt;element name="ShoppingCart" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ShoppingCartBaseType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="acceptAgb" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="notifyUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sendUserEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="sendMaptosRSET" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="workflowShowPage" default="ShoppingCart">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="30"/>
 *             &lt;enumeration value="ShoppingCart"/>
 *             &lt;enumeration value="ProductOrder"/>
 *             &lt;enumeration value="VoucherOrder"/>
 *             &lt;enumeration value="EbayIntro"/>
 *             &lt;enumeration value="CsvImport"/>
 *             &lt;enumeration value="PrintPrecheck"/>
 *             &lt;enumeration value="CollectionOnly"/>
 *             &lt;enumeration value="CollectionOrder"/>
 *             &lt;enumeration value="DownloadPostagePDF"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shipmentId">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="popInternalPageMessage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="popPaymentAcceptRedirectUrl" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="popPaymentRejectRedirectUrl" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="sendRedirect" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartOpenRequestType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/popws", propOrder = {
    "shoppingCart"
})
public class ShoppingCartOpenRequestType
    extends WsRequestType
{

    @XmlElement(name = "ShoppingCart", required = true)
    protected ShoppingCartBaseType shoppingCart;
    @XmlAttribute(name = "acceptAgb")
    protected Boolean acceptAgb;
    @XmlAttribute(name = "notifyUrl")
    protected String notifyUrl;
    @XmlAttribute(name = "sendUserEmail")
    protected Boolean sendUserEmail;
    @XmlAttribute(name = "sendMaptosRSET")
    protected Boolean sendMaptosRSET;
    @XmlAttribute(name = "workflowShowPage")
    protected String workflowShowPage;
    @XmlAttribute(name = "shipmentId")
    protected String shipmentId;
    @XmlAttribute(name = "popInternalPageMessage")
    @XmlSchemaType(name = "anySimpleType")
    protected String popInternalPageMessage;
    @XmlAttribute(name = "popPaymentAcceptRedirectUrl")
    @XmlSchemaType(name = "anySimpleType")
    protected String popPaymentAcceptRedirectUrl;
    @XmlAttribute(name = "popPaymentRejectRedirectUrl")
    @XmlSchemaType(name = "anySimpleType")
    protected String popPaymentRejectRedirectUrl;
    @XmlAttribute(name = "sendRedirect")
    protected Boolean sendRedirect;

    /**
     * Ruft den Wert der shoppingCart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartBaseType }
     *     
     */
    public ShoppingCartBaseType getShoppingCart() {
        return shoppingCart;
    }

    /**
     * Legt den Wert der shoppingCart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartBaseType }
     *     
     */
    public void setShoppingCart(ShoppingCartBaseType value) {
        this.shoppingCart = value;
    }

    /**
     * Ruft den Wert der acceptAgb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAcceptAgb() {
        if (acceptAgb == null) {
            return false;
        } else {
            return acceptAgb;
        }
    }

    /**
     * Legt den Wert der acceptAgb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptAgb(Boolean value) {
        this.acceptAgb = value;
    }

    /**
     * Ruft den Wert der notifyUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Legt den Wert der notifyUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyUrl(String value) {
        this.notifyUrl = value;
    }

    /**
     * Ruft den Wert der sendUserEmail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSendUserEmail() {
        if (sendUserEmail == null) {
            return false;
        } else {
            return sendUserEmail;
        }
    }

    /**
     * Legt den Wert der sendUserEmail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendUserEmail(Boolean value) {
        this.sendUserEmail = value;
    }

    /**
     * Ruft den Wert der sendMaptosRSET-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSendMaptosRSET() {
        if (sendMaptosRSET == null) {
            return false;
        } else {
            return sendMaptosRSET;
        }
    }

    /**
     * Legt den Wert der sendMaptosRSET-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendMaptosRSET(Boolean value) {
        this.sendMaptosRSET = value;
    }

    /**
     * Ruft den Wert der workflowShowPage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowShowPage() {
        if (workflowShowPage == null) {
            return "ShoppingCart";
        } else {
            return workflowShowPage;
        }
    }

    /**
     * Legt den Wert der workflowShowPage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowShowPage(String value) {
        this.workflowShowPage = value;
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
     * Ruft den Wert der popInternalPageMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopInternalPageMessage() {
        return popInternalPageMessage;
    }

    /**
     * Legt den Wert der popInternalPageMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopInternalPageMessage(String value) {
        this.popInternalPageMessage = value;
    }

    /**
     * Ruft den Wert der popPaymentAcceptRedirectUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopPaymentAcceptRedirectUrl() {
        return popPaymentAcceptRedirectUrl;
    }

    /**
     * Legt den Wert der popPaymentAcceptRedirectUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopPaymentAcceptRedirectUrl(String value) {
        this.popPaymentAcceptRedirectUrl = value;
    }

    /**
     * Ruft den Wert der popPaymentRejectRedirectUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopPaymentRejectRedirectUrl() {
        return popPaymentRejectRedirectUrl;
    }

    /**
     * Legt den Wert der popPaymentRejectRedirectUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopPaymentRejectRedirectUrl(String value) {
        this.popPaymentRejectRedirectUrl = value;
    }

    /**
     * Ruft den Wert der sendRedirect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSendRedirect() {
        if (sendRedirect == null) {
            return false;
        } else {
            return sendRedirect;
        }
    }

    /**
     * Legt den Wert der sendRedirect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendRedirect(Boolean value) {
        this.sendRedirect = value;
    }

}
