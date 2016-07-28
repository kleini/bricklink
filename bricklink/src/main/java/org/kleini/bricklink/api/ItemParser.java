/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import org.kleini.api.Parser;
import org.kleini.bricklink.data.Item;
import org.kleini.bricklink.data.Response;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link ItemParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class ItemParser extends Parser<ItemResponse, Response<Item>> {

    ItemParser() {
        super();
    }

    @Override
    protected TypeReference<Response<Item>> getResponseType() {
        return new TypeReference<Response<Item>>() {
            // Nothing to do.
        };
    }

    @Override
    protected ItemResponse createResponse(Response<Item> response) {
        return new ItemResponse(response);
    }
}
