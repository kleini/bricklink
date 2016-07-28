/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;

import org.kleini.api.Parser;
import org.kleini.bricklink.data.KnownColor;
import org.kleini.bricklink.data.Response;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link KnownColorsParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class KnownColorsParser extends Parser<KnownColorsResponse, Response<List<KnownColor>>> {

    KnownColorsParser() {
        super();
    }

    @Override
    protected TypeReference<Response<List<KnownColor>>> getResponseType() {
        return new TypeReference<Response<List<KnownColor>>>() {
            // Nothing to do.
        };
    }

    @Override
    protected KnownColorsResponse createResponse(Response<List<KnownColor>> response) {
        return new KnownColorsResponse(response);
    }
}
