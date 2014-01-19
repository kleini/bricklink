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

    LOGIN("org.kleini.bricklink.login"),
    PASSWORD("org.kleini.bricklink.password"),
    COMMENT_REGEX("org.kleini.bricklink.commentRegex");

    private final String propertyName;

    ConfigurationProperty(String propertName) {
        this.propertyName = propertName;
    }

    public String getPropertyName() {
        return propertyName;
    }
}
