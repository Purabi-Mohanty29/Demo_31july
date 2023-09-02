package com.burger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Loginfactory.LoginFactory;


public class BurgerLoginPF {
	WebDriver driver;
	BurgerLoginFactory login;
	
	@Test
	public void verifyburgerking() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.burgerking.in/");
		driver.manage().window().maximize();
		

		login=new BurgerLoginFactory(driver);
		login.loginmenu();
		login.Mobile("8117873549");
		Thread.sleep(2000);
		login.otp();
		Thread.sleep(10000);
		login.location("Hinjewadi");
		Thread.sleep(1000);
		login.item();
		Thread.sleep(2000);
		login.addcart();
		Thread.sleep(2000);
		login.cart();
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
	
}
