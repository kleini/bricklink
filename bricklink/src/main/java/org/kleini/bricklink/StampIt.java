/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.api.ConfigurationProperty;
import org.kleini.bricklink.api.OrderRequest;
import org.kleini.bricklink.api.OrdersRequest;
import org.kleini.bricklink.api.OrdersResponse;
import org.kleini.bricklink.data.Cost;
import org.kleini.bricklink.data.Order;
import org.kleini.efiliale.Stamp;

/**
 * Fetch all orders in status paid and use Selenium on www.efiliale.de to create necessary stamps.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class StampIt {

    public StampIt() {
        super();
    }

    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        OrderHelper helper = new OrderHelper(configuration.getProperty(ConfigurationProperty.COMMENT_REGEX));
        BrickLinkClient client = new BrickLinkClient(configuration);
        List<Order> toStamp = new ArrayList<Order>();
        try {
            OrdersRequest request = new OrdersRequest();
            OrdersResponse response = client.execute(request);
            List<Order> orders = OrderHelper.sortByOrderId(response.getOrders());
            for (Order tmp : orders) {
                if (helper.inPaidStatus(tmp)) {
                    toStamp.add(client.execute(new OrderRequest(tmp.getId())).getOrder());
                }
            }
        } finally {
            client.close();
        }
        Map<Stamp,Order> stampMap = new EnumMap<Stamp, Order>(Stamp.class);
        for (Order tmp : toStamp) {
            Cost cost = tmp.getCost();
            stampMap.put(Stamp.byValue(cost.getShipping(), cost.getInsurance()), tmp);
        }
        
    }
}
