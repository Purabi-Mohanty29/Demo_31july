package com.demo.SeleniumPratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datatable1 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\PMOHANTY\\eclipse-workspace\\SeleniumPratice\\ExcelData\\data1.xlsx");		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook w=new  XSSFWorkbook(fis);
		
		Sheet s= w.getSheetAt(0);
		
		int row=s.getPhysicalNumberOfRows();
		System.out.println(row);
		
		Row r=s.getRow(0);
		int col=r.getPhysicalNumberOfCells();
		System.out.println(col);
		
		w.close();
		fis.close();

	}

}
