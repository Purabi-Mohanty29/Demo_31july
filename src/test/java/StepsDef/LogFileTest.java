package StepsDef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.Loginfactory.LoginFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogFileTest {
	WebDriver driver;
	LoginFactory log =new LoginFactory(driver);
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook w;
	XSSFSheet s;
	String uname,pwd;
	@Given("user is on the login page of swag lab")
	public void user_is_on_the_login_page_of_swag_lab() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@When("user open the excel sheet")
	public void user_open_the_excel_sheet() throws IOException {
		fis=new FileInputStream("C:\\Users\\PMOHANTY\\eclipse-workspace\\SeleniumPratice\\ExcelData\\loginfile.xlsx");
	    w=new XSSFWorkbook(fis);
	    s=w.getSheetAt(0);
	}
	@And("user give input to the excel sheet")
	public void user_give_input_to_the_excel_sheet() {
	    uname=s.getRow(1).getCell(0).getStringCellValue();
	    pwd=s.getRow(1).getCell(1).getStringCellValue();
	}
	@And("user enter username and password from excel sheet")
	public void user_enter_username_password_from_excel_sheet() {
	   log.swaglog(uname,pwd);
	}
	
	@And("user click on login button")
	public void user_click_on_login_button() {
	    log.clickbtn();
	}
	@Then("Login should be successful")
	public void login_should_be_successful() {
	    driver.close();
	}



}