/*
 * GPL v3
 */

package org.kleini.brickscout.api;

import java.util.ArrayList;
import java.util.List;
import org.kleini.api.AbstractGetRequest;
import org.kleini.api.Parameter;


/**
 * {@link GetShopProductsRequest}
 * https://api.brickscout.com/api/shops/kleinisbricks/products?includeInactive=true&page=0&query=3024&size=20&sort=legoProduct.name,asc
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class GetShopProductsRequest extends AbstractGetRequest<GetShopProductsResponse> {

    private final String shopName;
    private final String query;

    public GetShopProductsRequest(String shopName, String query) {
        super();
        this.shopName = shopName;
        this.query = query;
    }

    @Override
    public String getPath() {
        return "/api/shops/" + shopName + "/products";
    }

    @Override
    public Parameter[] getParameters() {
        List<Parameter> params = new ArrayList<Parameter>();
        if (null != query) {
            params.add(new Parameter("query", query));
        }
        params.add(new Parameter("size", 1000));
        return params.toArray(new Parameter[params.size()]);
    }

    @Override
    public GetShopProductsParser getParser() {
        return new GetShopProductsParser();
    }
}
