/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;
import org.kleini.bricklink.data.Response;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link CategoriesParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class CategoriesParser extends Parser<CategoriesResponse, List<Category>> {

    public CategoriesParser() {
        super();
    }

    @Override
    protected TypeReference<Response<List<Category>>> getResponseType() {
        return new TypeReference<Response<List<Category>>>() {
            // Nothing to do.
        };
    }

    @Override
    protected CategoriesResponse createResponse(Response<List<Category>> response) {
        return new CategoriesResponse(response);
    }
}
