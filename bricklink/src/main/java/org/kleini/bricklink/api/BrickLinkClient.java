/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import static org.kleini.bricklink.api.ConfigurationProperty.CONSUMER_KEY;
import static org.kleini.bricklink.api.ConfigurationProperty.CONSUMER_SECRET;
import static org.kleini.bricklink.api.ConfigurationProperty.TOKEN_SECRET;
import static org.kleini.bricklink.api.ConfigurationProperty.TOKEN_VALUE;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContexts;
import org.kleini.api.Parameter;
import org.kleini.api.Parser;
import org.kleini.api.Request;
import org.kleini.api.Response;

/**
 * {@link BrickLinkClient}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class BrickLinkClient implements Closeable {

    private static final String BASE_URL = "https://api.bricklink.com/api/store/v1/";

    private final OAuthConsumer consumer;
    private final CloseableHttpClient client;

    public BrickLinkClient(String consumerKey, String consumerSecret, String tokenValue, String tokenSecret) throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
        super();
        consumer = new CommonsHttpOAuthConsumer(consumerKey, consumerSecret);
        consumer.setTokenWithSecret(tokenValue, tokenSecret);
        SSLContext sslcontext = SSLContexts.custom().loadTrustMaterial(null, new TrustAllStrategy()).build();
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[] { "TLSv1" }, null, new DefaultHostnameVerifier());
        client = HttpClients.custom().setSSLSocketFactory(sslsf).build();
    }

    public BrickLinkClient(Configuration configuration) throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
        this(configuration.getProperty(CONSUMER_KEY), configuration.getProperty(CONSUMER_SECRET), configuration.getProperty(TOKEN_VALUE), configuration.getProperty(TOKEN_SECRET));
    }

    public CloseableHttpResponse execute(HttpUriRequest request) throws IOException, ClientProtocolException {
        return client.execute(request);
    }

    public <T extends Response<?>> T execute(Request<T> request) throws Exception {
        String url = BASE_URL + request.getPath();
        HttpRequestBase httpRequest;
        switch (request.getMethod()) {
        case GET:
            httpRequest = new HttpGet(addQueryParams2URL(url, convertParameter(request)));
            break;
        case PUT:
            HttpPut put = new HttpPut(url);
            httpRequest = put;
            StringEntity entity = new StringEntity(request.getBody(), Charset.forName("UTF-8"));
            entity.setContentType("application/json");
            put.setEntity(entity);
            break;
        default:
            throw new Exception("Not implemented HTTP method: " + request.getMethod());
        }
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

    @Override
    public void close() throws IOException {
        client.close();
    }

    public static List<NameValuePair> convertParameter(Request<?> request) {
        List<NameValuePair> retval = new LinkedList<NameValuePair>();
        for (Parameter param : request.getParameters()) {
            retval.add(new BasicNameValuePair(param.getName(), param.getValue()));
        }
        return retval;
    }

    public static String addQueryParams2URL(String url, List<NameValuePair> params) {
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
