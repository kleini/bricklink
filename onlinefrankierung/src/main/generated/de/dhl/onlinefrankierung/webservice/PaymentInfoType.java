
package de.dhl.onlinefrankierung.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Informationen zu einem Bezahlstatus. (Intern: siehe PaymentResultDO)
 * 
 * <p>Java-Klasse für PaymentInfoType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PaymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="PaymentResults" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentResultsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="transactionId1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transactionId2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userEmail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentRC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="statusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentLongMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="confirmStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfoType", propOrder = {
    "paymentResults"
})
public class PaymentInfoType {

    @XmlElement(name = "PaymentResults")
    protected List<PaymentResultsType> paymentResults;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "transactionId1")
    protected String transactionId1;
    @XmlAttribute(name = "transactionId2")
    protected String transactionId2;
    @XmlAttribute(name = "userEmail")
    protected String userEmail;
    @XmlAttribute(name = "userId")
    protected String userId;
    @XmlAttribute(name = "accountNumber")
    protected String accountNumber;
    @XmlAttribute(name = "bankCode")
    protected String bankCode;
    @XmlAttribute(name = "paymentCode")
    protected String paymentCode;
    @XmlAttribute(name = "paymentMessage")
    protected String paymentMessage;
    @XmlAttribute(name = "paymentRC")
    protected String paymentRC;
    @XmlAttribute(name = "statusDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;
    @XmlAttribute(name = "paymentId")
    protected String paymentId;
    @XmlAttribute(name = "paymentLongMessage")
    protected String paymentLongMessage;
    @XmlAttribute(name = "confirmStatus")
    protected String confirmStatus;
    @XmlAttribute(name = "paymentMethod")
    protected String paymentMethod;

    /**
     * Gets the value of the paymentResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentResultsType }
     * 
     * 
     */
    public List<PaymentResultsType> getPaymentResults() {
        if (paymentResults == null) {
            paymentResults = new ArrayList<PaymentResultsType>();
        }
        return this.paymentResults;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der transactionId1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId1() {
        return transactionId1;
    }

    /**
     * Legt den Wert der transactionId1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId1(String value) {
        this.transactionId1 = value;
    }

    /**
     * Ruft den Wert der transactionId2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId2() {
        return transactionId2;
    }

    /**
     * Legt den Wert der transactionId2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId2(String value) {
        this.transactionId2 = value;
    }

    /**
     * Ruft den Wert der userEmail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Legt den Wert der userEmail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmail(String value) {
        this.userEmail = value;
    }

    /**
     * Ruft den Wert der userId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Legt den Wert der userId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Ruft den Wert der accountNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Legt den Wert der accountNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Ruft den Wert der bankCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Legt den Wert der bankCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Ruft den Wert der paymentCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * Legt den Wert der paymentCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCode(String value) {
        this.paymentCode = value;
    }

    /**
     * Ruft den Wert der paymentMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMessage() {
        return paymentMessage;
    }

    /**
     * Legt den Wert der paymentMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMessage(String value) {
        this.paymentMessage = value;
    }

    /**
     * Ruft den Wert der paymentRC-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRC() {
        return paymentRC;
    }

    /**
     * Legt den Wert der paymentRC-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRC(String value) {
        this.paymentRC = value;
    }

    /**
     * Ruft den Wert der statusDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Legt den Wert der statusDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Ruft den Wert der paymentId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Legt den Wert der paymentId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * Ruft den Wert der paymentLongMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentLongMessage() {
        return paymentLongMessage;
    }

    /**
     * Legt den Wert der paymentLongMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentLongMessage(String value) {
        this.paymentLongMessage = value;
    }

    /**
     * Ruft den Wert der confirmStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * Legt den Wert der confirmStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmStatus(String value) {
        this.confirmStatus = value;
    }

    /**
     * Ruft den Wert der paymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Legt den Wert der paymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

}
