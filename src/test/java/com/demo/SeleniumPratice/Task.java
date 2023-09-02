package com.demo.SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//a[normalize-space()='All Classes']")).click();
		d.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		Thread.sleep(1000);
		d.navigate().back();
		d.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/table[1]/tbody[2]/tr[1]/th[1]/a[1]")).click();
		//d.navigate().back();
	}

}
