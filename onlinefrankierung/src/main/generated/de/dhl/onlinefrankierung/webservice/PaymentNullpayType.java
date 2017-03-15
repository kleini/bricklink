
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     NULLPAY darf nur verwendet werden, wenn die Warenkorbsumme 0 ist.
 * 
 *     Die Warenkorbposition müssen kostenfrei oder über Coupons komplett abgeckt sein.
 * 
 *    
 * 
 * <p>Java-Klasse für PaymentNullpayType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PaymentNullpayType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}PaymentBaseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentNullpayType")
public class PaymentNullpayType
    extends PaymentBaseType
{


}
