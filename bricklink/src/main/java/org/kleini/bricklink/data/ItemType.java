/*
 * GPL v3
 */

package org.kleini.bricklink.data;

/**
 * {@link ItemType}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum ItemType {

    MINIFIG("M", "minifig"),
    PART("P", "part"),
    SET("S", "set"),
    BOOK("B", "book"),
    GEAR("G", "gear"),
    CATALOG("C", "catalog"),
    INSTRUCTION("I", "instruction"),
    UNSORTED_LOT("U", "unsorted_lot"),
    ORIGINAL_BOX("O", "original_box");

    private final String id, longId;

    private ItemType(String id, String longId) {
        this.id = id;
        this.longId = longId;
    }

    public String getId() {
        return id;
    }

    public String getLongId() {
        return longId;
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
