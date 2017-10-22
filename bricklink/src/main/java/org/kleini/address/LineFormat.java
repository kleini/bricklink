/*
 * GPL v3
 */

package org.kleini.address;


/**
 * {@link LineFormat} is an interface for hiding concrete address field data types behind a line oriented interface.
 *
 * @author <a href="mailto:marcus.klein@open-xchange.com">Marcus Klein</a>
 */
public interface LineFormat {

    /**
     * name of some company or firstname and lastname
     */
    void setName(String name);

    String getName();

    /**
     * additional
     */
    void setAdditional(String additional);

    String getAdditional();

    /**
     * street
     */
    void setStreet(String line);

    String getStreet();

    void setHouseNo(String number);

    String getHouseNo();

    /**
     * same line as line 4
     */
    void setPostalCode(String zip);

    String getPostalCode();

    /**
     * zip and city
     */
    void setCity(String city);

    String getCity();

    void setCountry(String country);

    String getCountry();
}
