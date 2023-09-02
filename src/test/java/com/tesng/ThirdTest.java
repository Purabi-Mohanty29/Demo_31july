package com.tesng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest {
	WebDriver driver;
	
	@Test(priority=-1)
	public void main() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
	  System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  
	  
  }
  @Test(priority=0)
  @Parameters({"username","password"})
  public void test(@Optional("problem_user")String username,@Optional("secret_sauce")String password) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.id("user-name")).sendKeys(username);;
	  driver.findElement(By.name("password")).sendKeys(password);    
	  driver.findElement(By.id("login-button")).click();
	  
	  
  }
  @Test(priority=1)
  public void close() {
	  driver.close();
  }
}
