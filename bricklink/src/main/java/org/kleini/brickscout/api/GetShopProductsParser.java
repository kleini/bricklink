/*
 * GPL v3
 */

package org.kleini.brickscout.api;

import org.kleini.brickscout.data.Response;
import org.kleini.brickscout.data.ShopProduct;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link GetShopProductsParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class GetShopProductsParser extends Parser<GetShopProductsResponse, ShopProduct> {

    @Override
    protected TypeReference<Response<ShopProduct>> getResponseType() {
        return new TypeReference<Response<ShopProduct>>() {
            // Nothing to do.
        };
    }

    @Override
    protected GetShopProductsResponse createResponse(org.kleini.brickscout.data.Response<ShopProduct> response) {
        return new GetShopProductsResponse(response);
    }
}
