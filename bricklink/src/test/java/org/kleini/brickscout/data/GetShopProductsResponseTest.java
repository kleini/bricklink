/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.PagedResources.PageMetadata;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.client.Traverson;
import org.springframework.hateoas.core.AnnotationRelProvider;
import org.springframework.hateoas.hal.Jackson2HalModule;
import org.springframework.hateoas.hal.Jackson2HalModule.HalHandlerInstantiator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

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
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.registerModule(new Jackson2HalModule());
        mapper.setHandlerInstantiator(new HalHandlerInstantiator(new AnnotationRelProvider(), null, null));
        mapper.addMixIn(PagedResources.class, PagedResourcesMixIn.class);
    }

    @Test
    public void testWriteJSON() throws IOException {
        ShopProduct product = new ShopProduct();
        PageMetadata metadata = new PagedResources.PageMetadata(20, 0, 1, 1);
        Link link = new Link("localhost");
        Representations representations = new Representations(Collections.emptyList(), metadata, link);
        List<ShopProduct> list = new ArrayList<ShopProduct>();
        list.add(product);
        representations.setRepresentations(list);
        mapper.writeValue(System.out, representations);
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
            Representations<ShopProduct> resource = mapper.readValue(stream, new TypeReference<Representations<ShopProduct>>() {});
            assertTrue(true);
        }
    }

    public void testTraverson() throws URISyntaxException {
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        converter.setSupportedMediaTypes(MediaType.parseMediaTypes("application/hal+json"));
//        converter.setObjectMapper(mapper);
//        RestTemplate restTemplate = new RestTemplate(Collections.singletonList(converter));

        Traverson traverson = new Traverson(new URI("http://localhost:8080/test"), MediaTypes.HAL_JSON);
        traverson.follow("");
//        TraversalBuilder tb = this.restTemplate.follow("users");
        ParameterizedTypeReference<Resources<Representations<ShopProduct>>> typeRefDevices = new ParameterizedTypeReference<Resources<Representations<ShopProduct>>>() {};
//        Resources<UserJson> resUsers = tb.toObject(typeRefDevices);
//        Collection<UserJson> users= resUsers .getContent();
    }
}
