package com.tesng;



import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
	@Parameters("browser")
  @BeforeClass
  public void browser(String browser) {
	  if(browser.equalsIgnoreCase("Edge"))
	  {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
	  }
	  else if(browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		  driver= new ChromeDriver();
	  }
	  driver.get("https://www.google.com");
  }
  @Test
  public void imageopt() {
	  driver.findElement(By.linkText("Images")).click();
  }
  @AfterClass
  public void teardown() {
	  driver.close();
  }

}
