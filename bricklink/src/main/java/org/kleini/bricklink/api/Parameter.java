/*
 * GPL v3
 */

package org.kleini.bricklink.api;

/**
 * {@link Parameter}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
class Parameter {

    private final String name;
    private final String value;

    public Parameter(String name, String value) {
        super();
        this.name = name;
        this.value = value;
    }

    public Parameter(String name, int value) {
        this(name, Integer.toString(value));
    }

    final String getName() {
        return name;
    }

    final String getValue() {
        return value;
    }
}
