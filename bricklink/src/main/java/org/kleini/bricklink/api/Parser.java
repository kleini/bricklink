/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import java.io.IOException;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * {@link Parser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
abstract class Parser<T extends Response<?>, U> {

    private final ObjectMapper mapper = new ObjectMapper();

    Parser() {
        super();
    }

    final static String checkResponse(CloseableHttpResponse response) throws Exception {
        if (HttpStatus.SC_OK != response.getStatusLine().getStatusCode()) {
            throw new Exception("Request failed. (" + response.getStatusLine().getReasonPhrase() + ")");
        }
        return EntityUtils.toString(response.getEntity());
    }

    final T parse(String body) throws JsonParseException, JsonMappingException, IOException {
        final org.kleini.bricklink.data.Response<U> response;
        try {
            response = mapper.readValue(body, getResponseType());
        } catch (JsonMappingException e) {
            System.err.println("Body: " + body);
            throw e;
        }
        return createResponse(response);
    }

    protected abstract TypeReference<org.kleini.bricklink.data.Response<U>> getResponseType();

    protected abstract T createResponse(org.kleini.bricklink.data.Response<U> response);
}
