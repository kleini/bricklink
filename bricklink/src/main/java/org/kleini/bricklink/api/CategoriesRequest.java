/*
 * GPLv3
 */

package org.kleini.bricklink.api;

/**
 * {@link CategoriesRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class CategoriesRequest implements Request<CategoriesResponse> {

    public CategoriesRequest() {
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
    public CategoriesParser getParser() {
        return new CategoriesParser();
    }
}
