/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Before;
import org.junit.Test;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.AnnotationRelProvider;
import org.springframework.hateoas.hal.Jackson2HalModule;
import org.springframework.hateoas.hal.Jackson2HalModule.HalHandlerInstantiator;
import com.fasterxml.jackson.core.type.TypeReference;
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

    private ObjectMapper mapper;

    @Before
    public void setUpBeforeClass() {
        mapper = new ObjectMapper();
        mapper.registerModule(new Jackson2HalModule());
        mapper.setHandlerInstantiator(new HalHandlerInstantiator(new AnnotationRelProvider(), null, null));
    }

    @Test
    public void testWriteJSON() throws IOException {
        ResourceSupport resourceSupport = new ResourceSupport();
        resourceSupport.add(new Link("localhost"));
        mapper.writeValue(System.out, resourceSupport);

//        ShopProduct2 product = new ShopProduct2();
//        PageMetadata metadata = new PagedResources.PageMetadata(20, 0, 1, 1);
//        Link link = new Link("lala");
//        PagedResources<ShopProduct2> resources = new PagedResources<ShopProduct2>(Arrays.asList(product), metadata, link);
    }

    @Test
    public void testResponseFromJSON() throws IOException {
        try (
            InputStream stream = getClass().getClassLoader().getResourceAsStream("getshopproductsresponse.json");
        ) {
            Response<ShopProduct> response = mapper.readValue(stream, new TypeReference<Response<ShopProduct>>() { });
            assertTrue(true);
        }
    }

    @Test
    public void testResponseFromJSON2() throws IOException {
        try (
            InputStream stream = getClass().getClassLoader().getResourceAsStream("getshopproductsresponse.json");
        ) {
            PagedResources<ShopProduct> resource = mapper.readValue(stream, new TypeReference<PagedResources<ShopProduct>>() {});
            assertTrue(true);
        }
    }
}
