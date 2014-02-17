/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.io.File;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.kleini.brickstore.data.BrickStoreXML;

/**
 * This class is a starter and should read a Brickstore file and assign prices to all parts listed there.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Pricing {

    public Pricing() {
        super();
    }

    public static void main(String[] args) throws Exception {
        JAXBContext context = JAXBContext.newInstance("org.kleini.brickstore.data");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        InputStream stream = Pricing.class.getClassLoader().getResourceAsStream("79109.bsx");
        final BrickStoreXML brickStore;
        try {
            brickStore = (BrickStoreXML) unmarshaller.unmarshal(stream);
        } finally {
            stream.close();
        }
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
        marshaller.marshal(brickStore, new File("test.bsx"));
    }
}
