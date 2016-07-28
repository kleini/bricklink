/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;

import org.kleini.api.Response;
import org.kleini.bricklink.data.KnownColor;

/**
 * {@link KnownColorsResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class KnownColorsResponse extends Response<org.kleini.bricklink.data.Response<List<KnownColor>>> {

    protected KnownColorsResponse(org.kleini.bricklink.data.Response<List<KnownColor>> response) {
        super(response);
    }

    public List<KnownColor> getKnownColors() {
        return getResponse().getData();
    }
}
