/*
 * GPL v3
 */

package org.kleini.bricklink.data;

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
     * The country code
     */
    private Country country;

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

    @JsonProperty("country_code")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("country_code")
    public void setCountry(Country country) {
        this.country = country;
    }
}
