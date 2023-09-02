package StepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.Loginfactory.RediffSingupFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RediffSingupTest {
	WebDriver driver;
	RediffSingupFactory rs;
	@Given("user is on the signup page")
	public void user_is_on_the_signup_page() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@When("user gives keyword in fullname field")
	public void user_gives_keyword_in_fullname_field(DataTable keyword) {
		rs=new RediffSingupFactory(driver);
		List<String> cells=keyword.asList(String.class);
		rs.fullname(cells.get(0));
		rs.fullname(cells.get(1));
	}
	@And("user gives keyword in Rediffmail ID field")
	public void user_gives_keyword_in_rediffmail_id_field(DataTable keyword) {
		rs=new RediffSingupFactory(driver);
		List<String> cells=keyword.asList(String.class);
		rs.rediffid(cells.get(0));
		rs.rediffid(cells.get(1));
	}
	@And("user gives keyword in Password field")
	public void user_gives_keyword_in_password_field(DataTable keyword) {
		rs=new RediffSingupFactory(driver);
		List<String> cells=keyword.asList(String.class);
		rs.password(cells.get(0));
		rs.password(cells.get(1));
	}
	@And("user gives keyword in Retype password field")
	public void user_gives_keyword_in_retype_password_field(DataTable keyword) {
		rs=new RediffSingupFactory(driver);
		List<String> cells=keyword.asList(String.class);
		rs.retypepassword(cells.get(0));
		rs.retypepassword(cells.get(1));
	}
	@And("user clicks on the Create my account")
	public void user_clicks_on_the_create_my_account() {
		rs.register();	
	}
	@Then("user should be registered")
	public void user_should_be_registered() {
	    driver.close();
	}




}
