/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.kleini.api.Parser;
import org.kleini.bricklink.data.PriceDetail;
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
        PriceGuide priceGuide = response.getData();
        List<PriceDetail> details = priceGuide.getDetail();
        Collections.sort(details, new Comparator<PriceDetail>() {
            @Override
            public int compare(PriceDetail o1, PriceDetail o2) {
                int compared = o1.getPrice().compareTo(o2.getPrice());
                if (0 == compared) {
                    // Order by decreasing quantity
                    compared = Integer.compare(o2.getQuantity(), o1.getQuantity());
                }
                return compared;
            }
        });
        return new PriceGuideResponse(response);
    }
}
