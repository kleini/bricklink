/*
 * GPL v3
 */

package org.kleini.bricklink.tools;

import org.kleini.bricklink.data.Inventory;
import org.kleini.brickstore.data.Item;

/**
 * Converts data types
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class Converter {

    private Converter() {
        super();
    }

    public static Item convert(Inventory inventory) {
        Item retval = new Item();
        retval.setBulk(inventory.getBulk());
        retval.setCategoryID(inventory.getItem().getCategory().getIdentifier());
        retval.setCategoryName(inventory.getItem().getCategory().getName());
        retval.setColorID(inventory.getColor().getIdentifier());
        retval.setColorName(inventory.getColor().getName());
        retval.setCondition(inventory.getCondition().name());
        retval.setItemID(inventory.getItem().getIdentifier());
        retval.setItemName(inventory.getItem().getName());
        retval.setItemTypeID(inventory.getItem().getType().getId());
        retval.setItemTypeName(inventory.getItem().getType().name());
        retval.setLotID(inventory.getIdentifier());
        retval.setPrice(inventory.getPrice());
        retval.setQty(inventory.getQuantity());
        retval.setRemarks(inventory.getRemarks());
        retval.setStatus("I");
        return retval;
    }
}
