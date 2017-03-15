
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ProductInfoResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProductInfoResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}WsResponseType">
 *       &lt;sequence>
 *         &lt;element name="MarketplaceProducts" type="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}MarketplaceProductsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInfoResponseType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb", propOrder = {
    "marketplaceProducts"
})
public class ProductInfoResponseType
    extends WsResponseType
{

    @XmlElement(name = "MarketplaceProducts")
    protected MarketplaceProductsType marketplaceProducts;

    /**
     * Ruft den Wert der marketplaceProducts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplaceProductsType }
     *     
     */
    public MarketplaceProductsType getMarketplaceProducts() {
        return marketplaceProducts;
    }

    /**
     * Legt den Wert der marketplaceProducts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplaceProductsType }
     *     
     */
    public void setMarketplaceProducts(MarketplaceProductsType value) {
        this.marketplaceProducts = value;
    }

}
