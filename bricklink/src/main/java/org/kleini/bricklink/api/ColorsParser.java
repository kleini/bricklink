/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;

import org.kleini.api.Parser;
import org.kleini.bricklink.data.Response;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link ColorsParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class ColorsParser extends Parser<ColorsResponse, Response<List<Color>>> {

    @Override
    protected TypeReference<Response<List<Color>>> getResponseType() {
        return new TypeReference<Response<List<Color>>>() {
            // Nothing to do.
        };
    }

    @Override
    protected ColorsResponse createResponse(Response<List<Color>> response) {
        return new ColorsResponse(response);
    }
}
