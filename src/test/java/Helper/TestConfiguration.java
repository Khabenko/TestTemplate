package Helper;

import Model.WebDrivers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestConfiguration {
    private static TestConfiguration testConfiguration;

    private Properties properties;
    private final String propertyFilePath= "src\\main\\resources\\TestConfiguration.properties";
    private final String propertyTestEnvironmentKey = "TestEnvironment";
    private final String propertyPublicKey = "PublicKey";

    private TestConfiguration(){
        ConfigFileReader();
    }

    public static TestConfiguration getTestConfiguration() {
        if (testConfiguration == null){
            testConfiguration = new TestConfiguration();
        }
        return testConfiguration;
    }

    public void ConfigFileReader(){
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getBaseURL() {
        return properties.getProperty(propertyTestEnvironmentKey);
    }

    public String getPublicKey() {
        return properties.getProperty(propertyPublicKey);
    }

    public String getWedDriverPath(WebDrivers webDriver){

        return properties.getProperty(webDriver.name());
    }


}
