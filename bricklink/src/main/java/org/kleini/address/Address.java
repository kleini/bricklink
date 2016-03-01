/*
 * GPL v3
 */

package org.kleini.address;

/**
 * Interface for the different parts of a mailing address.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public interface Address {

    String getName();

    String getStreet1();

    String getStreet2();

    String getCityName();

    String getStateOrProvince();

    Country getCountry();

    String getCountryName();

    String getPostalCode();
}
