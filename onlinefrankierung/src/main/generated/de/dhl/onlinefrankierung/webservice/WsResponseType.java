
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Basis Typ für alle Web-Responses.
 * 
 *     Es muss immer
 *     
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc" xmlns:ws="https://www.dhl.de/popweb/gw/ws/schema/1.0/popws"&gt;WsResponseStatus&lt;/link&gt;
 * </pre>
 * 
 *     mit den Status-Informationen gesetzt sein.
 * 
 *     Alle anderen Dokumentenanteile sind abhängig vom Erfolg des Web-Service Aufrufs.
 * 
 * <p>Java-Klasse für WsResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}WsResponseStatus"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}VersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsResponseType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", propOrder = {
    "status"
})
@XmlSeeAlso({
    ShoppingCartOpenResponseType.class,
    LoadBuyedShoppingCartResponseType.class,
    ShoppingCartValidateResponseType.class,
    ShoppingCartCheckoutViaPaymentResponseType.class,
    ProductInfoResponseType.class
})
public abstract class WsResponseType {

    @XmlElement(name = "Status", required = true)
    protected WsResponseStatus status;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WsResponseStatus }
     *     
     */
    public WsResponseStatus getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WsResponseStatus }
     *     
     */
    public void setStatus(WsResponseStatus value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
