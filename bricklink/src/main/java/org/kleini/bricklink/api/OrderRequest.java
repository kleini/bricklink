/*
 * GPLv3
 */

package org.kleini.bricklink.api;

/**
 * {@link OrderRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class OrderRequest implements Request<OrderResponse> {

    private int orderId;

    public OrderRequest(int orderId) {
        super();
        this.orderId = orderId;
    }

    @Override
    public String getPath() {
        return "orders/" + Integer.toString(orderId);
    }

    @Override
    public Parameter[] getParameters() {
        return Parameter.EMPTY;
    }

    @Override
    public OrderParser getParser() {
        return new OrderParser();
    }
}
