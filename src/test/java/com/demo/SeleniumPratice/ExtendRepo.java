package com.demo.SeleniumPratice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendRepo {
	WebDriver driver;
	ExtentTest testt;
	ExtentReports report;
	@Test
	public void verifyTitle() {
		report = new ExtentReports();
		ExtentSparkReporter esp=new ExtentSparkReporter("extendreporter.html");
		report.attachReporter(esp);
		testt=report.createTest("VerifyBlogTitle");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		testt.info("Browser started");
	//	testt.log(LogStatus.INFO,"Browser started");
		driver.get("https://www.google.com/");
		testt.info("Application is up & running");
	//	testt.log(LogStatus.INFO,"Application is up & running");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Swag Labs"));
		testt.pass("Title verified");
	//	testt.log(LogStatus.PASS,"Title verified");
	}
	@AfterMethod
    public void teardown(ITestResult result) throws IOException {
        if(result.getStatus()==ITestResult.FAILURE) {
        	TakesScreenshot ts=(TakesScreenshot)driver;
    		File f=ts.getScreenshotAs(OutputType.FILE);
    		//FileUtils.copyFile(f,new File("./Screenshots/"+filename+"img.png"));
    		String s = "C:\\Users\\PMOHANTY\\eclipse-workspace\\SeleniumPratice\\Screenshots\\screenshot2.png";
    		
            File dest = new File(s);

            FileUtils.copyFile(f, dest);
            testt.fail("Test Failed");
            testt.addScreenCaptureFromPath("C:\\Users\\PMOHANTY\\eclipse-workspace\\SeleniumPratice\\Screenshots\\screenshot2.png");
        }
       
       // report.endTest(testt);
        report.flush();

    }

}
