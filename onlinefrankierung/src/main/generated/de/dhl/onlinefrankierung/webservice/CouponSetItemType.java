
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
 *     Ein Couponset zum Kauf.
 * 
 *    
 * 
 * <p>Java-Klasse für CouponSetItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CouponSetItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ItemType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="Coupon" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popps}CouponInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="couponTypeId" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="3"/>
 *             &lt;maxLength value="60"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="chunkSize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponSetItemType", propOrder = {
    "coupon"
})
public class CouponSetItemType
    extends ItemType
{

    @XmlElement(name = "Coupon")
    protected List<CouponInfoType> coupon;
    @XmlAttribute(name = "couponTypeId", required = true)
    protected String couponTypeId;
    @XmlAttribute(name = "chunkSize", required = true)
    protected int chunkSize;

    /**
     * Gets the value of the coupon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coupon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoupon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponInfoType }
     * 
     * 
     */
    public List<CouponInfoType> getCoupon() {
        if (coupon == null) {
            coupon = new ArrayList<CouponInfoType>();
        }
        return this.coupon;
    }

    /**
     * Ruft den Wert der couponTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponTypeId() {
        return couponTypeId;
    }

    /**
     * Legt den Wert der couponTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponTypeId(String value) {
        this.couponTypeId = value;
    }

    /**
     * Ruft den Wert der chunkSize-Eigenschaft ab.
     * 
     */
    public int getChunkSize() {
        return chunkSize;
    }

    /**
     * Legt den Wert der chunkSize-Eigenschaft fest.
     * 
     */
    public void setChunkSize(int value) {
        this.chunkSize = value;
    }

}
