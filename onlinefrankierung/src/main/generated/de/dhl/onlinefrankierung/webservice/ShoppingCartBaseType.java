
package de.dhl.onlinefrankierung.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Basistyp für Warenkorb
 * 
 * <p>Java-Klasse für ShoppingCartBaseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ShoppingCartIdentificationType">
 *       &lt;sequence>
 *         &lt;element name="ItemError" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ItemErrorsType" minOccurs="0"/>
 *         &lt;element name="Orderer" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}BaseLabelAddressType" minOccurs="0"/>
 *         &lt;sequence maxOccurs="99" minOccurs="0">
 *           &lt;choice>
 *             &lt;element name="LabelItem" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}LabelItemType"/>
 *             &lt;element name="MTItem" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}MTItemType"/>
 *             &lt;element name="CouponSetItem" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}CouponSetItemType"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="PickupItem" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PickupItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartBaseType", propOrder = {
    "itemError",
    "orderer",
    "labelItemOrMTItemOrCouponSetItem",
    "pickupItem"
})
@XmlSeeAlso({
    DownloadShoppingCartType.class,
    BuyShoppingCartType.class
})
public class ShoppingCartBaseType
    extends ShoppingCartIdentificationType
{

    @XmlElement(name = "ItemError")
    protected ItemErrorsType itemError;
    @XmlElement(name = "Orderer")
    protected BaseLabelAddressType orderer;
    @XmlElements({
        @XmlElement(name = "LabelItem", type = LabelItemType.class),
        @XmlElement(name = "MTItem", type = MTItemType.class),
        @XmlElement(name = "CouponSetItem", type = CouponSetItemType.class)
    })
    protected List<ItemType> labelItemOrMTItemOrCouponSetItem;
    @XmlElement(name = "PickupItem")
    protected PickupItemType pickupItem;

    /**
     * Ruft den Wert der itemError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemErrorsType }
     *     
     */
    public ItemErrorsType getItemError() {
        return itemError;
    }

    /**
     * Legt den Wert der itemError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemErrorsType }
     *     
     */
    public void setItemError(ItemErrorsType value) {
        this.itemError = value;
    }

    /**
     * Ruft den Wert der orderer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BaseLabelAddressType }
     *     
     */
    public BaseLabelAddressType getOrderer() {
        return orderer;
    }

    /**
     * Legt den Wert der orderer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseLabelAddressType }
     *     
     */
    public void setOrderer(BaseLabelAddressType value) {
        this.orderer = value;
    }

    /**
     * Gets the value of the labelItemOrMTItemOrCouponSetItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelItemOrMTItemOrCouponSetItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelItemOrMTItemOrCouponSetItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelItemType }
     * {@link MTItemType }
     * {@link CouponSetItemType }
     * 
     * 
     */
    public List<ItemType> getLabelItemOrMTItemOrCouponSetItem() {
        if (labelItemOrMTItemOrCouponSetItem == null) {
            labelItemOrMTItemOrCouponSetItem = new ArrayList<ItemType>();
        }
        return this.labelItemOrMTItemOrCouponSetItem;
    }

    /**
     * Ruft den Wert der pickupItem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PickupItemType }
     *     
     */
    public PickupItemType getPickupItem() {
        return pickupItem;
    }

    /**
     * Legt den Wert der pickupItem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupItemType }
     *     
     */
    public void setPickupItem(PickupItemType value) {
        this.pickupItem = value;
    }

}
