package com.demo.SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.selenium.dev/");
		d.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		Thread.sleep(1000);
		
		js.executeScript("location.reload()");
		Thread.sleep(2000);
		
		WebElement a= d.findElement(By.xpath("//*[@id=\'main_navbar\']/ul/li[3]/a/span"));
		js.executeScript("arguments[0].click();",a);
		
		js.executeScript("window.scrollBy(200,600)");

	}

}
