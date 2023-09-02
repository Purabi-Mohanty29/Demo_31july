package com.demo.SeleniumPratice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.magicbricks.com/");
		d.manage().window().maximize();
		
		Actions act=new Actions(d);
		String parenthandle=d.getWindowHandle();
		WebElement a=d.findElement(By.id("buyheading"));
		
		act.moveToElement(a).build().perform();
		
		d.findElement(By.linkText("Ready to Move")).click();
		Thread.sleep(1000);
		d.switchTo().window(parenthandle);
		
		Set<String> handles=d.getWindowHandles();
				
	}

}
