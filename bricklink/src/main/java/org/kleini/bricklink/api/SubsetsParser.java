/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;

import org.kleini.api.Parser;
import org.kleini.bricklink.data.Response;
import org.kleini.bricklink.data.Subset;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link SubsetsParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class SubsetsParser extends Parser<SubsetsResponse, List<Subset>> {

    public SubsetsParser() {
        super();
    }

    @Override
    protected TypeReference<Response<List<Subset>>> getResponseType() {
        return new TypeReference<Response<List<Subset>>>() {
            // Nothing to do.
        };
    }

    @Override
    protected SubsetsResponse createResponse(Response<List<Subset>> response) {
        return new SubsetsResponse(response);
    }
}
