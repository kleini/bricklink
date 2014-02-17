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
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

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

    public <T extends Response<?>> T execute(Request<T> request) throws Exception {
        String url = BASE_URL + request.getPath();
        HttpRequestBase httpRequest = new HttpGet(addQueryParams2URL(url, getGETParameter(request)));
        consumer.sign(httpRequest);
        CloseableHttpResponse httpResponse = client.execute(httpRequest);
        final T response;
        try {
            Parser<? extends T, ?> parser = request.getParser();
            String body = Parser.checkResponse(httpResponse);
            response = parser.parse(body);
        } finally {
            httpResponse.close();
        }
        return response;
    }

    public void close() throws IOException {
        client.close();
    }

    private static List<NameValuePair> getGETParameter(Request<?> request) {
        List<NameValuePair> retval = new LinkedList<NameValuePair>();
        for (Parameter param : request.getParameters()) {
            retval.add(new BasicNameValuePair(param.getName(), param.getValue()));
        }
        return retval;
    }

    private static String addQueryParams2URL(String url, List<NameValuePair> params) {
        if (0 == params.size()) {
            return url;
        }
        StringBuilder retval = new StringBuilder(url);
        if (-1 == retval.indexOf("?")) {
            retval.append('?');
        } else {
            retval.append('&');
        }
        retval.append(URLEncodedUtils.format(params, "UTF-8"));
        return retval.toString();
    }
}
