/*
 * GPL v3
 */

package org.kleini.bricklink.data;

import static org.junit.Assert.assertTrue;
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
 * {@link OrderJSONTest} verifies that serialization and deserialization of the type {@link Order} works.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class OrderJSONTest {

    private static ObjectMapper mapper;

    public OrderJSONTest() {
        super();
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        mapper = new ObjectMapper();
    }

    @Test
    public void testObjectFromJSON() throws JsonParseException, JsonMappingException, IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream("order.txt");
        Order order = mapper.readValue(stream, Order.class);
        assertTrue(true);
    }

    @Test
    public void testListFromJSON() throws JsonParseException, JsonMappingException, IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream("orders.txt");
        List<Order> orders = mapper.readValue(stream, new TypeReference<ArrayList<Order>>() { });
        assertTrue(true);
    }
}
