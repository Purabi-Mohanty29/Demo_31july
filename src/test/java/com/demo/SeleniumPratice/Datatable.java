package com.demo.SeleniumPratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Datatable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File file=new File("C:\\Users\\PMOHANTY\\eclipse-workspace\\SeleniumPratice\\ExcelData\\data.xls");
//		
//		FileOutputStream fos=new FileOutputStream(file);
//		
//		Workbook w=new HSSFWorkbook();
//		
//		Sheet s=w.createSheet();
//		
//		s.createRow(0);
//		s.getRow(0).createCell(0).setCellValue("Hello");
//		s.getRow(0).createCell(1).setCellValue("capg");
//		
//		s.createRow(1);
//		s.getRow(1).createCell(0).setCellValue(true);
//		s.getRow(1).createCell(1).setCellValue(1234);
//		
//		w.write(fos);
//		w.close();
		
//		File file=new File("C:\\Users\\PMOHANTY\\eclipse-workspace\\SeleniumPratice\\ExcelData\\data1.xlsx");
//		
//		FileOutputStream fos=new FileOutputStream(file);
//		
//		Workbook w=new XSSFWorkbook();
//		
//		Sheet s=w.createSheet();
//		
//		s.createRow(0);
//		s.getRow(0).createCell(0).setCellValue("Hello");
//		s.getRow(0).createCell(1).setCellValue("capg");
//		
//		s.createRow(1);
//		s.getRow(1).createCell(0).setCellValue(true);
//		s.getRow(1).createCell(1).setCellValue(1234);
//		
//		//another sheet
//		Sheet s1=w.createSheet("Testing data");
//		
//		s1.createRow(0);
//		s1.getRow(0).createCell(0).setCellValue("Purabi");
//		s1.getRow(0).createCell(1).setCellValue("capg");
//		w.write(fos);
//		w.close();


		File file=new File("C:\\Users\\PMOHANTY\\eclipse-workspace\\SeleniumPratice\\ExcelData\\data1.xlsx");		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook w=new  XSSFWorkbook(fis);
		
		Sheet s= w.getSheetAt(0);
//		Row r=s.getRow(0);
//		Cell c=r.getCell(0);
//		System.out.println(c);
//		w.close();
//		fis.close();
		String cellValue=s.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellValue);
		
		Number cellValue1=s.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(cellValue1);
		
		int rows=s.getFirstRowNum();
		int col=s.getRow(0).getFirstCellNum();
		
		System.out.println(rows);
		System.out.println(col);
		
		int row1=s.getLastRowNum();
		int col1=s.getRow(0).getLastCellNum();
		
		System.out.println(row1);
		System.out.println(col1);
		
		w.close();
		fis.close();
	}

}
