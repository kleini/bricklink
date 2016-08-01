/*
 * GPLv3
 */

package org.kleini.api;

import static org.kleini.api.Request.Method.PUT;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * {@link AbstractPutRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public abstract class AbstractPutRequest<T extends Response<?>> implements Request<T> {

    protected final ObjectMapper mapper = new ObjectMapper();

    protected AbstractPutRequest() {
        super();
    }

    @Override
    public final Method getMethod() {
        return PUT;
    }
}
