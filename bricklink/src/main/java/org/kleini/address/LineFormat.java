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
    void setLine1(String line);

    /**
     * street or additional
     */
    void setLine2(String line);

    void setHouseNo(String number);

    /**
     * additional or street
     */
    void setLine3(String line);

    /**
     * zip and city
     */
    void setLine4(String line);

    void setZip(String zip);

    void setCountry(String country);

}
