/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import org.kleini.api.Parameter;

/**
 * {@link OrdersRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class OrdersRequest extends AbstractGetRequest<OrdersResponse> {

    public OrdersRequest() {
        super();
    }

    @Override
    public String getPath() {
        return "orders";
    }

    @Override
    public Parameter[] getParameters() {
        return new Parameter[] { new Parameter("direction", "in") };
    }

    @Override
    public OrdersParser getParser() {
        return new OrdersParser();
    }
}
