
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Validiert einen Warenkorb.
 * 
 *     Siehe auch:
 *     
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc" xmlns:ws="https://www.dhl.de/popweb/gw/ws/schema/1.0/popws"&gt;ShoppingCartValidateResponseType&lt;/link&gt;
 * </pre>
 * 
 *     .
 *    
 * 
 * <p>Java-Klasse für ShoppingCartValidateRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartValidateRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}WsRequestType">
 *       &lt;sequence>
 *         &lt;element name="ShoppingCart" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}BuyShoppingCartType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="persist" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartValidateRequestType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", propOrder = {
    "shoppingCart"
})
public class ShoppingCartValidateRequestType
    extends WsRequestType
{

    @XmlElement(name = "ShoppingCart", required = true)
    protected BuyShoppingCartType shoppingCart;
    @XmlAttribute(name = "persist")
    protected Boolean persist;

    /**
     * Ruft den Wert der shoppingCart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BuyShoppingCartType }
     *     
     */
    public BuyShoppingCartType getShoppingCart() {
        return shoppingCart;
    }

    /**
     * Legt den Wert der shoppingCart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyShoppingCartType }
     *     
     */
    public void setShoppingCart(BuyShoppingCartType value) {
        this.shoppingCart = value;
    }

    /**
     * Ruft den Wert der persist-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPersist() {
        if (persist == null) {
            return false;
        } else {
            return persist;
        }
    }

    /**
     * Legt den Wert der persist-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersist(Boolean value) {
        this.persist = value;
    }

}
