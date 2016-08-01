/*
 * GPL v3
 */

package org.kleini.brickscout.api;

import org.kleini.brickscout.data.Response;
import org.kleini.brickscout.data.ShopProduct;


/**
 * {@link GetShopProductsResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class GetShopProductsResponse extends org.kleini.brickscout.api.Response<ShopProduct> {

    protected GetShopProductsResponse(Response<ShopProduct> response) {
        super(response);
    }

}
