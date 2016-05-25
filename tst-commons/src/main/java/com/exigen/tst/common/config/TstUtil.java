package com.exigen.tst.common.config;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Test utilities.
 *
 * @author astorhs
 */
public class TstUtil {

    private static TstUtil instance = null;

    private Properties properties = new Properties();

    public TstUtil() {
        try {
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties");
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new FileNotFoundException("property file not found in the classpath");
            }
        } catch (Exception e) {
            throw new TstException("Failed to load properties", e);
        }
    }

    /**
     * @return
     */
    public static TstUtil getInstance() {
        if (instance == null) {
            instance = new TstUtil();
        }

        return instance;
    }

    public String getProperty(String propertyKey) {
        if (!properties.containsKey(propertyKey)) {
            throw new TstException("Property key " + propertyKey + " not found.");
        }

        return properties.getProperty(propertyKey);
    }
}
