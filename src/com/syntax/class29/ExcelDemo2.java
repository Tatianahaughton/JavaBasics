package com.syntax.class29;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Tatiana Haughton\\Desktop\\Syntax\\JavaBasics\\Data\\Test.xlsx";

        FileInputStream file=new FileInputStream(path);

        XSSFWorkbook excel=new XSSFWorkbook(file);

        Sheet sheet=excel.getSheet("Sheet1");
        int rows= sheet.getPhysicalNumberOfRows();//returns nums of rows containig data
        System.out.println(rows);
        for(int i=0; i<rows;i++) {
            Row row=sheet.getRow(i);
            int cells=row.getPhysicalNumberOfCells();//returns total nums of cells taht contain data
            for(int j=0; j<cells;j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
}
