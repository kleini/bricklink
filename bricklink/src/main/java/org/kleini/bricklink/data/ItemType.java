/*
 * GPL v3
 */

package org.kleini.bricklink.data;

import java.util.Locale;

/**
 * {@link ItemType}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum ItemType {

    MINIFIG("M"),
    PART("P"),
    SET("S"),
    BOOK("B"),
    GEAR("G"),
    CATALOG("C"),
    INSTRUCTION("I"),
    UNSORTED_LOT("U"),
    ORIGINAL_BOX("O");

    private final String id;

    private ItemType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getLongId() {
        return name().toLowerCase(Locale.US);
    }

    public static ItemType byID(String id) throws Exception {
        for (ItemType itemType : values()) {
            if (itemType.id.equals(id)) {
                return itemType;
            }
        }
        throw new Exception("Unknown item type identifier " + id);
    }
}
