/*
 * GPL v3
 */

package org.kleini.api;

/**
 * Interface for arbitrary requests to APIs.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public interface Request<T extends Response<?>> {

    enum Method {
        GET,
        POST,
        PUT
    }

    Method getMethod();

    String getPath();

    Parameter[] getParameters();

    Parser<? extends T, ?> getParser();

    String getBody() throws Exception;
}
