package com.tesng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
	  System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://google.com/");
	  driver.manage().window().maximize();
	  
	  //hardsoft
	  String expectedtitle="Google";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle,expectedtitle,"Title Missing");
	  
//	  String expurl="www.google.com";
//	  String acturl=driver.getCurrentUrl();
//	  Assert.assertEquals(actualtitle,expectedtitle,"url Missing");
	  
	  //soft
	  String expurl="www.google.com";
	  String acturl=driver.getCurrentUrl();
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals(actualtitle,expectedtitle,"url Missing");
	  soft.assertAll();
	  
  }
}
