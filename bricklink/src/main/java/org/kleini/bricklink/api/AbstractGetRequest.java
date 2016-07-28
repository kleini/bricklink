/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import static org.kleini.api.Request.Method.GET;

import org.kleini.api.Request;
import org.kleini.api.Response;

/**
 * Common abstract implementations for GET requests.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
abstract class AbstractGetRequest<T extends Response<?>> implements Request<T> {

    AbstractGetRequest() {
        super();
    }

    @Override
    public Method getMethod() {
        return GET;
    }

    @Override
    public String getBody() {
        throw new UnsupportedOperationException("HTTP method GET does not support request bodies.");
    }
}
