/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.SSLContext;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.kleini.bricklink.data.Response;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

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

        OAuthConsumer oAuthConsumer = new CommonsHttpOAuthConsumer(configuration.getProperty(ConfigurationProperty.CONSUMER_KEY), configuration.getProperty(ConfigurationProperty.CONSUMER_SECRET));
        oAuthConsumer.setTokenWithSecret(configuration.getProperty(ConfigurationProperty.ACCESS_TOKEN), configuration.getProperty(ConfigurationProperty.ACCESS_SECRET));

        SSLContext sslcontext = SSLContexts.custom().loadTrustMaterial(null, new TrustAllStrategy()).build();
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[] { "TLSv1" }, null, SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        CloseableHttpClient client = HttpClients.custom().setSSLSocketFactory(sslsf).build();
        try {
            HttpGet request = new HttpGet(BASE_URL + "/orders/1234567");
            oAuthConsumer.sign(request);
            CloseableHttpResponse httpResponse = client.execute(request);
            try {
                System.out.println("Code: " + httpResponse.getStatusLine().getStatusCode() + ',' + httpResponse.getStatusLine().getReasonPhrase());
                InputStream stream = httpResponse.getEntity().getContent();
                ObjectMapper mapper = new ObjectMapper();
                Response<List<org.kleini.bricklink.data.Order>> response = mapper.readValue(stream, new TypeReference<Response<org.kleini.bricklink.data.Order>>() { });
                System.out.println(response);
            } finally {
                httpResponse.close();
            }
        } finally {
            client.close();
        }
    }
}
