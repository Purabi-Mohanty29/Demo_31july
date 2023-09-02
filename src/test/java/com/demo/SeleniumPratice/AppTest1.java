package com.demo.SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.http.factory", "jdk-http-client");
//	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		//d.get("https://www.saucedemo.com/");
		d.get("http://share.rediff.com/pattern/login");
		d.manage().window().maximize();
		
	//	d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
	//	d.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	//	d.findElement(By.xpath("//input[@id='login-button']")).click();
		
		d.findElement(By.xpath("//input[contains(@name='username')]")).sendKeys("purabi");
		d.findElement(By.xpath("//input[text()='Username']"));

	}

}
