package com.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	
	By uname=By.id("user-name");
	By pwd=By.id("password");
	By logbtn=By.cssSelector("#login-button");
	By c=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/select[1]");
	By ztoa=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]");
	By addcart=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]");
	By cart=By.xpath("//a[@class='shopping_cart_link']");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public void typeuser() {
		driver.findElement(uname).sendKeys("standard_user");
	}
	public void typepass() {
		driver.findElement(pwd).sendKeys("secret_sauce");
	}
	public void typelog1() {
	
		driver.findElement(logbtn).click();
	}

	public void typehomefilter()  {

		driver.findElement(c).click();
		
	}
	public void typehomeoption(){
		
		driver.findElement(ztoa).click();
	}
	
	public void typeaddcart() throws InterruptedException  {
		Thread.sleep(1000);
		driver.findElement(addcart).click();
	}
	public void typecart() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(cart).click();
	}
	

}
