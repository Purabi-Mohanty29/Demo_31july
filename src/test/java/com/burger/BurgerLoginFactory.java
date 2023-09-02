package com.burger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BurgerLoginFactory {
	WebDriver driver;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/ul[1]/li[3]/span[1]")
	WebElement log;
	
	@FindBy(xpath="//input[@id='mobileNumber']")
	WebElement mob;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div[2]/div[2]")
	WebElement otpclick;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/span[1]")
	WebElement locclick;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[2]/section[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]/div[1]")
	WebElement itemclick; 
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[4]/div[1]/div[2]/div[1]/div[2]")
	WebElement addtocartclick;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/ul[1]/li[4]/img[1]")
	WebElement cartclick;
	
	public BurgerLoginFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void loginmenu(){
		log.click();
	}
	
	public void Mobile(String num) {
		mob.sendKeys(num);
		
	}
	
	public void otp() {
		otpclick.click();
	}
	
	public void item() {
		itemclick.click();
	}
	
	public void addcart() {
		addtocartclick.click();
	}
	
	public void cart() {
		cartclick.click();
	}
	public void location(String name) {
		locclick.click();
		locclick.sendKeys(name);
		
	}
}
