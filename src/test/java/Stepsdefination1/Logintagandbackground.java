package Stepsdefination1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Loginfactory.LoginFactory;
import com.demo.SeleniumPratice.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logintagandbackground {
	WebDriver driver;
	LoginFactory log;
	@Given("user is on the login page of swag lab")
	public void user_is_on_the_login_page_of_swag_lab() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@When("user enter the username and password")
	public void user_enter_the_username_and_password() {
		log=new LoginFactory(driver);
		log.swaglog("standard_user","secret_sauce");
	}
	@And("user click on login button")
	public void user_click_on_login_button() {
		log.clickbtn();
	}
	@Then("Login should be successful")
	public void login_should_be_successful() {
		driver.close();
	}

	@When("user enter invalid username and password")
	public void user_enter_invslid_username_and_password() {
		log=new LoginFactory(driver);
		log.swaglog("purabi","secret_sauce");
	}
	@Then("error msg should be displayed")
	public void error_msg_should_be_displayed() throws IOException {
		 Utility.Capture(driver);
		 driver.close();
	}


}
