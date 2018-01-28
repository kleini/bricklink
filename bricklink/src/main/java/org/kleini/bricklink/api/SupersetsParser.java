/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;
import org.kleini.api.Parser;
import org.kleini.bricklink.data.Response;
import org.kleini.bricklink.data.Superset;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link SupersetsParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class SupersetsParser extends Parser<SupersetsResponse, Response<List<Superset>>> {

    public SupersetsParser() {
        super();
    }

    @Override
    protected TypeReference<Response<List<Superset>>> getResponseType() {
        return new TypeReference<Response<List<Superset>>>() {
            // Nothing to do.
        };
    }

    @Override
    protected SupersetsResponse createResponse(Response<List<Superset>> response) {
        return new SupersetsResponse(response);
    }
}
