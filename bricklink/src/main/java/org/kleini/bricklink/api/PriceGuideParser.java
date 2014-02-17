/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import org.kleini.bricklink.data.PriceGuide;
import org.kleini.bricklink.data.Response;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link PriceGuideParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class PriceGuideParser extends Parser<PriceGuideResponse, PriceGuide> {

    public PriceGuideParser() {
        super();
    }

    @Override
    protected TypeReference<Response<PriceGuide>> getResponseType() {
        return new TypeReference<Response<PriceGuide>>() {
            // Nothing to do.
        };
    }

    @Override
    protected PriceGuideResponse createResponse(Response<PriceGuide> response) {
        return new PriceGuideResponse(response);
    }
}
