/*
 * GPL v3
 */

package org.kleini.bricklink.data;

/**
 * {@link Completeness}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum Completeness {

    COMPLETE('C'),
    INCOMPLETE('B'),
    SEALED('S'),
    UNDEFINED('X');

    private final char identifier;

    Completeness(char identifier) {
        this.identifier = identifier;
    }

    public char getIdentifier() {
        return identifier;
    }

    public static Completeness byId(char identifier) throws Exception {
        for (Completeness completeness : values()) {
            if (completeness.getIdentifier() == identifier) {
                return completeness;
            }
        }
        throw new Exception("Unknown completeness identifier " + identifier + '.');
    }
}
