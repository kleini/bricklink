
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DownloadShoppingCartType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DownloadShoppingCartType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ShoppingCartBaseType">
 *       &lt;sequence>
 *         &lt;element name="PaymentInfo" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentInfoType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="downloadPageUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appletUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cancelSumAmount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="invoiceUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="notifyUrlExt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadShoppingCartType", propOrder = {
    "paymentInfo"
})
public class DownloadShoppingCartType
    extends ShoppingCartBaseType
{

    @XmlElement(name = "PaymentInfo", required = true)
    protected PaymentInfoType paymentInfo;
    @XmlAttribute(name = "downloadPageUrl")
    protected String downloadPageUrl;
    @XmlAttribute(name = "appletUrl")
    protected String appletUrl;
    @XmlAttribute(name = "cancelSumAmount")
    protected Double cancelSumAmount;
    @XmlAttribute(name = "invoiceUrl")
    protected String invoiceUrl;
    @XmlAttribute(name = "notifyUrlExt")
    protected String notifyUrlExt;

    /**
     * Ruft den Wert der paymentInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoType }
     *     
     */
    public PaymentInfoType getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Legt den Wert der paymentInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoType }
     *     
     */
    public void setPaymentInfo(PaymentInfoType value) {
        this.paymentInfo = value;
    }

    /**
     * Ruft den Wert der downloadPageUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadPageUrl() {
        return downloadPageUrl;
    }

    /**
     * Legt den Wert der downloadPageUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadPageUrl(String value) {
        this.downloadPageUrl = value;
    }

    /**
     * Ruft den Wert der appletUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppletUrl() {
        return appletUrl;
    }

    /**
     * Legt den Wert der appletUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppletUrl(String value) {
        this.appletUrl = value;
    }

    /**
     * Ruft den Wert der cancelSumAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCancelSumAmount() {
        return cancelSumAmount;
    }

    /**
     * Legt den Wert der cancelSumAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCancelSumAmount(Double value) {
        this.cancelSumAmount = value;
    }

    /**
     * Ruft den Wert der invoiceUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    /**
     * Legt den Wert der invoiceUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceUrl(String value) {
        this.invoiceUrl = value;
    }

    /**
     * Ruft den Wert der notifyUrlExt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyUrlExt() {
        return notifyUrlExt;
    }

    /**
     * Legt den Wert der notifyUrlExt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyUrlExt(String value) {
        this.notifyUrlExt = value;
    }

}
