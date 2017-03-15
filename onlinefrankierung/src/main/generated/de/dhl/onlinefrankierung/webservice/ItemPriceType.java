
package de.dhl.onlinefrankierung.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Preis. Setzt sich aus mehreren Preiskomponenten zusammen, wobei jedes Preiselement eine eigene MwSt. hat.
 *    
 * 
 * <p>Java-Klasse für ItemPriceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ItemPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="PriceComponents" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}PriceComponentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPriceType", propOrder = {
    "priceComponents"
})
public class ItemPriceType {

    @XmlElement(name = "PriceComponents")
    protected List<PriceComponentType> priceComponents;

    /**
     * Gets the value of the priceComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceComponentType }
     * 
     * 
     */
    public List<PriceComponentType> getPriceComponents() {
        if (priceComponents == null) {
            priceComponents = new ArrayList<PriceComponentType>();
        }
        return this.priceComponents;
    }

}
