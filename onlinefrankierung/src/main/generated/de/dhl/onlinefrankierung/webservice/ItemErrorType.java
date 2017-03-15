
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Ein Fehler
 * 
 * <p>Java-Klasse für ItemErrorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ItemErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="itemId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="printable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="i18nkey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="detailed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="messageType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ERROR"/>
 *             &lt;enumeration value="WARNING"/>
 *             &lt;enumeration value="BLOCKINGERROR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemErrorType")
public class ItemErrorType {

    @XmlAttribute(name = "itemId")
    protected Integer itemId;
    @XmlAttribute(name = "printable")
    protected Boolean printable;
    @XmlAttribute(name = "i18nkey")
    protected String i18Nkey;
    @XmlAttribute(name = "detailed")
    protected Boolean detailed;
    @XmlAttribute(name = "messageType")
    protected String messageType;
    @XmlAttribute(name = "message")
    protected String message;

    /**
     * Ruft den Wert der itemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Legt den Wert der itemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemId(Integer value) {
        this.itemId = value;
    }

    /**
     * Ruft den Wert der printable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintable() {
        return printable;
    }

    /**
     * Legt den Wert der printable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintable(Boolean value) {
        this.printable = value;
    }

    /**
     * Ruft den Wert der i18Nkey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI18Nkey() {
        return i18Nkey;
    }

    /**
     * Legt den Wert der i18Nkey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI18Nkey(String value) {
        this.i18Nkey = value;
    }

    /**
     * Ruft den Wert der detailed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetailed() {
        return detailed;
    }

    /**
     * Legt den Wert der detailed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailed(Boolean value) {
        this.detailed = value;
    }

    /**
     * Ruft den Wert der messageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Legt den Wert der messageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
