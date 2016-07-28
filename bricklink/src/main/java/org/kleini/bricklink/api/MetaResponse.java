/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import org.kleini.api.Response;

/**
 * {@link MetaResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public abstract class MetaResponse<T> extends Response<org.kleini.bricklink.data.Response<T>> {

    protected MetaResponse(org.kleini.bricklink.data.Response<T> response) {
        super(response);
    }

}
