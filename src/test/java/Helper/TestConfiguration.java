package Helper;

import java.io.BufferedReader;
import java.util.Properties;

public class TestConfiguration {

    private static Properties testConfiguration;
    private final String propertyFilePath= "configs//Configuration.properties";


    private TestConfiguration(){

    }

    public static TestConfiguration getTestConfiguration() {
        if (testConfiguration == null){
            ConfigFileReader();
        }
        return testConfiguration;
    }

    public static void ConfigFileReader(){
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
}
