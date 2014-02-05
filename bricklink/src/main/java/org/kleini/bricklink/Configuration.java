package org.kleini.bricklink;
/*
 * GPL v3
 */



import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * This class provides the configuration stuff.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class Configuration {

    private final Properties properties = new Properties();

    public Configuration() throws Exception {
        super();
        readProperties();
    }

    private void readProperties() throws Exception {
        String filename = System.getProperty("configurationFile");
        File file = new File(filename);
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            throw new Exception("Configuration file \"" + file.getAbsolutePath() + "\" is not readable.");
        }
        FileInputStream fis = new FileInputStream(file);
        try {
            properties.load(fis);
        } finally {
            fis.close();
        }
    }

    public String getProperty(ConfigurationProperty property) {
        return properties.getProperty(property.getPropertyName());
    }
}
