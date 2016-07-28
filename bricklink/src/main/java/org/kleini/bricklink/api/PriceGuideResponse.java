/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import org.kleini.api.Response;
import org.kleini.bricklink.data.PriceGuide;

/**
 * {@link PriceGuideResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class PriceGuideResponse extends Response<PriceGuide> {

    public PriceGuideResponse(org.kleini.bricklink.data.Response<PriceGuide> response) {
        super(response);
    }

    public PriceGuide getPriceGuide() {
        return getResponse().getData();
    }
}
