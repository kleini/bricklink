/*
 * GPL v3
 */

package org.kleini.bricklink.data;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * {@link Payment}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Payment {

    /**
     * The payment method for this order
     */
    private Method method;

    /**
     * Currency code of the payment
     */
    private Currency currency;

    /**
     * The time the buyer paid
     */
    private Date paid;

    /**
     * Payment status
     */
    private String status;

    public Payment() {
        super();
    }

    @JsonProperty("method")
    @JsonDeserialize(using = MethodDeserializer.class)
    public Method getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(Method method) {
        this.method = method;
    }

    @JsonProperty("currency_code")
    public Currency getCurrency() {
        return currency;
    }

    @JsonProperty("currency_code")
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @JsonProperty("date_paid")
    public Date getPaid() {
        return paid;
    }

    @JsonProperty("date_paid")
    public void setPaid(Date paid) {
        this.paid = paid;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }
}
