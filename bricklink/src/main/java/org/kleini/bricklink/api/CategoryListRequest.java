/*
 * GPLv3
 */

package org.kleini.bricklink.api;

/**
 * {@link CategoryListRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class CategoryListRequest implements Request<CategoryListResponse> {

    public CategoryListRequest() {
        super();
    }

    @Override
    public String getPath() {
        return "categories";
    }

    @Override
    public Parameter[] getParameters() {
        return Parameter.EMPTY;
    }

    @Override
    public CategoryListParser getParser() {
        return new CategoryListParser();
    }
}
