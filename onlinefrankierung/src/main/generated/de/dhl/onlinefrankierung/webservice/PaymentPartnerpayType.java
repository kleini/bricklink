
package de.dhl.onlinefrankierung.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Enthält Daten für ein partnerseitige Implementierung des Accounting.
 * 
 *     Die einzelnen Felder sind Transparent und können von der Partner-Bezahlschnittstelle verwendet werden.
 * 
 *     Auf dem Testsystem ist als Partner DUMMYPAY (paymentId muss auf DUMMYPAY gesetzt sein).
 * 
 *     Für DHL-Interne Zwecke und entsprechenden Rechten kann als Partner auch EFIALEPAY verwendet werden.
 * 
 *     Siehe auch
 *     
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc"&gt;ShoppingCartCheckoutViaPaymentRequestType&lt;/link&gt;
 * </pre>
 * 
 *     und
 *     
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc"&gt;ShoppingCartCheckoutDirectRequestType&lt;/link&gt;
 * </pre>
 * 
 *     .
 *    
 * 
 * <p>Java-Klasse für PaymentPartnerpayType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PaymentPartnerpayType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentBaseType">
 *       &lt;attribute name="userId1">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="60"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="userId2">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="60"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="paymentAccount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentTx1">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="60"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="paymentTx2">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="60"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="maxBruttoAmount" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}AmountType" />
 *       &lt;attribute name="minBruttoAmount" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}AmountType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentPartnerpayType")
public class PaymentPartnerpayType
    extends PaymentBaseType
{

    @XmlAttribute(name = "userId1")
    protected String userId1;
    @XmlAttribute(name = "userId2")
    protected String userId2;
    @XmlAttribute(name = "paymentAccount")
    protected String paymentAccount;
    @XmlAttribute(name = "paymentTx1")
    protected String paymentTx1;
    @XmlAttribute(name = "paymentTx2")
    protected String paymentTx2;
    @XmlAttribute(name = "maxBruttoAmount")
    protected BigDecimal maxBruttoAmount;
    @XmlAttribute(name = "minBruttoAmount")
    protected BigDecimal minBruttoAmount;

    /**
     * Ruft den Wert der userId1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId1() {
        return userId1;
    }

    /**
     * Legt den Wert der userId1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId1(String value) {
        this.userId1 = value;
    }

    /**
     * Ruft den Wert der userId2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId2() {
        return userId2;
    }

    /**
     * Legt den Wert der userId2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId2(String value) {
        this.userId2 = value;
    }

    /**
     * Ruft den Wert der paymentAccount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccount() {
        return paymentAccount;
    }

    /**
     * Legt den Wert der paymentAccount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccount(String value) {
        this.paymentAccount = value;
    }

    /**
     * Ruft den Wert der paymentTx1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTx1() {
        return paymentTx1;
    }

    /**
     * Legt den Wert der paymentTx1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTx1(String value) {
        this.paymentTx1 = value;
    }

    /**
     * Ruft den Wert der paymentTx2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTx2() {
        return paymentTx2;
    }

    /**
     * Legt den Wert der paymentTx2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTx2(String value) {
        this.paymentTx2 = value;
    }

    /**
     * Ruft den Wert der maxBruttoAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxBruttoAmount() {
        return maxBruttoAmount;
    }

    /**
     * Legt den Wert der maxBruttoAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxBruttoAmount(BigDecimal value) {
        this.maxBruttoAmount = value;
    }

    /**
     * Ruft den Wert der minBruttoAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinBruttoAmount() {
        return minBruttoAmount;
    }

    /**
     * Legt den Wert der minBruttoAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinBruttoAmount(BigDecimal value) {
        this.minBruttoAmount = value;
    }

}
