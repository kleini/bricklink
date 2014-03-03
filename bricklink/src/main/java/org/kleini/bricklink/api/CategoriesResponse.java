/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;

/**
 * {@link CategoriesResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class CategoriesResponse extends Response<List<Category>> {

    protected CategoriesResponse(org.kleini.bricklink.data.Response<List<Category>> response) {
        super(response);
    }

    public List<Category> getCategories() {
        return getResponse().getData();
    }
}
