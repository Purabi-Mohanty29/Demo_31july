package com.demo.SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_w3schools");
		d.manage().window().maximize();
		
//		d.switchTo().frame(0);
//		d.switchTo().frame("iframeResult");
		WebElement frame123=d.findElement(By.id("iframeResult"));
		d.switchTo().frame(frame123);
		d.findElement(By.xpath("//a[@href='https://www.w3schools.com/']")).click();
		Thread.sleep(1000);
//		d.switchTo().parentFrame();
		d.switchTo().defaultContent();
		System.out.println(d.getTitle());
		
		d.findElement(By.id("runbtn")).click();
		

	}

}
