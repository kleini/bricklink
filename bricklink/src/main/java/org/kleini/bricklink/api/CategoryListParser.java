/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;
import org.kleini.bricklink.data.Response;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link CategoryListParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class CategoryListParser extends MetaParser<CategoryListResponse, List<Category>> {

    public CategoryListParser() {
        super();
    }

    @Override
    protected TypeReference<Response<List<Category>>> getResponseType() {
        return new TypeReference<Response<List<Category>>>() {
            // Nothing to do.
        };
    }

    @Override
    protected CategoryListResponse createResponse(Response<List<Category>> response) {
        return new CategoryListResponse(response);
    }
}
