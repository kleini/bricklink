/*
 * GPL v3
 */

package org.kleini.bricklink.data;

import org.junit.Assert;
import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kleini.address.Country;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * {@link CountryTest} verifies that the Country JSON parser mixin works as expected.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class CountryTest {

    private static ObjectMapper mapper;

    public CountryTest() {
        super();
    }

    @BeforeClass
    public static void setUpBeforeClass() {
        mapper = new ObjectMapper();
    }

    @Test
    public void test() throws JsonParseException, JsonMappingException, IOException {
        String json = "\"DE\"";
        Country test = mapper.readValue(json, Country.class);
        Assert.assertEquals(Country.DE, test);
    }
}
