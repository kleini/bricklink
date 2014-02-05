/*
 * GPL v3
 */

package org.kleini.bricklink.data;

import java.io.IOException;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * {@link CostTest} verifies that serialization and deserialization of the type {@link Cost} works.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class CostTest {

    private static ObjectMapper mapper;
    private static Cost cost;

    @BeforeClass
    public static void setUpBeforeClass() {
        mapper = new ObjectMapper();
        cost = new Cost();
        cost.setCurrency(Currency.EUR);
        cost.setSubtotal(new BigDecimal("6.4400"));
        cost.setGrandTotal(new BigDecimal("9.4400"));
        cost.setDisplayCurrency(Currency.EUR);
        cost.setDisplaySubtotal(new BigDecimal("6.4400"));
        cost.setDisplayGrandTotal(new BigDecimal("9.4400"));
    }

    @Test
    public void test2JSON() throws JsonGenerationException, JsonMappingException, IOException {
        mapper.writeValue(System.out, cost);
    }

    @Test
    public void testFromJSON() throws JsonParseException, JsonMappingException, IOException {
        String json = "{\"currency_code\":\"EUR\",\"subtotal\":\"5.4321\",\"grand_total\":\"6.6666\",\"disp_currency_code\":\"EUR\",\"disp_subtotal\":\"5.4321\",\"disp_grand_total\":\"6.6666\"}";
        Cost test = mapper.readValue(json, Cost.class);
        Assert.assertEquals(cost, test);
    }
}
