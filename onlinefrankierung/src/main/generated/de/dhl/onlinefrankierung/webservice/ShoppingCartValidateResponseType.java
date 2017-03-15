
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Ergebnis einer Warenkorbvalidierung.
 * 
 *     Reflektiert den kompletten Warenkorb inklusive der Preise der Einzelposition und Preisbestandteile (Basisprodukt,
 *     Services) zurück.
 * 
 *     Der ResponseStatus reflektiert nur grundsätzliche Werte:
 * 
 *     - Warenkorb OK.
 * 
 *     - Warenkorb enthält Warnungen, ist aber kaufbar.
 * 
 *     - Warenkorb enthält Kaufverhindernde Fehler.
 * 
 *     Die einzelnen Validierungsfehler sind über die
 *     
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc" xmlns:ws="https://www.dhl.de/popweb/gw/ws/schema/1.0/popws"&gt;ItemErrorsType&lt;/link&gt;
 * </pre>
 * 
 *     verfügbar.
 * 
 *     Siehe auch
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc" xmlns:ws="https://www.dhl.de/popweb/gw/ws/schema/1.0/popws"&gt;ShoppingCartValidateRequestType&lt;/link&gt;
 * </pre>
 * 
 *     .
 *    
 * 
 * <p>Java-Klasse für ShoppingCartValidateResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartValidateResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}WsResponseType">
 *       &lt;sequence>
 *         &lt;element name="ShoppingCart" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}BuyShoppingCartType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartValidateResponseType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", propOrder = {
    "shoppingCart"
})
public class ShoppingCartValidateResponseType
    extends WsResponseType
{

    @XmlElement(name = "ShoppingCart")
    protected BuyShoppingCartType shoppingCart;

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

}
