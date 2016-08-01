/*
 * GPL v3
 */

package org.kleini.api;

import static org.kleini.api.Request.Method.GET;

/**
 * Common abstract implementations for GET requests.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public abstract class AbstractGetRequest<T extends Response<?>> implements Request<T> {

    protected AbstractGetRequest() {
        super();
    }

    @Override
    public final Method getMethod() {
        return GET;
    }

    @Override
    public final String getBody() {
        throw new UnsupportedOperationException("HTTP method GET does not support request bodies.");
    }
}
