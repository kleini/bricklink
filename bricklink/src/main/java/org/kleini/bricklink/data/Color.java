/*
 * GPL v3
 */

package org.kleini.bricklink.data;

/**
 * {@link Color}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum Color {

    WHITE(1, "White");

    private final int identifier;

    private final String name;

    Color(int identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public static Color byId(int identifier) throws Exception {
        for (Color color : values()) {
            if (color.getIdentifier() == identifier) {
                return color;
            }
        }
        throw new Exception("Unknown color identifier " + identifier + '.');
    }
}
