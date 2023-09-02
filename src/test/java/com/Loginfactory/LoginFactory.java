package com.Loginfactory;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory {
	WebDriver driver;
	
//	@FindBy(xpath="/[@name='user-name']")
//	WebElement uname;
	@FindBy(xpath="//input[@name='user-name']")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(how=How.XPATH,using="//input[@id='login-button']")
	WebElement logBtn;
	
	
	public LoginFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
//	public void swaglogin() {
//		uname.sendKeys("standard_user");
//		pass.sendKeys("secret_sauce");
//	}
	public void swaglog(String uid,String pwd) {
		uname.sendKeys(uid);
		pass.sendKeys(pwd);
	}
//	public void swaguname(String uid) {
//		uname.sendKeys(uid);
//	}
//	public void swagpass(String pwd) {
//		pass.sendKeys(pwd);
//	}
	public void clickbtn() {
		logBtn.click();
	}
}
