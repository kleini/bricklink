/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import org.kleini.bricklink.data.Inventory;
import org.kleini.bricklink.data.Response;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link UpdateInventoryParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class UpdateInventoryParser extends MetaParser<UpdateInventoryResponse, Inventory> {

    public UpdateInventoryParser() {
        super();
    }

    @Override
    protected TypeReference<Response<Inventory>> getResponseType() {
        return new TypeReference<Response<Inventory>>() {
            // Nothing to do.
        };
    }

    @Override
    protected UpdateInventoryResponse createResponse(Response<Inventory> response) {
        return new UpdateInventoryResponse(response);
    }
}
