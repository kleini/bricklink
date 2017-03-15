
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Basistyp für Web-Requests.
 * 
 *     Teile von
 *     
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc" xmlns:ws="https://www.dhl.de/popweb/gw/ws/schema/1.0/popws"&gt;AuthType&lt;/link&gt;
 * </pre>
 * 
 *     müssen mitgesendet werden.
 *    
 * 
 * <p>Java-Klasse für WsRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popws}AuthType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="detailFlags" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="version" use="required" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}VersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsRequestType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", propOrder = {
    "auth"
})
@XmlSeeAlso({
    ShoppingCartOpenRequestType.class,
    LoadBuyedShoppingCartRequestType.class,
    ShoppingCartValidateRequestType.class,
    ShoppingCartCheckoutBaseRequestType.class,
    ProductInfoRequestType.class
})
public abstract class WsRequestType {

    @XmlElement(name = "Auth", required = true)
    protected AuthType auth;
    @XmlAttribute(name = "detailFlags")
    protected Long detailFlags;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Ruft den Wert der auth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AuthType }
     *     
     */
    public AuthType getAuth() {
        return auth;
    }

    /**
     * Legt den Wert der auth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthType }
     *     
     */
    public void setAuth(AuthType value) {
        this.auth = value;
    }

    /**
     * Ruft den Wert der detailFlags-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDetailFlags() {
        return detailFlags;
    }

    /**
     * Legt den Wert der detailFlags-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDetailFlags(Long value) {
        this.detailFlags = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
