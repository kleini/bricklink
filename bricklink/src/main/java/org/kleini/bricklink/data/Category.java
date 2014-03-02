/*
 * GPL v3
 */

package org.kleini.bricklink.data;

/**
 * The main category of an item
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum Category {

    ANIMAL_BODY_PART(148, "Animal, Body Part"),
    ANTENNA(1, "Antenna"),
    BAR(46, "Bar"),
    BRACKET(4, "Bracket"),
    BRICK(5, "Brick"),
    BRICK_ARCH(6, "Brick, Arch"),
    OTHER(143, "(Other)");

    private final int identifier;

    private final String name;

    Category(int identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public static Category byId(int identifier) throws Exception {
        for (Category category : values()) {
            if (category.getIdentifier() == identifier) {
                return category;
            }
        }
        throw new Exception("Unknown category identifier " + identifier + '.');
    }
}
