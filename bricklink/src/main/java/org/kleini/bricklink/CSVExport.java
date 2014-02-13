/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.util.List;
import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.api.OrdersRequest;
import org.kleini.bricklink.api.OrdersResponse;
import org.kleini.bricklink.data.Order;

/**
 * This class is a starter and should read the customer address information for not yet booked orders.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class CSVExport {

    public CSVExport() {
        super();
    }

    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        BrickLinkClient client = new BrickLinkClient(configuration);
        try {
            OrdersRequest request = new OrdersRequest();
            OrdersResponse response = client.execute(request);
            List<Order> orders = response.getOrders();
        } finally {
            client.close();
        }
    }
}
