/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import org.kleini.api.Parser;
import org.kleini.bricklink.data.Order;
import org.kleini.bricklink.data.Response;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * {@link OrderParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class OrderParser extends Parser<OrderResponse, Order> {

    public OrderParser() {
        super();
    }

    @Override
    protected TypeReference<Response<Order>> getResponseType() {
        return new TypeReference<Response<Order>>() {
            // Nothing to do.
        };
    }

    @Override
    protected OrderResponse createResponse(Response<Order> response) {
        return new OrderResponse(response);
    }
}
