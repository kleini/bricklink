
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 		Enthält abhängig davon ob im Request angefragt wurde, base64 kodierte Label Daten.
 *      
 * 
 * <p>Java-Klasse für DirectLabelType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DirectLabelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Base64Label" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}Base64LabelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectLabelType", propOrder = {
    "base64Label"
})
public class DirectLabelType {

    @XmlElement(name = "Base64Label")
    protected Base64LabelType base64Label;

    /**
     * Ruft den Wert der base64Label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Base64LabelType }
     *     
     */
    public Base64LabelType getBase64Label() {
        return base64Label;
    }

    /**
     * Legt den Wert der base64Label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64LabelType }
     *     
     */
    public void setBase64Label(Base64LabelType value) {
        this.base64Label = value;
    }

}
