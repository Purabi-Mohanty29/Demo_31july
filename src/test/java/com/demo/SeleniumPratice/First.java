package com.demo.SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {

	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.manage().window().maximize();
//		//d.close();
//		
//		WebElement w=d.findElement(By.id("user-name"));
//		w.sendKeys("standard_user");
//		Thread.sleep(1000);
//		
//		WebElement p=d.findElement(By.name("password"));
//		p.sendKeys("secret_sauce");
//		Thread.sleep(1000);
//		
//		WebElement c=d.findElement(By.id("login-button"));
//		c.click();
//		
		//Way 2 - Direct Login - works

		d.findElement(By.name("user-name")).sendKeys("standard_user");

		d.findElement(By.name("password")).sendKeys("secret_sauce");

		

		d.findElement(By.name("login-button")).click();

	}

}
