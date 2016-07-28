/*
 * GPL v3
 */

package org.kleini.api;

/**
 * {@link Response}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public abstract class Response<T> {

    private T response;

    protected Response(T response) {
        super();
        this.response = response;
    }

    public T getResponse() {
        return response;
    }
}
