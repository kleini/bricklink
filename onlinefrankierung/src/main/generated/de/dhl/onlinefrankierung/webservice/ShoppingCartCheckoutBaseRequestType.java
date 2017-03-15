
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Siehe auch:
 *     
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc" xmlns:ws="https://www.dhl.de/popweb/gw/ws/schema/1.0/popws"&gt;ShoppingCartCheckoutViaPaymentResponseType&lt;/link&gt;
 * </pre>
 * 
 *     .
 * 
 *    
 * 
 * <p>Java-Klasse für ShoppingCartCheckoutBaseRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartCheckoutBaseRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}WsRequestType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ShoppingCartIdentification" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ShoppingCartIdentificationType"/>
 *           &lt;element name="BuyShoppingCart" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}BuyShoppingCartType"/>
 *         &lt;/choice>
 *         &lt;element name="DirectLabelInfo" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}DirectLabelInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartCheckoutBaseRequestType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", propOrder = {
    "shoppingCartIdentification",
    "buyShoppingCart",
    "directLabelInfo"
})
@XmlSeeAlso({
    ShoppingCartCheckoutViaPaymentRequestType.class
})
public class ShoppingCartCheckoutBaseRequestType
    extends WsRequestType
{

    @XmlElement(name = "ShoppingCartIdentification")
    protected ShoppingCartIdentificationType shoppingCartIdentification;
    @XmlElement(name = "BuyShoppingCart")
    protected BuyShoppingCartType buyShoppingCart;
    @XmlElement(name = "DirectLabelInfo")
    protected DirectLabelInfoType directLabelInfo;

    /**
     * Ruft den Wert der shoppingCartIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartIdentificationType }
     *     
     */
    public ShoppingCartIdentificationType getShoppingCartIdentification() {
        return shoppingCartIdentification;
    }

    /**
     * Legt den Wert der shoppingCartIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartIdentificationType }
     *     
     */
    public void setShoppingCartIdentification(ShoppingCartIdentificationType value) {
        this.shoppingCartIdentification = value;
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

    /**
     * Ruft den Wert der directLabelInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectLabelInfoType }
     *     
     */
    public DirectLabelInfoType getDirectLabelInfo() {
        return directLabelInfo;
    }

    /**
     * Legt den Wert der directLabelInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectLabelInfoType }
     *     
     */
    public void setDirectLabelInfo(DirectLabelInfoType value) {
        this.directLabelInfo = value;
    }

}
