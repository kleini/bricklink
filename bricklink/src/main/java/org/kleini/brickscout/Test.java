package org.kleini.brickscout;

import org.kleini.bricklink.api.Configuration;
import org.kleini.brickscout.api.BrickScoutClient;

public class Test {

    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        try (
            BrickScoutClient client = new BrickScoutClient(configuration);
        ) {

        }
        // http://docs.spring.io/spring-hateoas/docs/current/reference/html/#client
//        Traverson traverson = new Traverson(new URI("http://localhost:8080/api/"), MediaTypes.HAL_JSON);
//        String name = traverson.follow("movies", "movie", "actor").
//          withTemplateParameters(parameters).
//          toObject("$.name");
    }
}
