/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import java.util.ArrayList;
import java.util.List;

import org.kleini.api.Response;
import org.kleini.bricklink.data.Order;

/**
 * {@link OrdersResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class OrdersResponse extends Response<ArrayList<Order>> {

    public OrdersResponse(org.kleini.bricklink.data.Response<ArrayList<Order>> response) {
        super(response);
    }

    public List<Order> getOrders() {
        return getResponse().getData();
    }
}
