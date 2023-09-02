package com.demo.SeleniumPratice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        WebElement a = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));

        Actions act = new Actions(driver);
        act.moveToElement(a).perform();

        Wait<WebDriver> wb = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(6))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("Ex")
                .ignoring(NoSuchElementException.class);

        WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(4));
        ww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.ebay.com/b/Apple/bn_21819543']"))).click();
//        driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Apple/bn_21819543']")).click();
	}
		
		

}
