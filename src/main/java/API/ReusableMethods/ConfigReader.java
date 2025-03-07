package API.ReusableMethods;

import API.constants.frameworkConstant;
import API.exceptions.ConfigReaderException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream(frameworkConstant.ConfigPropertyPath);
            properties.load(file);
        } catch (Exception e) {
            throw new ConfigReaderException("Failed to load config file",e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
