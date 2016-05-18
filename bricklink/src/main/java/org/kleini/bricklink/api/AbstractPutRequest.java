/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import static org.kleini.bricklink.api.Request.Method.PUT;
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
