/*
 * GPL v3
 */

package org.kleini.bricklink.data;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * {@link MethodDeserializer} deserializes payment methods.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class MethodDeserializer extends JsonDeserializer<Method> {

    @Override
    public Method deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String value = jp.getValueAsString();
        try {
            return Method.byValue(value);
        } catch (Exception e) {
            throw JsonMappingException.from(jp, "invalid value for payment method " + value + ".", e);
        }
    }
}
