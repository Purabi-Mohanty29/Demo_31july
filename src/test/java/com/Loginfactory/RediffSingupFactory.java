package com.Loginfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffSingupFactory {
	WebDriver driver;
	

	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")
	@CacheLookup
	WebElement fname;
	
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")
	WebElement rid;
	
	@FindBy(xpath="//input[@id='newpasswd']")
	WebElement pass;
	
	@FindBy(xpath="//*[@id='newpasswd1']")
	WebElement retypepass;
	
	@FindBy(xpath="//*[@id='Register']")
	WebElement regclick;
	
	public RediffSingupFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void fullname(String key) {
		fname.sendKeys(key);
	}
	
	public void rediffid(String key) {
		rid.sendKeys(key);
	}
	
	public void password(String key) {
		pass.sendKeys(key);
		
	}
	
	public void retypepassword(String key) {
		retypepass.sendKeys(key);
		
	}
	public void register() {
		regclick.click();
	}
}
