package com.Loginfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffFactory {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"srchquery_tbox\"]")
	@CacheLookup
	WebElement searchfield;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/form/input[2]")
	@CacheLookup
	WebElement searchicon;
	
	public RediffFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void stext(String key) {
		searchfield.sendKeys(key);
	}
	public void sbtn() {
		searchicon.click();
	}
}
