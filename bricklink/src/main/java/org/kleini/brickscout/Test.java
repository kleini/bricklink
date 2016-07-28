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
    }
}
