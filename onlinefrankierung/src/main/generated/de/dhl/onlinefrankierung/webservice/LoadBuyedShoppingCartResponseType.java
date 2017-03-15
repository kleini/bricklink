
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Siehe auch
 *     
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc" xmlns:ws="https://www.dhl.de/popweb/gw/ws/schema/1.0/popws"&gt;LoadBuyedShoppingCartRequestType&lt;/link&gt;
 * </pre>
 * 
 *     .
 *    
 * 
 * <p>Java-Klasse für LoadBuyedShoppingCartResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LoadBuyedShoppingCartResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}WsResponseType">
 *       &lt;sequence>
 *         &lt;element name="DownloadShoppingCart" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}DownloadShoppingCartType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadBuyedShoppingCartResponseType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", propOrder = {
    "downloadShoppingCart"
})
public class LoadBuyedShoppingCartResponseType
    extends WsResponseType
{

    @XmlElement(name = "DownloadShoppingCart")
    protected DownloadShoppingCartType downloadShoppingCart;

    /**
     * Ruft den Wert der downloadShoppingCart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DownloadShoppingCartType }
     *     
     */
    public DownloadShoppingCartType getDownloadShoppingCart() {
        return downloadShoppingCart;
    }

    /**
     * Legt den Wert der downloadShoppingCart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadShoppingCartType }
     *     
     */
    public void setDownloadShoppingCart(DownloadShoppingCartType value) {
        this.downloadShoppingCart = value;
    }

}
