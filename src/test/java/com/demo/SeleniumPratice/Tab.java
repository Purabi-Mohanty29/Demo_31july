package com.demo.SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab {
	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.manage().window().maximize();
		
		Actions act=new Actions(d);
		
		d.findElement(By.id("user-name")).sendKeys("standard_user");
		act.sendKeys(Keys.TAB).build().perform();
		
		d.findElement(By.id("password")).sendKeys("secret_sauce");
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
	}
}
