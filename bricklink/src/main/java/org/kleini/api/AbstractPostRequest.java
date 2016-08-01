/*
 * GPL v3
 */

package org.kleini.api;

import static org.kleini.api.Request.Method.POST;

/**
 * Common abstract implementations for GET requests.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public abstract class AbstractPostRequest<T extends Response<?>> implements Request<T> {

    protected AbstractPostRequest() {
        super();
    }

    @Override
    public Method getMethod() {
        return POST;
    }

    @Override
    public final String getBody() {
        throw new UnsupportedOperationException("HTTP method POST does not support request bodies.");
    }
}
