/*
 * GPL v3
 */

package org.kleini.brickscout;

import org.kleini.brickscout.data.Representations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Test implements org.springframework.boot.CommandLineRunner {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Test.class);
//        Configuration configuration = new Configuration();
//        try (
//            BrickScoutClient client = new BrickScoutClient(configuration);
//        ) {
//
//        }
        // http://docs.spring.io/spring-hateoas/docs/current/reference/html/#client
//        Traverson traverson = new Traverson(new URI("http://localhost:8080/api/"), MediaTypes.HAL_JSON);
//        String name = traverson.follow("movies", "movie", "actor").
//          withTemplateParameters(parameters).
//          toObject("$.name");
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Representations<?> representations = restTemplate.getForObject("https://api.brickscout.com/api/shops/kleini/products", Representations.class);
        System.out.println(representations.toString());
    }
}
