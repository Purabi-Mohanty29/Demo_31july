package com.demo.SeleniumPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://demoqa.com/select-menu");
		d.manage().window().maximize();
		
	}

}
