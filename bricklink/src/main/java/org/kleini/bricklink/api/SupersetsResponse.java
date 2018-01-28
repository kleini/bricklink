/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;
import org.kleini.api.Response;
import org.kleini.bricklink.data.Superset;

/**
 * {@link SupersetsResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class SupersetsResponse extends Response<org.kleini.bricklink.data.Response<List<Superset>>> {

    protected SupersetsResponse(org.kleini.bricklink.data.Response<List<Superset>> response) {
        super(response);
    }

    public List<Superset> getSupersets() {
        return getResponse().getData();
    }
}
