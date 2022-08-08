package ru.itsjava.iostreams;

import java.io.*;
import java.util.Properties;

public class PropertiesPractice {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/app.properties");
        Properties props = new Properties();
        props.load(new FileInputStream(file));
        for (String key : props.stringPropertyNames())
        {
            System.out.println(props.get(key));
        }

        ClassLoader classLoader = PropertiesPractice.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("app.properties");
        Properties propsFromStream = new Properties();
        propsFromStream.load(inputStream);
        for (String key : propsFromStream.stringPropertyNames())
        {
            System.out.println(propsFromStream.get(key));
        }

    }
}
