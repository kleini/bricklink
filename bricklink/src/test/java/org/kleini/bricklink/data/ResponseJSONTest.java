/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import static org.junit.Assert.assertNotNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * {@link ResponseJSONTest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class ResponseJSONTest {

    private static ObjectMapper mapper;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        mapper = new ObjectMapper();
    }

    @Test
    public void testResponseFromJSON() throws JsonParseException, JsonMappingException, IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream("response.txt");
        Response<List<Order>> response = mapper.readValue(stream, new TypeReference<Response<ArrayList<Order>>>() { });
        assertNotNull(response);
    }
}
