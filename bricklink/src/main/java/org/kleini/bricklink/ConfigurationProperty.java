/*
 * GPL v3
 */

package org.kleini.bricklink;

/**
 * List of possible property names in configuration file.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum ConfigurationProperty {

    CONSUMER_KEY("org.kleini.bricklink.consumerKey"),
    CONSUMER_SECRET("org.kleini.bricklink.consumerSecret"),
    ACCESS_TOKEN("org.kleini.bricklink.accessToken"),
    ACCESS_SECRET("org.kleini.bricklink.accessSecret");

    private final String propertyName;

    ConfigurationProperty(String propertName) {
        this.propertyName = propertName;
    }

    public String getPropertyName() {
        return propertyName;
    }
}
