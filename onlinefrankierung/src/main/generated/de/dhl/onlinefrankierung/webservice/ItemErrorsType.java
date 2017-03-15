
package de.dhl.onlinefrankierung.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List von Fehlerbeschreibungen.
 * 
 * <p>Java-Klasse für ItemErrorsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ItemErrorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemError" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ItemErrorType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemErrorsType", propOrder = {
    "itemError"
})
public class ItemErrorsType {

    @XmlElement(name = "ItemError", required = true)
    protected List<ItemErrorType> itemError;

    /**
     * Gets the value of the itemError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemErrorType }
     * 
     * 
     */
    public List<ItemErrorType> getItemError() {
        if (itemError == null) {
            itemError = new ArrayList<ItemErrorType>();
        }
        return this.itemError;
    }

}
