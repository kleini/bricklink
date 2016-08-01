/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.io.InputStream;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kleini.brickscout.data.ShopProduct;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * {@link GetShopProductsResponseTest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class GetShopProductsResponseTest {

    public GetShopProductsResponseTest() {
        super();
    }

    private static ObjectMapper mapper;

    @BeforeClass
    public static void setUpBeforeClass() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testResponseFromJSON() throws JsonParseException, JsonMappingException, IOException {
        try (
            InputStream stream = getClass().getClassLoader().getResourceAsStream("getshopproductsresponse.json");
        ) {
            Response<ShopProduct> response = mapper.readValue(stream, new TypeReference<Response<ShopProduct>>() { });
            assertTrue(true);
        }
    }
}
