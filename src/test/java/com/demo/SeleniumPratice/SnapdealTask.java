package com.demo.SeleniumPratice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SnapdealTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.id("inputValEnter")).sendKeys("Shoes");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[2]/div[1]/div[2]/button[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"627189973073\"]/div[3]/div[1]/a/p")).click();
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		driver.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		
		Thread.sleep(1000);
		
		WebElement custradio= driver.findElement(By.xpath("//label[@for='avgRating-4.0']"));
		custradio.click();
		Thread.sleep(1000);
		
		
		List<WebElement> l=  driver.findElements(By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[4]/div/div[1]/div[2]/div[5]/div[3]"));
		
		for(WebElement i:l) {
			System.out.println(i.getText());
		}
		
//		WebElement e=driver.findElement(By.xpath("//input[@value='A-HA By Liberty']"));
//		Select s= new Select(e);
//		
//		boolean b=s.isMultiple();
//		System.out.println(b);
//		
//		s.selectByIndex(1);
		//s.selectByIndex(2);
		//s.selectByIndex(3);
		
//		e.click();
//		Thread.sleep(1000);
//		
//		WebElement s1=driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[4]/div/div[1]/div[2]/div[4]/div[3]/div/div[2]/label"));
//		s1.click();
//		Thread.sleep(1000);
//		
//		WebElement s2=driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[4]/div/div[1]/div[2]/div[4]/div[3]/div/div[3]/label"));
//		s2.click();
//		
		
		
		
	}

}
