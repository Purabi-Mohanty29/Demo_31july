package com.tesng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Parallel {
	WebDriver driver;
	  @Test(dataProvider = "dp")
	  public void main(String uname,String pwd) {
		  System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();
		  
		  System.out.println("thread Id:"+Thread.currentThread().getId());
		  
		  driver.findElement(By.name("user-name")).sendKeys(uname);
		  driver.findElement(By.name("password")).sendKeys(pwd);
		  driver.findElement(By.name("login-button")).click();

		  
	  }

	  @DataProvider(parallel=true)
	  public Object[][] dp() {
		  Object[][] data =new Object[3][2];
		  
		  data[0][0]="standard_user";
		  data[0][1]="secret_sauce";
		  
		  data[1][0]="problem_user";
		  data[1][1]="secret_sauce";
		  
		  data[2][0]="locked_out_user";
		  data[2][1]="secret_sauce";
		  
		  return data;
	  }
}
