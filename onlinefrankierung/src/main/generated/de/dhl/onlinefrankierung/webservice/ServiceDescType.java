
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Beschreibung des Services.
 * 
 * <p>Java-Klasse für ServiceDescType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceDescType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}ProductServiceDescBaseType">
 *       &lt;attribute name="orderKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serviceGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serviceGroupDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="syntetic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDescType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb")
public class ServiceDescType
    extends ProductServiceDescBaseType
{

    @XmlAttribute(name = "orderKey")
    protected String orderKey;
    @XmlAttribute(name = "serviceGroup")
    protected String serviceGroup;
    @XmlAttribute(name = "serviceGroupDefault")
    protected Boolean serviceGroupDefault;
    @XmlAttribute(name = "syntetic")
    protected Boolean syntetic;

    /**
     * Ruft den Wert der orderKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderKey() {
        return orderKey;
    }

    /**
     * Legt den Wert der orderKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderKey(String value) {
        this.orderKey = value;
    }

    /**
     * Ruft den Wert der serviceGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceGroup() {
        return serviceGroup;
    }

    /**
     * Legt den Wert der serviceGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceGroup(String value) {
        this.serviceGroup = value;
    }

    /**
     * Ruft den Wert der serviceGroupDefault-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isServiceGroupDefault() {
        if (serviceGroupDefault == null) {
            return false;
        } else {
            return serviceGroupDefault;
        }
    }

    /**
     * Legt den Wert der serviceGroupDefault-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceGroupDefault(Boolean value) {
        this.serviceGroupDefault = value;
    }

    /**
     * Ruft den Wert der syntetic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSyntetic() {
        if (syntetic == null) {
            return false;
        } else {
            return syntetic;
        }
    }

    /**
     * Legt den Wert der syntetic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyntetic(Boolean value) {
        this.syntetic = value;
    }

}
