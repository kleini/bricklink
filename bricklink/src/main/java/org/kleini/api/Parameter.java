/*
 * GPL v3
 */

package org.kleini.api;

/**
 * {@link Parameter}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Parameter {

    public static final Parameter[] EMPTY = new Parameter[0];

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

    public Parameter(String name, char value) {
        this(name, new String(new char[] { value }));
    }

    public Parameter(String name, boolean value) {
        this(name, Boolean.toString(value));
    }

    public final String getName() {
        return name;
    }

    public final String getValue() {
        return value;
    }
}
