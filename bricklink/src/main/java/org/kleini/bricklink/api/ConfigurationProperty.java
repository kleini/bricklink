/*
 * GPL v3
 */

package org.kleini.bricklink.api;

/**
 * List of possible property names in configuration file.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum ConfigurationProperty {

    LOGIN("org.kleini.bricklink.login"),
    PASSWORD("org.kleini.bricklink.password"),
    CONSUMER_KEY("org.kleini.bricklink.consumerKey"),
    CONSUMER_SECRET("org.kleini.bricklink.consumerSecret"),
    TOKEN_VALUE("org.kleini.bricklink.tokenValue"),
    TOKEN_SECRET("org.kleini.bricklink.tokenSecret"),
    BS_LOGIN("org.kleini.brickscout.login"),
    BS_PASSWORD("org.kleini.brickscout.password");

    private final String propertyName;

    ConfigurationProperty(String propertName) {
        this.propertyName = propertName;
    }

    public String getPropertyName() {
        return propertyName;
    }
}
