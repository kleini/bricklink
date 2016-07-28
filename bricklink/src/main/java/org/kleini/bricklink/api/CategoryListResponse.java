/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;

/**
 * {@link CategoryListResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class CategoryListResponse extends MetaResponse<List<Category>> {

    protected CategoryListResponse(org.kleini.bricklink.data.Response<List<Category>> response) {
        super(response);
    }

    public List<Category> getCategories() {
        return getResponse().getData();
    }
}
