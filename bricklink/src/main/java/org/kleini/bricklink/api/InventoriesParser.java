/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import java.util.List;

import org.kleini.api.Parser;
import org.kleini.bricklink.data.Inventory;
import org.kleini.bricklink.data.Response;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link InventoriesParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class InventoriesParser extends Parser<InventoriesResponse, List<Inventory>> {

    public InventoriesParser() {
        super();
    }

    @Override
    protected TypeReference<Response<List<Inventory>>> getResponseType() {
        return new TypeReference<Response<List<Inventory>>>() {
            // Nothing to do.
        };
    }

    @Override
    protected InventoriesResponse createResponse(Response<List<Inventory>> response) {
        return new InventoriesResponse(response);
    }
}
