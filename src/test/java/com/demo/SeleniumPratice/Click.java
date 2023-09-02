package com.demo.SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.rediff.com/");
		d.manage().window().maximize();
		
		Actions act=new Actions(d);
		WebElement a=d.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]"));
		
	//	act.moveToElement(a).click().build().perform();
	//	act.click(a).build().perform();
		
	//	act.moveToElement(a).doubleClick().build().perform();
	//	act.doubleClick(a).build().perform();
		
	//	act.moveToElement(a).contextClick().build().perform();
		act.contextClick(a).build().perform();
	}
}
