package com.Loginfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPF {
	WebDriver driver;
	LoginFactory log;
	HomeFactory home;
	
	@Test
	public void verifyswag() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		log=new LoginFactory(driver);
		log.swaglog("standard_user","secret_sauce");
		log.clickbtn();
	//	log.swaglogin();
		
		
		home=new HomeFactory(driver);
		home.fliter();
		Thread.sleep(1000);
		home.Cart();
		Thread.sleep(1000);
		home.Cartbutton();
		Thread.sleep(1000);
		
		driver.close();
	}

}
