package com.syntax.class29;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo {
    public static void main(String[] args) throws IOException {
       var path="C:\\Users\\Tatiana Haughton\\Desktop\\Syntax\\JavaBasics\\Data\\config.properties";//location of file
       var fileInputStream=new FileInputStream(path);//navigating to the file
        var properties=new Properties();
        properties.load(fileInputStream);//loads all data from the file inside our Java code
        System.out.println(properties.getProperty("URL"));
        fileInputStream.close();

    }
}
