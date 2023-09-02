package com.home;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class VerifyHome {
	WebDriver driver=null;
	
	HomePage hp;
	LogoutPage lo;
	@Test
	public void testhome() throws InterruptedException {
		{
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			hp=new HomePage(driver);
			
			hp.typeuser();
			hp.typepass();
			hp.typelog1();
			hp.typehomefilter();
			hp.typehomeoption();
			hp.typeaddcart();
			hp.typecart();
			
			lo.logfil();
			lo.logout();
			driver.close();
			
		}
	}
	
	

}
