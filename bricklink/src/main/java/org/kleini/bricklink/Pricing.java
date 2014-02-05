/*
 * GPL v3
 */

package org.kleini.bricklink;

import javax.net.ssl.SSLContext;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * This class is a starter and should read a Brickstore file and assign prices to all parts listed there.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Pricing {

    private static final String BASE_URL = "https://api.bricklink.com/api/store/v1";

    public Pricing() {
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
            HttpGet request = new HttpGet(BASE_URL + "/orders?direction=in");
            oAuthConsumer.sign(request);
            CloseableHttpResponse response = client.execute(request);
            try {
                System.out.println("Code: " + response.getStatusLine().getStatusCode() + ',' + response.getStatusLine().getReasonPhrase());
                System.out.println(IOUtils.toString(response.getEntity().getContent()));
            } finally {
                response.close();
            }
        } finally {
            client.close();
        }
    }

}
