package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Loginfactory.RediffFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RediffTest {
	WebDriver driver;
	RediffFactory rf;
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	    
	}
	@When("^user gives (.*) in search field$")
	public void user_gives_in_search_field(String keyword) {
		rf=new RediffFactory(driver);
		rf.stext(keyword);
	    
	}
	@And("user clicks on the search icon")
	public void user_clicks_on_the_search_icon() {
		rf.sbtn();
	}
	@Then("search data should be displayed")
	public void search_data_should_be_displayed() {
	    driver.close();
	}




}
