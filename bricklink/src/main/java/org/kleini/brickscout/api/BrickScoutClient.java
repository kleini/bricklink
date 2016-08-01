/*
 * GPL v3
 */

package org.kleini.brickscout.api;

import static org.kleini.bricklink.api.BrickLinkClient.addQueryParams2URL;
import static org.kleini.bricklink.api.BrickLinkClient.convertParameter;
import static org.kleini.bricklink.api.ConfigurationProperty.BS_LOGIN;
import static org.kleini.bricklink.api.ConfigurationProperty.BS_PASSWORD;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.kleini.api.Parser;
import org.kleini.api.Request;
import org.kleini.api.Response;
import org.kleini.bricklink.api.Configuration;
import org.kleini.brickscout.data.Token;

/**
 * Client for running API requests to BrickScout.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class BrickScoutClient implements Closeable {

    private static final String BASE_URL = "https://api.brickscout.com/";

    private final CloseableHttpClient client;
    private Token token;

    public BrickScoutClient(String username, String password) throws Exception {
        super();
        client = HttpClients.custom().build();
        login(username, password);
    }

    public BrickScoutClient(Configuration configuration) throws Exception {
        this(configuration.getProperty(BS_LOGIN), configuration.getProperty(BS_PASSWORD));
    }

    private void login(String username, String password) throws Exception {
        LoginResponse response = execute(new LoginRequest(username, password));
        this.token = response.getToken();
        System.out.println(response.toString());
    }

    public <T extends Response<?>> T execute(Request<T> request) throws Exception {
        String url = BASE_URL + request.getPath();
        HttpRequestBase httpRequest;
        switch (request.getMethod()) {
        case GET:
            httpRequest = new HttpGet(addQueryParams2URL(url, convertParameter(request)));
            break;
        case POST:
            HttpPost post = new HttpPost(url);
            httpRequest = post;
            post.setEntity(new UrlEncodedFormEntity(convertParameter(request)));
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
        final T response;
        try (
            CloseableHttpResponse httpResponse = client.execute(httpRequest);
        ) {
            Parser<? extends T, ?> parser = request.getParser();
            String body = Parser.checkResponse(httpResponse);
            response = parser.parse(body);
        }
        return response;
    }

    @Override
    public void close() throws IOException {
        // TODO logout request
        client.close();
    }
}
