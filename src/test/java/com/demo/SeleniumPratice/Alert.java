package com.demo.SeleniumPratice;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


 

public class Alert {

 

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

    	
    	System.setProperty("webdriver.http.factory", "jdk-http-client");
    	System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
    	WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        driver.findElement(By.id("alertButton")).click();
        String text= driver.switchTo().alert().getText();
        System.out.println(text);
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(5000);
        String text1= driver.switchTo().alert().getText();
        System.out.println(text1);
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmButton")).click();
        String text2= driver.switchTo().alert().getText();
        System.out.println(text2);
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();

        driver.findElement(By.id("promtButton")).click();
        String text3= driver.switchTo().alert().getText();
        System.out.println(text3);
        Thread.sleep(1000);

        driver.switchTo().alert().sendKeys("asdf");
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.close();  
    }

 

}