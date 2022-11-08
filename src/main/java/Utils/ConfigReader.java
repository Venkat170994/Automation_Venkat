package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties property;

    public static void readProperties(String filePath) {
        try {
            FileInputStream file = new FileInputStream(filePath);
            property = new Properties();
            property.load(file);
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key) {
        return property.getProperty(key);
    }

}