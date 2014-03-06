/*
 * GPL v3
 */

package org.kleini.bricklink.data;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Shipping}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Shipping {

    /**
     * Shipping method the buyer selected
     */
    private String method;

    /**
     * Shipping method ID
     */
    private String identifier;

    /**
     * Tracking numbers for the shipping
     */
    private String trackingNumber;

    /**
     * URL for tracking the shipping
     * API-only field. It is not shown on the BrickLink pages.
     */
    private String trackingLink;

    /**
     * Shipping date
     * API-only field. It is not shown on the BrickLink pages.
     */
    private Date shipped;

    /**
     * The object representation of the shipping address
     */
    private Address address;

    public Shipping() {
        super();
    }

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    @JsonProperty("method_id")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("method_id")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("tracking_no")
    public String getTrackingNumber() {
        return trackingNumber;
    }

    @JsonProperty("tracking_no")
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @JsonProperty("tracking_link")
    public String getTrackingLink() {
        return trackingLink;
    }

    @JsonProperty("tracking_link")
    public void setTrackingLink(String trackingLink) {
        this.trackingLink = trackingLink;
    }

    @JsonProperty("date_shipped")
    public Date getShipped() {
        return shipped;
    }

    @JsonProperty("date_shipped")
    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }
}
