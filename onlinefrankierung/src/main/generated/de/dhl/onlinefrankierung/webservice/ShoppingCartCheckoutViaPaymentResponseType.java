
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Antwort eines Warenkorbes.
 *     Die Antwort.
 *    
 * 
 * <p>Java-Klasse für ShoppingCartCheckoutViaPaymentResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartCheckoutViaPaymentResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}WsResponseType">
 *       &lt;sequence>
 *         &lt;element name="PaymentForwardShoppingCart" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentForwardShoppingCartType" minOccurs="0"/>
 *         &lt;element name="BuyShoppingCart" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}BuyShoppingCartType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartCheckoutViaPaymentResponseType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", propOrder = {
    "paymentForwardShoppingCart",
    "buyShoppingCart"
})
public class ShoppingCartCheckoutViaPaymentResponseType
    extends WsResponseType
{

    @XmlElement(name = "PaymentForwardShoppingCart")
    protected PaymentForwardShoppingCartType paymentForwardShoppingCart;
    @XmlElement(name = "BuyShoppingCart")
    protected BuyShoppingCartType buyShoppingCart;

    /**
     * Ruft den Wert der paymentForwardShoppingCart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentForwardShoppingCartType }
     *     
     */
    public PaymentForwardShoppingCartType getPaymentForwardShoppingCart() {
        return paymentForwardShoppingCart;
    }

    /**
     * Legt den Wert der paymentForwardShoppingCart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentForwardShoppingCartType }
     *     
     */
    public void setPaymentForwardShoppingCart(PaymentForwardShoppingCartType value) {
        this.paymentForwardShoppingCart = value;
    }

    /**
     * Ruft den Wert der buyShoppingCart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BuyShoppingCartType }
     *     
     */
    public BuyShoppingCartType getBuyShoppingCart() {
        return buyShoppingCart;
    }

    /**
     * Legt den Wert der buyShoppingCart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyShoppingCartType }
     *     
     */
    public void setBuyShoppingCart(BuyShoppingCartType value) {
        this.buyShoppingCart = value;
    }

}
