
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Warenkorb für den Kauf
 * 
 * <p>Java-Klasse für BuyShoppingCartType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BuyShoppingCartType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ShoppingCartBaseType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="PaymentNullpay" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentNullpayType"/>
 *           &lt;element name="PaymentGiropay" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentGiropayType"/>
 *           &lt;element name="PaymentPartner" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentPartnerpayType"/>
 *           &lt;element name="PaymentCreditcard" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentCreditcardType"/>
 *           &lt;element name="PaymentPaypal" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentPaypalType"/>
 *           &lt;element name="PaymentDHLCheckout" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentDHLCheckoutType"/>
 *           &lt;element name="PaymentPostpay" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentPostpayType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="acceptAgb" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="notifyUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sendUserEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="sendMaptosRSET" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyShoppingCartType", propOrder = {
    "paymentNullpay",
    "paymentGiropay",
    "paymentPartner",
    "paymentCreditcard",
    "paymentPaypal",
    "paymentDHLCheckout",
    "paymentPostpay"
})
public class BuyShoppingCartType
    extends ShoppingCartBaseType
{

    @XmlElement(name = "PaymentNullpay")
    protected PaymentNullpayType paymentNullpay;
    @XmlElement(name = "PaymentGiropay")
    protected PaymentGiropayType paymentGiropay;
    @XmlElement(name = "PaymentPartner")
    protected PaymentPartnerpayType paymentPartner;
    @XmlElement(name = "PaymentCreditcard")
    protected PaymentCreditcardType paymentCreditcard;
    @XmlElement(name = "PaymentPaypal")
    protected PaymentPaypalType paymentPaypal;
    @XmlElement(name = "PaymentDHLCheckout")
    protected PaymentDHLCheckoutType paymentDHLCheckout;
    @XmlElement(name = "PaymentPostpay")
    protected PaymentPostpayType paymentPostpay;
    @XmlAttribute(name = "acceptAgb")
    protected Boolean acceptAgb;
    @XmlAttribute(name = "notifyUrl")
    protected String notifyUrl;
    @XmlAttribute(name = "sendUserEmail")
    protected Boolean sendUserEmail;
    @XmlAttribute(name = "sendMaptosRSET")
    protected Boolean sendMaptosRSET;

    /**
     * Ruft den Wert der paymentNullpay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentNullpayType }
     *     
     */
    public PaymentNullpayType getPaymentNullpay() {
        return paymentNullpay;
    }

    /**
     * Legt den Wert der paymentNullpay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentNullpayType }
     *     
     */
    public void setPaymentNullpay(PaymentNullpayType value) {
        this.paymentNullpay = value;
    }

    /**
     * Ruft den Wert der paymentGiropay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentGiropayType }
     *     
     */
    public PaymentGiropayType getPaymentGiropay() {
        return paymentGiropay;
    }

    /**
     * Legt den Wert der paymentGiropay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentGiropayType }
     *     
     */
    public void setPaymentGiropay(PaymentGiropayType value) {
        this.paymentGiropay = value;
    }

    /**
     * Ruft den Wert der paymentPartner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPartnerpayType }
     *     
     */
    public PaymentPartnerpayType getPaymentPartner() {
        return paymentPartner;
    }

    /**
     * Legt den Wert der paymentPartner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPartnerpayType }
     *     
     */
    public void setPaymentPartner(PaymentPartnerpayType value) {
        this.paymentPartner = value;
    }

    /**
     * Ruft den Wert der paymentCreditcard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCreditcardType }
     *     
     */
    public PaymentCreditcardType getPaymentCreditcard() {
        return paymentCreditcard;
    }

    /**
     * Legt den Wert der paymentCreditcard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCreditcardType }
     *     
     */
    public void setPaymentCreditcard(PaymentCreditcardType value) {
        this.paymentCreditcard = value;
    }

    /**
     * Ruft den Wert der paymentPaypal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPaypalType }
     *     
     */
    public PaymentPaypalType getPaymentPaypal() {
        return paymentPaypal;
    }

    /**
     * Legt den Wert der paymentPaypal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPaypalType }
     *     
     */
    public void setPaymentPaypal(PaymentPaypalType value) {
        this.paymentPaypal = value;
    }

    /**
     * Ruft den Wert der paymentDHLCheckout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDHLCheckoutType }
     *     
     */
    public PaymentDHLCheckoutType getPaymentDHLCheckout() {
        return paymentDHLCheckout;
    }

    /**
     * Legt den Wert der paymentDHLCheckout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDHLCheckoutType }
     *     
     */
    public void setPaymentDHLCheckout(PaymentDHLCheckoutType value) {
        this.paymentDHLCheckout = value;
    }

    /**
     * Ruft den Wert der paymentPostpay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPostpayType }
     *     
     */
    public PaymentPostpayType getPaymentPostpay() {
        return paymentPostpay;
    }

    /**
     * Legt den Wert der paymentPostpay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPostpayType }
     *     
     */
    public void setPaymentPostpay(PaymentPostpayType value) {
        this.paymentPostpay = value;
    }

    /**
     * Ruft den Wert der acceptAgb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAcceptAgb() {
        if (acceptAgb == null) {
            return false;
        } else {
            return acceptAgb;
        }
    }

    /**
     * Legt den Wert der acceptAgb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptAgb(Boolean value) {
        this.acceptAgb = value;
    }

    /**
     * Ruft den Wert der notifyUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Legt den Wert der notifyUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyUrl(String value) {
        this.notifyUrl = value;
    }

    /**
     * Ruft den Wert der sendUserEmail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSendUserEmail() {
        if (sendUserEmail == null) {
            return false;
        } else {
            return sendUserEmail;
        }
    }

    /**
     * Legt den Wert der sendUserEmail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendUserEmail(Boolean value) {
        this.sendUserEmail = value;
    }

    /**
     * Ruft den Wert der sendMaptosRSET-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSendMaptosRSET() {
        if (sendMaptosRSET == null) {
            return false;
        } else {
            return sendMaptosRSET;
        }
    }

    /**
     * Legt den Wert der sendMaptosRSET-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendMaptosRSET(Boolean value) {
        this.sendMaptosRSET = value;
    }

}
