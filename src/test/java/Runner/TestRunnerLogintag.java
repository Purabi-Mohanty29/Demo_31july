package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Feature\\Logintagandbackground.feature",
	glue={"Stepsdefination1"},
//	is used check all steps given in feature is there in stepdefination
//	dryRun=true, 
//	console o/p in redable format
//	monochrome=true
//	to change colour
	plugin= {"pretty","html:target/Cucumber-report.html",
			"junit:target/JUNITReports/log.xml",
			"json:target/JSONReports/log.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//	tags="@log1 or @log2"
//	tags="@login"
//	tags="@log2"
//	tags="@log1"
	)
public class TestRunnerLogintag  extends AbstractTestNGCucumberTests{

}
