package com.demo.SeleniumPratice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task2Write {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("C:\\Users\\PMOHANTY\\eclipse-workspace\\SeleniumPratice\\ExcelData\\saucedemo.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		
		Workbook w=new XSSFWorkbook();
		
		Sheet s=w.createSheet();
		
		s.createRow(0);
		s.getRow(0).createCell(0).setCellValue("problem_user");
		s.getRow(0).createCell(1).setCellValue("secert_sauce");
		

	}

}
