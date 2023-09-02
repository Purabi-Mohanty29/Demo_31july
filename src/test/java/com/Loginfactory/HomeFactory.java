package com.Loginfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomeFactory {
	WebDriver driver;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/select[1]")
	WebElement fil;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")
	WebElement cart;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")
	WebElement addtocart;
	
	
	public HomeFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void fliter() {
		fil.click();
		Select s = new Select(fil);
        s.selectByIndex(1);
	}
	public void Cart()  {
		
		cart.click();
	}
	public void Cartbutton(){
		
		addtocart.click();
	}
}
