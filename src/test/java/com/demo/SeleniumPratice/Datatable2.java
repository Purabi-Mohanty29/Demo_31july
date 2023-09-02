package com.demo.SeleniumPratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datatable2 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\PMOHANTY\\eclipse-workspace\\SeleniumPratice\\ExcelData\\data1.xlsx");		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook w=new  XSSFWorkbook(fis);
		
		Sheet s= w.getSheetAt(0);
//		
//		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
//			Row r=s.getRow(i);
//			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
//				Cell c=r.getCell(j);
//				System.out.println(c);
//			}
//		}
		int row = s.getLastRowNum();

        int col1 = s.getRow(0).getLastCellNum();

        for(int r=0;r<=row;r++) {

            Row ro = s.getRow(r);

            for(int c=0;c<col1;c++) {

                Cell ce = ro.getCell(c);

                switch(ce.getCellType()) {

                case STRING: System.out.print(ce.getStringCellValue());

                break;

                case NUMERIC: System.out.print(ce.getNumericCellValue());

                break;

                case BOOLEAN: System.out.print(ce.getBooleanCellValue());

                break;

                default:

                    break;

                }

                System.out.print(" | ");

            }

            System.out.println();

        }

	}

}
