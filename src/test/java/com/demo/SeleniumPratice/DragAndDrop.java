package com.demo.SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		d.findElement(By.tagName("iframe"));
		d.switchTo().frame(0);
		
		WebElement s=d.findElement(By.id("draggable"));
		WebElement dist=d.findElement(By.id("droppable"));
		
		Actions act=new Actions(d);
		act.dragAndDrop(s,dist).perform();
		
		if(dist.getText().matches("Dropped!")) {
			System.out.println("Successfully dropped");
		}

	}

}
