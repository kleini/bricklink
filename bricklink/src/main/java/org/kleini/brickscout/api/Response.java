/*
 * GPLv3
 */

package org.kleini.brickscout.api;


/**
 * {@link Response}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
abstract class Response<T> extends org.kleini.api.Response<org.kleini.brickscout.data.Response<T>> {

    public Response(org.kleini.brickscout.data.Response<T> response) {
        super(response);
    }

}
