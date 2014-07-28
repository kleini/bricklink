/*
 * GPL v3
 */

package org.kleini.brickstore;

import java.io.File;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.kleini.brickstore.data.BrickStoreXML;

/**
 * {@link BrickStoreDeSerializer} Loads and saves BrickStore files.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class BrickStoreDeSerializer {

    private final JAXBContext context;

    public BrickStoreDeSerializer() throws JAXBException {
        super();
        context = JAXBContext.newInstance("org.kleini.brickstore.data");
    }

    private Unmarshaller getUnmarshaller() throws JAXBException {
        return context.createUnmarshaller();
    }

    private Marshaller getMarshaller() throws JAXBException {
        Marshaller retval = context.createMarshaller();
        retval.setProperty("jaxb.formatted.output", Boolean.TRUE);
        return retval;
    }

    public BrickStoreXML load(File file) throws JAXBException {
        return ((JAXBElement<BrickStoreXML>) getUnmarshaller().unmarshal(file)).getValue();
    }

    public BrickStoreXML load(URL url) throws JAXBException {
        return ((JAXBElement<BrickStoreXML>) getUnmarshaller().unmarshal(url)).getValue();
    }

    public void save(BrickStoreXML brickStore, File file) throws JAXBException {
        getMarshaller().marshal(brickStore, file);
    }
}
