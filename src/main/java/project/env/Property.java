package project.env;

import java.io.*;
import java.util.Properties;

public class Property {
    static Properties properties;
    private static Property ourInstance = new Property();

    public static Property getInstance() {
        return ourInstance;
    }

    public static String get(String propertyName) {
        //return properties.getOrDefault(propertyName, "Не удалось найти значение свойства \"" + propertyName + "\"").toString();
        return properties.get(propertyName).toString();

    }

    public static Integer getInteger(String propertyName) {
        try {
            return Integer.valueOf(get(propertyName));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private Property() {
        //  String[] resources = {"title", "timeout", "server", "config", "client"};
        String[] resources = {"currentSettings"};
        //  log.info("System.props\n" + System.getProperties());
        String PATH_ENV_FOLDER = System.getProperty("user.dir") + "\\src\\main\\resources\\env\\";
        properties = new Properties();
        InputStream inputStream = null;
        InputStreamReader reader = null;

        for (String resource : resources) {
            try {
                File propertyFile = new File(PATH_ENV_FOLDER + resource + ".properties");
                inputStream = new FileInputStream(propertyFile);
                reader = new InputStreamReader(inputStream, "Windows-1251");
                properties.load(reader);
            } catch (IOException io) {
                io.printStackTrace();
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
