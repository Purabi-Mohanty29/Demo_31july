package com.demo.SeleniumPratice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.saucedemo.com/v1/");
		d.manage().window().maximize();
		
//		TakesScreenshot ts=(TakesScreenshot)d;
//		File f=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(f,new File("./Screenshots/img.png"));
//		d.close();
		
//		Utils.CaptureScreen(d,"log1");
//		d.findElement(By.id("login-button"));
//		Utils.CaptureScreen(d,"after log");
//		d.close();
		
		Utility.Capture(d);
		Thread.sleep(1000);
		d.findElement(By.id("login-button"));
		Thread.sleep(1000);
		Utility.Capture(d);
		d.close();

	}

}
