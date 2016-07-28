/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import org.kleini.bricklink.data.Inventory;

/**
 * {@link UpdateInventoryResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class UpdateInventoryResponse extends MetaResponse<Inventory> {

    public UpdateInventoryResponse(org.kleini.bricklink.data.Response<Inventory> response) {
        super(response);
    }

    public Inventory getInventory() {
        return getResponse().getData();
    }
}
