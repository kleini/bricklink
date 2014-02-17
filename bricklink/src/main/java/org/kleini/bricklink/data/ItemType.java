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

    MINIFIG("M"),
    PART("P"),
    SET("S"),
    BOOK("B"),
    GEAR("G"),
    CATALOG("C"),
    INSTRUCTION("I"),
    UNSORTED_LOT("U"),
    ORIGINAL_BOX("O");

    private String id;

    private ItemType(String id) {
        this.id = id;
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
