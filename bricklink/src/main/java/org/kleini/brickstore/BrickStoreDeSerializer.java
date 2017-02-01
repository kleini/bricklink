/*
 * GPL v3
 */

package org.kleini.brickstore;

import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import org.kleini.brickstore.data.BrickStoreXML;
import org.xml.sax.SAXException;

/**
 * {@link BrickStoreDeSerializer} Loads and saves BrickStore files.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class BrickStoreDeSerializer {

    private final JAXBContext context;
    private final SchemaFactory schemaFactory;

    public BrickStoreDeSerializer() throws JAXBException {
        super();
        context = JAXBContext.newInstance(BrickStoreXML.class.getPackage().getName());
        schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    }

    private Unmarshaller getUnmarshaller() throws JAXBException, SAXException {
        Unmarshaller retval = context.createUnmarshaller();
        retval.setSchema(schemaFactory.newSchema(BrickStoreDeSerializer.class.getClassLoader().getResource("brickstore.xsd")));
        return retval;
    }

    private Marshaller getMarshaller() throws JAXBException {
        Marshaller retval = context.createMarshaller();
        retval.setProperty("jaxb.formatted.output", Boolean.TRUE);
        return retval;
    }

    public BrickStoreXML load(File file) throws JAXBException, SAXException {
        Source source = new StreamSource(file);
        return getUnmarshaller().unmarshal(source, BrickStoreXML.class).getValue();
    }

    public void save(BrickStoreXML brickStore, File file) throws JAXBException {
        getMarshaller().marshal(brickStore, file);
    }
}
