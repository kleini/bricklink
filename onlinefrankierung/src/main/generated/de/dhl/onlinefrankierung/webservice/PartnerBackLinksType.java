
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Wird bei für den Rücksprung auf die Partnerseite verwendet.
 * 
 * <p>Java-Klasse für PartnerBackLinksType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PartnerBackLinksType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="paymentAcceptedUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentRejectedUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerBackLinksType")
public class PartnerBackLinksType {

    @XmlAttribute(name = "paymentAcceptedUrl", required = true)
    protected String paymentAcceptedUrl;
    @XmlAttribute(name = "paymentRejectedUrl", required = true)
    protected String paymentRejectedUrl;

    /**
     * Ruft den Wert der paymentAcceptedUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAcceptedUrl() {
        return paymentAcceptedUrl;
    }

    /**
     * Legt den Wert der paymentAcceptedUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAcceptedUrl(String value) {
        this.paymentAcceptedUrl = value;
    }

    /**
     * Ruft den Wert der paymentRejectedUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRejectedUrl() {
        return paymentRejectedUrl;
    }

    /**
     * Legt den Wert der paymentRejectedUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRejectedUrl(String value) {
        this.paymentRejectedUrl = value;
    }

}
