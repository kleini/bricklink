/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import java.util.List;

import org.kleini.api.Response;
import org.kleini.bricklink.data.Inventory;

/**
 * {@link InventoriesResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class InventoriesResponse extends Response<org.kleini.bricklink.data.Response<List<Inventory>>> {

    public InventoriesResponse(org.kleini.bricklink.data.Response<List<Inventory>> response) {
        super(response);
    }

    public List<Inventory> getInventories() {
        return getResponse().getData();
    }
}
