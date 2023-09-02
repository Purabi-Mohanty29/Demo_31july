package com.tesng;

import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Data {
	WebDriver driver;
  @Test()
  public void main() {
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
	  System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.name("user-name")).sendKeys("standard_user");
	  driver.findElement(By.name("password")).sendKeys("secret_sauce");
	  driver.findElement(By.name("login-button")).click();
	  
	  
	  Assert.assertTrue(driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed());
	  
	  driver.close();

	  
  }
//
//  @DataProvider
//  public Object[][] dp() {
//	  Object[][] data =new Object[3][2];
//	  
//	  data[0][0]="standard_user";
//	  data[0][1]="secret_sauce";
//	  
//	  data[1][0]="problem_user";
//	  data[1][1]="secret_sauce";
//	  
//	  data[2][0]="locked_out_user";
//	  data[2][1]="secret_sauce";
//	  
//	  return data;
//  }
}
