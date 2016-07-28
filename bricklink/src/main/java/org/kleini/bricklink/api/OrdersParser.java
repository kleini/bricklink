/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import java.util.ArrayList;

import org.kleini.api.Parser;
import org.kleini.bricklink.data.Order;
import org.kleini.bricklink.data.Response;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link OrdersParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
final class OrdersParser extends Parser<OrdersResponse, ArrayList<Order>> {

    OrdersParser() {
        super();
    }

    @Override
    protected TypeReference<Response<ArrayList<Order>>> getResponseType() {
        return new TypeReference<Response<ArrayList<Order>>>() {
            // Nothing to do.
        };
    }

    @Override
    protected OrdersResponse createResponse(Response<ArrayList<Order>> response) {
        return new OrdersResponse(response);
    }
}
