/*
 * GPL v3
 */

package org.kleini.api;

import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.kleini.bricklink.data.Meta;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * {@link Parser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public abstract class Parser<T extends Response<?>, U> {

    private final ObjectMapper mapper = new ObjectMapper();

    protected Parser() {
        super();
    }

    public final static String checkResponse(CloseableHttpResponse response) throws Exception {
        StatusLine status = response.getStatusLine();
        if (HttpStatus.SC_OK != status.getStatusCode()) {
            throw new Exception("Request failed. (" + status.getStatusCode() + ", " + status.getReasonPhrase() + ")");
        }
        return EntityUtils.toString(response.getEntity());
    }

    public final T parse(String body) throws Exception {
        final org.kleini.bricklink.data.Response<U> response;
        try {
            response = mapper.readValue(body, getResponseType());
        } catch (JsonMappingException e) {
            System.err.println("Body: " + body);
            throw e;
        }
        Meta meta = response.getMeta();
        if (200 != meta.getCode()) {
            throw new Exception(meta.getMessage() + ";" + meta.getDescription());
        }
        return createResponse(response);
    }

    protected abstract TypeReference<org.kleini.bricklink.data.Response<U>> getResponseType();

    protected abstract T createResponse(org.kleini.bricklink.data.Response<U> response);
}
