/*
 * GPL v3
 */

package org.kleini.brickscout.api;

import org.kleini.api.AbstractGetRequest;
import org.kleini.api.Parameter;


/**
 * {@link GetShopProductsRequest}
 * https://api.brickscout.com/api/shops/kleinisbricks/products?includeInactive=true&page=0&query=3024&size=20&sort=legoProduct.name,asc
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class GetShopProductsRequest extends AbstractGetRequest<GetShopProductsResponse> {

    private final String shopName;

    public GetShopProductsRequest(String shopName) {
        super();
        this.shopName = shopName;
    }

    @Override
    public String getPath() {
        return "/api/shops/" + shopName + "/products";
    }

    @Override
    public Parameter[] getParameters() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetShopProductsParser getParser() {
        return new GetShopProductsParser();
    }
}
