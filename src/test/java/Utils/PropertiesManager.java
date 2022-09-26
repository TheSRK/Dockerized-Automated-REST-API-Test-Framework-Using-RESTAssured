package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {

    static Properties properties = new Properties();
    //adding config.properties file path
    static String configFilePath ="./src/test/resources/config.properties";
    static String propValue;


    //adding method to get property value
    public static String getProperty(String key) {
        try {
            File file = new File(configFilePath);
            if (file.exists()) {
                FileInputStream in = new FileInputStream(file);
                properties.load(in);
                propValue = properties.getProperty(key);
                in.close();
            } else {
                System.out.println("File not found!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return propValue;
    }

    //adding method to set property value
    public void setProperty(String key, String value){
        try {
            File file = new File(configFilePath);
            if (file.exists()){
                FileInputStream in = new FileInputStream(file);
                properties.load(in);
                properties.setProperty(key, value);
                properties.store(new FileOutputStream(configFilePath), null);
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
