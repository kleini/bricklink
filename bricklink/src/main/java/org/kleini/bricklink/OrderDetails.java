/*
 * GPL v3
 */

package org.kleini.bricklink;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.api.ConfigurationProperty;
import org.kleini.bricklink.api.OrdersRequest;
import org.kleini.bricklink.api.OrdersResponse;
import org.kleini.bricklink.data.Order;
import org.kleini.bricklink.data.Response;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

/**
 * This class is a starter and can read order details from BrickLink.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class OrderDetails {

    private static final String BASE_URL = "https://api.bricklink.com/api/store/v1";

    public OrderDetails() {
        super();
    }

    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        BrickLinkClient client = new BrickLinkClient(configuration);
        OAuthConsumer oAuthConsumer = new CommonsHttpOAuthConsumer(configuration.getProperty(ConfigurationProperty.CONSUMER_KEY), configuration.getProperty(ConfigurationProperty.CONSUMER_SECRET));
        oAuthConsumer.setTokenWithSecret(configuration.getProperty(ConfigurationProperty.TOKEN_VALUE), configuration.getProperty(ConfigurationProperty.TOKEN_SECRET));
        try {
            OrdersResponse ordersResponse = client.execute(new OrdersRequest());
            for (Order order : ordersResponse.getOrders()) {
                HttpGet request = new HttpGet(BASE_URL + "/orders/" + order.getId());
                oAuthConsumer.sign(request);
                CloseableHttpResponse httpResponse = client.execute(request);
                try {
                    System.out.println("Code: " + httpResponse.getStatusLine().getStatusCode() + ',' + httpResponse.getStatusLine().getReasonPhrase());
                    String body = EntityUtils.toString(httpResponse.getEntity());
                    ObjectMapper mapper = new ObjectMapper();
                    Response<Order> response = mapper.readValue(body, new TypeReference<Response<Order>>() { /* anonymous subclass */ });
                    if (null != response.getData().getShipping().getAddress().getAddress1()) {
                        System.out.println(body);
                    }
                    System.out.println(response);
                } finally {
                    httpResponse.close();
                }
            }
        } finally {
            client.close();
        }
    }
}
