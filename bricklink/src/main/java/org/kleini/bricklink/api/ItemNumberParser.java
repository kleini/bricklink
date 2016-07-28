/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;

import org.kleini.api.Parser;
import org.kleini.bricklink.data.ItemMapping;
import org.kleini.bricklink.data.Response;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link ItemNumberParser} JSON parser for the {@link ItemNumberRequest}.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class ItemNumberParser extends Parser<ItemNumberResponse, List<ItemMapping>> {

    ItemNumberParser() {
        super();
    }

    @Override
    protected TypeReference<Response<List<ItemMapping>>> getResponseType() {
        return new TypeReference<Response<List<ItemMapping>>>() {
            // Nothing to do.
        };
    }

    @Override
    protected ItemNumberResponse createResponse(Response<List<ItemMapping>> response) {
        return new ItemNumberResponse(response);
    }
}
