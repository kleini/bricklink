/*
 * GPL v3
 */

package org.kleini.bricklink.data;

import org.kleini.address.Country;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Address}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Address {

    /**
     * An object representation of a person's name
     */
    private Name name;

    /**
     * The full address in not-well-formatted
     */
    private String full;

    /**
     * The first line of the address.
     * It is provided only if a buyer updated his/her address and name as a normalized form.
     */
    private String address1;

    /**
     * The second line of the address.
     * It is provided only if a buyer updated his/her address and name as a normalized form.
     */
    private String address2;

    /**
     * The country code
     */
    private Country country;

    /**
     * The city.
     * It is provided only if a buyer updated his/her address and name as a normalized form.
     */
    private String city;

    /**
     * The state.
     * It is provided only if a buyer updated his/her address and name as a normalized form.
     */
    private String state;

    /**
     * The postal code.
     * It is provided only if a buyer updated his/her address and name as a normalized form.
     */
    private String postalCode;

    public Address() {
        super();
    }

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("full")
    public String getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(String full) {
        this.full = full;
    }

    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @JsonProperty("country_code")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("country_code")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
