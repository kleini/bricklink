/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import org.kleini.api.AbstractGetRequest;
import org.kleini.api.Parameter;

/**
 * {@link ColorsRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class ColorsRequest extends AbstractGetRequest<ColorsResponse> {

    public ColorsRequest() {
        super();
    }

    @Override
    public String getPath() {
        return "colors";
    }

    @Override
    public Parameter[] getParameters() {
        return Parameter.EMPTY;
    }

    @Override
    public ColorsParser getParser() {
        return new ColorsParser();
    }
}
