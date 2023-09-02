package com.demo.SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.saucedemo.com/v1/");
		d.manage().window().maximize();

		JavascriptExecutor js=(JavascriptExecutor)d;
		Thread.sleep(1000);
		
		WebElement uname=d.findElement(By.id("user-name"));
		js.executeScript("arguments[0].setAttribute('value','standard_user')",uname);
		
		Object obj=js.executeScript("return arguments[0].getAttribute('value')",uname);
		String s=(String)obj;
		System.out.println(s);
		
		WebElement pwd=d.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','secret_sauce')",pwd);
		
		Object obj1=js.executeScript("return arguments[0].getAttribute('value')",pwd);
		String s1=(String)obj1;
		System.out.println(s1);
		
		WebElement a= d.findElement(By.id("login-button"));
		js.executeScript("arguments[0].click();",a);
		
		
		
	}

}
