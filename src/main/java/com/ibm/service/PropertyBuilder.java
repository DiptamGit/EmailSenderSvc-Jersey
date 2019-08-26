package com.ibm.service;

import com.ibm.util.Constants;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyBuilder {

    public static Properties loadPropFile(){

        Properties properties = new Properties();
        try {
            InputStream stream = PropertyBuilder.class.getClassLoader().getResourceAsStream("application.properties");
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }

    public static Properties buildEmailProperties(){

        Properties app_properties = loadPropFile();

        Properties properties = new Properties();
        properties.put(Constants.HOST, app_properties.getProperty("mail.host"));
        properties.put(Constants.PORT, app_properties.getProperty("mail.port"));
        properties.put(Constants.AUTH, app_properties.getProperty("mail.auth"));
        properties.put(Constants.STARTTLS, app_properties.getProperty("mail.startttls"));

        return properties;
    }
}
