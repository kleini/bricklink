/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import static org.kleini.bricklink.api.ConfigurationProperty.ACCESS_SECRET;
import static org.kleini.bricklink.api.ConfigurationProperty.ACCESS_TOKEN;
import static org.kleini.bricklink.api.ConfigurationProperty.CONSUMER_KEY;
import static org.kleini.bricklink.api.ConfigurationProperty.CONSUMER_SECRET;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * {@link BrickLinkClient}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class BrickLinkClient {

    private static final String BASE_URL = "https://api.bricklink.com/api/store/v1/";

    private final OAuthConsumer consumer;
    private final CloseableHttpClient client;

    public BrickLinkClient(String consumerKey, String consumerSecret, String token, String tokenSecret) throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
        super();
        consumer = new CommonsHttpOAuthConsumer(consumerKey, consumerSecret);
        consumer.setTokenWithSecret(token, tokenSecret);
        SSLContext sslcontext = SSLContexts.custom().loadTrustMaterial(null, new TrustAllStrategy()).build();
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[] { "TLSv1" }, null, SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        client = HttpClients.custom().setSSLSocketFactory(sslsf).build();
    }

    public BrickLinkClient(Configuration configuration) throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
        this(configuration.getProperty(CONSUMER_KEY), configuration.getProperty(CONSUMER_SECRET), configuration.getProperty(ACCESS_TOKEN), configuration.getProperty(ACCESS_SECRET));
    }

    public <T extends Response> T execute(Request<T> request) throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException, ClientProtocolException, IOException {
        String url = BASE_URL + request.getPath();
        HttpRequestBase httpRequest = new HttpGet(BASE_URL + "/orders?direction=in");
        consumer.sign(httpRequest);
        CloseableHttpResponse httpResponse = client.execute(httpRequest);
        Parser parser = request.getParser();
        String body = parser.checkResponse(httpResponse);
        T response = parser.parse(body);
        httpResponse.close();
        return response;
    }

    public void close() throws IOException {
        client.close();
    }
}
