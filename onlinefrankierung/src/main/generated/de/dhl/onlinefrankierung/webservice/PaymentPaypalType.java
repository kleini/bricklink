
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Bezahlung über PayPal.
 * 
 *     Ist das Attribute payPalBillingAgreementId gesetzt, muss die Bezahlung über den
 *     
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc"&gt;ShoppingCartCheckoutDirectRequestType&lt;/link&gt;
 * </pre>
 * 
 *     ausgeführt werden.
 * 
 *     Ansonsten muss die
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc"&gt;ShoppingCartCheckoutViaPaymentRequestType&lt;/link&gt;
 * </pre>
 * 
 *     verwendet werden.
 *    
 * 
 * <p>Java-Klasse für PaymentPaypalType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PaymentPaypalType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentBaseType">
 *       &lt;attribute name="payPalBillingAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentPaypalType")
public class PaymentPaypalType
    extends PaymentBaseType
{

    @XmlAttribute(name = "payPalBillingAgreementId")
    protected String payPalBillingAgreementId;

    /**
     * Ruft den Wert der payPalBillingAgreementId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalBillingAgreementId() {
        return payPalBillingAgreementId;
    }

    /**
     * Legt den Wert der payPalBillingAgreementId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalBillingAgreementId(String value) {
        this.payPalBillingAgreementId = value;
    }

}
