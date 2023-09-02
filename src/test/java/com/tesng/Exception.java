package com.tesng;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class Exception {
	WebDriver driver;
	
	@BeforeTest
	public void main() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	  
	  
  }
	@Test(timeOut=1000,expectedExceptions= {NoSuchElementException.class})
	
	public void test() throws InterruptedException  {
	//Thread.sleep(1000);
	driver.findElement(By.id("username")).sendKeys("standard_user");;
	driver.findElement(By.name("password")).sendKeys("secret_sauce");    
	driver.findElement(By.id("login-button")).click();
	}
  @AfterTest
  public void close() {
	  driver.close();
  }
}
