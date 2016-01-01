/*
 * GPL v3
 */

package org.kleini.bricklink.data;

/**
 * {@link Method} lists available payment methods
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum Method {

    BANK_TRANSFER("Bank Transfer"),
    CASH_NO_COD("Cash (no COD)"),
    IBAN("IBAN"),
    PAYPAL("PayPal"),
    PAYPAL_ONSITE("PayPal (Onsite)");

    private final String value;

    Method(String value) {
        this.value = value;
    }

    public static Method byValue(String value) throws Exception {
        for (Method method : values()) {
            if (method.value.equals(value)) {
                return method;
            }
        }
        throw new Exception("Unknown payment method " + value + '.');
    }
}
