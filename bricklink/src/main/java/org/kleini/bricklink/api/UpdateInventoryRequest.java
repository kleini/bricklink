/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import org.kleini.bricklink.data.Inventory;

/**
 * Request to update an inventory item.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class UpdateInventoryRequest implements Request<UpdateInventoryResponse> {

    private final Inventory inventory;

    public UpdateInventoryRequest(Inventory inventory) {
        super();
        this.inventory = inventory;
    }

    @Override
    public String getPath() {
        return "inventories/" + inventory.getIdentifier();
    }

    @Override
    public Parameter[] getParameters() {
        return Parameter.EMPTY;
    }

    @Override
    public UpdateInventoryParser getParser() {
        return new UpdateInventoryParser();
    }
}
