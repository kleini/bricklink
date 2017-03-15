
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VoucherUsageContextType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VoucherUsageContextType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PUBLIC"/>
 *     &lt;enumeration value="SUPPORT"/>
 *     &lt;enumeration value="STORNO"/>
 *     &lt;enumeration value="INTERNAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VoucherUsageContextType", namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popps")
@XmlEnum
public enum VoucherUsageContextType {


    /**
     * Der Coupon kann vom Kunden gekauft werden.
     * 
     */
    PUBLIC,

    /**
     * Der Kundensupport legt Coupons dieses Typs an.
     * 
     */
    SUPPORT,

    /**
     * Coupons dieses Typs können als Gutschrift bei einer Stornierung verwendet werden.
     * 
     */
    STORNO,

    /**
     * Z.B. ein Promotions Coupon
     * 
     */
    INTERNAL;

    public String value() {
        return name();
    }

    public static VoucherUsageContextType fromValue(String v) {
        return valueOf(v);
    }

}
