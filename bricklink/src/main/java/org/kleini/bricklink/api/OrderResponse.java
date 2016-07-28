/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import org.kleini.api.Response;
import org.kleini.bricklink.data.Order;

/**
 * {@link OrderResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class OrderResponse extends Response<org.kleini.bricklink.data.Response<Order>> {

    public OrderResponse(org.kleini.bricklink.data.Response<Order> response) {
        super(response);
    }

    public Order getOrder() {
        return getResponse().getData();
    }
}
