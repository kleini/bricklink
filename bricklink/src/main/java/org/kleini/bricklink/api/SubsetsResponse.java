/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;

import org.kleini.api.Response;
import org.kleini.bricklink.data.Subset;

/**
 * {@link SubsetsResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class SubsetsResponse extends Response<List<Subset>> {

    protected SubsetsResponse(org.kleini.bricklink.data.Response<List<Subset>> response) {
        super(response);
    }

    public List<Subset> getSubsets() {
        return getResponse().getData();
    }
}
