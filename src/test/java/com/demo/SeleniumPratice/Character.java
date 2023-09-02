package com.demo.SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Character {
	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.manage().window().maximize();
		
		Actions act=new Actions(d);
		
		WebElement uname=d.findElement(By.id("user-name"));
		uname.click();
		act.moveToElement(uname).sendKeys("standard_user").build().perform();
		
		WebElement pwd=d.findElement(By.id("password"));
		pwd.click();
		act.moveToElement(pwd).sendKeys("secret_sauce").build().perform();
		
		WebElement log=d.findElement(By.id("login-button"));
		act.moveToElement(log).click().build().perform();
		
	}

}
