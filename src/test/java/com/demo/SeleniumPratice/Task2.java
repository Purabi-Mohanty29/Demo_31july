package com.demo.SeleniumPratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		
		File file1=new File("C:\\Users\\PMOHANTY\\eclipse-workspace\\SeleniumPratice\\ExcelData\\saucedemo.xlsx");
		FileInputStream fis=new FileInputStream(file1);
		
		Workbook w1=new XSSFWorkbook();
		
		Sheet s1= w1.getSheetAt(0);
		
		String uname=s1.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.id("user-name")).sendKeys(uname);
		
		String pwd=s1.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		driver.findElement(By.id("login-button")).click();
		
		
		


	}

}
