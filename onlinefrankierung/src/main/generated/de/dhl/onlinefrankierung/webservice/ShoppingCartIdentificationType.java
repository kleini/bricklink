
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Identifiziert einen Warenkorb.
 * 
 *     customerReferenz ist optional.
 * 
 * 
 * 
 *    
 * 
 * <p>Java-Klasse für ShoppingCartIdentificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="shoppingCartId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerReference">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="35"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nextShoppingCartId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartIdentificationType")
@XmlSeeAlso({
    ShoppingCartBaseType.class
})
public class ShoppingCartIdentificationType {

    @XmlAttribute(name = "shoppingCartId")
    protected String shoppingCartId;
    @XmlAttribute(name = "customerReference")
    protected String customerReference;
    @XmlAttribute(name = "nextShoppingCartId")
    protected String nextShoppingCartId;

    /**
     * Ruft den Wert der shoppingCartId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingCartId() {
        return shoppingCartId;
    }

    /**
     * Legt den Wert der shoppingCartId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingCartId(String value) {
        this.shoppingCartId = value;
    }

    /**
     * Ruft den Wert der customerReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Legt den Wert der customerReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Ruft den Wert der nextShoppingCartId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextShoppingCartId() {
        return nextShoppingCartId;
    }

    /**
     * Legt den Wert der nextShoppingCartId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextShoppingCartId(String value) {
        this.nextShoppingCartId = value;
    }

}
