package com.syntax.class30;

import util.ConfigReader;
import util.ExcelReader;

import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Tatiana Haughton\\Desktop\\Syntax\\JavaBasics\\Data\\config.properties";
        var properties= ConfigReader.read(path);
        System.out.println(properties.getProperty("browser"));

        String excelPath="C:\\Users\\Tatiana Haughton\\Desktop\\Syntax\\JavaBasics\\Data\\Test.xlsx";
        var excelData= ExcelReader.read(excelPath);
        System.out.println(excelData);
    }
}
