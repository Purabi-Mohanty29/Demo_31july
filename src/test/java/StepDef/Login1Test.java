package StepDef;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.Loginfactory.LoginFactory;
import com.demo.SeleniumPratice.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1Test {
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
	
//	@When("^user enter the (.*) & (.*)$")
//	public void user_enter_the_and(String uname, String pass) {
//		log=new LoginFactory(driver);
//		log.swaglog(uname,pass);
//	}
	@When("user enter username,password")
	public void user_enter_username_password(DataTable keyword) {
		log=new LoginFactory(driver);
//		List<String> cells=keyword.asList(String.class);
//		log.swaglog(cells.get(0),cells.get(1));
//		//log.swagpass(cells.get(1));
		List<List<String>> cells = keyword.asLists(String.class);
	    for (List<String> columns : cells) {
	    	log.swaglog(columns.get(0), columns.get(1));

	    }
	}



	@And("user click on login button")
	public void user_click_on_login_button() {
		log.clickbtn();
	}
	@Then("Login should be successful")
	public void login_should_be_successful() throws IOException {
	//	Assert.assertEquals(false,false);
	//    Utility.Capture(driver);
	    driver.close();
	}




}
