
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	Veraltet. Bitte 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;link xmlns="http://www.w3.org/2001/XMLSchema" xmlns:base="https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase" xmlns:ps="https://www.dhl.de/popweb/gw/ws/schema/1.0/popps" xmlns:sc="https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc"&gt;PaymentPostpayType&lt;/link&gt;
 * </pre>
 *  verwenden.
 *    
 * 
 * <p>Java-Klasse für PaymentDHLCheckoutType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PaymentDHLCheckoutType">
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
@XmlType(name = "PaymentDHLCheckoutType")
public class PaymentDHLCheckoutType
    extends PaymentBaseType
{


}
