
package de.dhl.onlinefrankierung.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Daten für ein CN22 und CN23 Formular.
 * 
 *     Wird in einem
 *     
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc"&gt;LabelItemType&lt;/link&gt;
 * </pre>
 * 
 *     verwendet.
 *    
 * 
 * <p>Java-Klasse für Cn22Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Cn22Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypeOfGoods" maxOccurs="5">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="GESCHENK"/>
 *               &lt;enumeration value="DOKUMENTE"/>
 *               &lt;enumeration value="WARENMUSTER"/>
 *               &lt;enumeration value="SONSTIGES"/>
 *               &lt;enumeration value="WARENRUECKSENDUNG"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CnLine" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}Cn2223LineType" maxOccurs="6"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cn23" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="currency" default="EUR">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="bruttoWeight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="typeOtherDeclaration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="billnumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approval" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="otherDeclarations" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cn22Type", propOrder = {
    "typeOfGoods",
    "cnLine"
})
public class Cn22Type {

    @XmlElement(name = "TypeOfGoods", required = true)
    protected List<String> typeOfGoods;
    @XmlElement(name = "CnLine", required = true)
    protected List<Cn2223LineType> cnLine;
    @XmlAttribute(name = "cn23")
    protected Boolean cn23;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "bruttoWeight")
    protected Integer bruttoWeight;
    @XmlAttribute(name = "typeOtherDeclaration")
    protected String typeOtherDeclaration;
    @XmlAttribute(name = "billnumber")
    protected String billnumber;
    @XmlAttribute(name = "approval")
    protected String approval;
    @XmlAttribute(name = "certificate")
    protected String certificate;
    @XmlAttribute(name = "otherDeclarations")
    protected String otherDeclarations;

    /**
     * Gets the value of the typeOfGoods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOfGoods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOfGoods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeOfGoods() {
        if (typeOfGoods == null) {
            typeOfGoods = new ArrayList<String>();
        }
        return this.typeOfGoods;
    }

    /**
     * Gets the value of the cnLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cnLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCnLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cn2223LineType }
     * 
     * 
     */
    public List<Cn2223LineType> getCnLine() {
        if (cnLine == null) {
            cnLine = new ArrayList<Cn2223LineType>();
        }
        return this.cnLine;
    }

    /**
     * Ruft den Wert der cn23-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCn23() {
        if (cn23 == null) {
            return false;
        } else {
            return cn23;
        }
    }

    /**
     * Legt den Wert der cn23-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCn23(Boolean value) {
        this.cn23 = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        if (currency == null) {
            return "EUR";
        } else {
            return currency;
        }
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Ruft den Wert der bruttoWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBruttoWeight() {
        return bruttoWeight;
    }

    /**
     * Legt den Wert der bruttoWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBruttoWeight(Integer value) {
        this.bruttoWeight = value;
    }

    /**
     * Ruft den Wert der typeOtherDeclaration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOtherDeclaration() {
        return typeOtherDeclaration;
    }

    /**
     * Legt den Wert der typeOtherDeclaration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOtherDeclaration(String value) {
        this.typeOtherDeclaration = value;
    }

    /**
     * Ruft den Wert der billnumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillnumber() {
        return billnumber;
    }

    /**
     * Legt den Wert der billnumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillnumber(String value) {
        this.billnumber = value;
    }

    /**
     * Ruft den Wert der approval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproval() {
        return approval;
    }

    /**
     * Legt den Wert der approval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproval(String value) {
        this.approval = value;
    }

    /**
     * Ruft den Wert der certificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Legt den Wert der certificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificate(String value) {
        this.certificate = value;
    }

    /**
     * Ruft den Wert der otherDeclarations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDeclarations() {
        return otherDeclarations;
    }

    /**
     * Legt den Wert der otherDeclarations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDeclarations(String value) {
        this.otherDeclarations = value;
    }

}
