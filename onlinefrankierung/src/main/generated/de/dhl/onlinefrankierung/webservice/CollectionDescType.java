
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CollectionDescType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollectionDescType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb}ProductServiceDescBaseType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pickupFreeHint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionDescType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb")
public class CollectionDescType
    extends ProductServiceDescBaseType
{

    @XmlAttribute(name = "pickupFreeHint")
    protected String pickupFreeHint;

    /**
     * Ruft den Wert der pickupFreeHint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupFreeHint() {
        return pickupFreeHint;
    }

    /**
     * Legt den Wert der pickupFreeHint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupFreeHint(String value) {
        this.pickupFreeHint = value;
    }

}
