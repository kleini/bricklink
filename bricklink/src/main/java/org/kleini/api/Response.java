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

    private org.kleini.bricklink.data.Response<T> response;

    protected Response(org.kleini.bricklink.data.Response<T> response) {
        super();
        this.response = response;
    }

    public org.kleini.bricklink.data.Response<T> getResponse() {
        return response;
    }
}
