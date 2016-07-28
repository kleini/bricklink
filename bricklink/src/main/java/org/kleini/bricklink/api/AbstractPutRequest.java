/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import static org.kleini.api.Request.Method.PUT;

import org.kleini.api.Request;
import org.kleini.api.Response;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * {@link AbstractPutRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
abstract class AbstractPutRequest<T extends Response<?>> implements Request<T> {

    final ObjectMapper mapper = new ObjectMapper();

    public AbstractPutRequest() {
        super();
    }

    @Override
    public Method getMethod() {
        return PUT;
    }
}
