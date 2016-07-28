/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import org.kleini.api.Parser;
import org.kleini.bricklink.data.Response;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link MetaParser}
 *
 * @author <a href="mailto:marcus.klein@open-xchange.com">Marcus Klein</a>
 */
public class MetaParser<T extends MetaResponse<?>, U> extends Parser<T, org.kleini.bricklink.data.Response<U>> {

    @Override
    protected TypeReference<Response<U>> getResponseType() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected T createResponse(Response<U> response) {
        // TODO Auto-generated method stub
        return null;
    }

}
