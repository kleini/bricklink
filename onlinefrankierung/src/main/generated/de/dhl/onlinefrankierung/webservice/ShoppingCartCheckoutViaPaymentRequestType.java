
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Ein Warenkorb wird über einen Redirect über eine externe Bezahlplattform bezahlt
 * 
 * <p>Java-Klasse für ShoppingCartCheckoutViaPaymentRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartCheckoutViaPaymentRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}ShoppingCartCheckoutBaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="PartnerBackLinks" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PartnerBackLinksType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartCheckoutViaPaymentRequestType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", propOrder = {
    "partnerBackLinks"
})
public class ShoppingCartCheckoutViaPaymentRequestType
    extends ShoppingCartCheckoutBaseRequestType
{

    @XmlElement(name = "PartnerBackLinks", required = true)
    protected PartnerBackLinksType partnerBackLinks;

    /**
     * Ruft den Wert der partnerBackLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartnerBackLinksType }
     *     
     */
    public PartnerBackLinksType getPartnerBackLinks() {
        return partnerBackLinks;
    }

    /**
     * Legt den Wert der partnerBackLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerBackLinksType }
     *     
     */
    public void setPartnerBackLinks(PartnerBackLinksType value) {
        this.partnerBackLinks = value;
    }

}
