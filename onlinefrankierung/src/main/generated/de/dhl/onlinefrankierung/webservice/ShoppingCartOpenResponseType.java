
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Eine Redirect URL wird zu dem zu kaufenden Warenkorb zurückgegeben
 *                 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc" xmlns:ws="https://www.dhl.de/popweb/gw/ws/schema/1.0/popws" xmlns:ws_2_0="https://www.dhl.de/popweb/gw/ws/schema/2.0/popws"&gt;ShoppingCartOpenRequestType&lt;/link&gt;
 * </pre>
 * 
 *                 .
 *             
 * 
 * <p>Java-Klasse für ShoppingCartOpenResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartOpenResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}WsResponseType">
 *       &lt;attribute name="redirectUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shoppingCartId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartOpenResponseType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/popws")
public class ShoppingCartOpenResponseType
    extends WsResponseType
{

    @XmlAttribute(name = "redirectUrl")
    protected String redirectUrl;
    @XmlAttribute(name = "shoppingCartId")
    protected String shoppingCartId;

    /**
     * Ruft den Wert der redirectUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Legt den Wert der redirectUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectUrl(String value) {
        this.redirectUrl = value;
    }

    /**
     * Ruft den Wert der shoppingCartId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingCartId() {
        return shoppingCartId;
    }

    /**
     * Legt den Wert der shoppingCartId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingCartId(String value) {
        this.shoppingCartId = value;
    }

}
