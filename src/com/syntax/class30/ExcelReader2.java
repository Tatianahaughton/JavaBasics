package com.syntax.class30;

import util.ExcelReader;

import java.io.IOException;

public class ExcelReader2 {
    public static void main(String[] args) throws IOException {
        var excelData = ExcelReader.read("C:\\Users\\Tatiana Haughton\\Desktop\\Syntax\\JavaBasics\\Data\\Test.xlsx");
        System.out.println(excelData);
    }
    }

