
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Lädt einen gekauften Warenkorb.
 * 
 *     Siehe auch
 *     
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc" xmlns:ws="https://www.dhl.de/popweb/gw/ws/schema/1.0/popws"&gt;LoadBuyedShoppingCartResponseType&lt;/link&gt;
 * </pre>
 * 
 *     .
 *    
 * 
 * <p>Java-Klasse für LoadBuyedShoppingCartRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LoadBuyedShoppingCartRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}WsRequestType">
 *       &lt;sequence>
 *         &lt;element name="ShoppingCartIdentification" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ShoppingCartIdentificationType"/>
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
@XmlType(name = "LoadBuyedShoppingCartRequestType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", propOrder = {
    "shoppingCartIdentification",
    "directLabelInfo"
})
public class LoadBuyedShoppingCartRequestType
    extends WsRequestType
{

    @XmlElement(name = "ShoppingCartIdentification", required = true)
    protected ShoppingCartIdentificationType shoppingCartIdentification;
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
