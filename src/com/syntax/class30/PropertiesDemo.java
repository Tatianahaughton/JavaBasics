package com.syntax.class30;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        //Make a method that can help us read data from properties file. Method should be available to any other class in project.
        //Pass keys, and make sure it gives its value.
        System.out.println(getProperty("password"));
    }

        public static String getProperty(String key) throws IOException {
            String path="C:\\Users\\Tatiana Haughton\\Desktop\\Syntax\\JavaBasics\\Data\\config.properties";
            FileInputStream file=new FileInputStream(path);
            Properties properties= new Properties();
            properties.load(file);
            return properties.getProperty(key);
        }
    }

