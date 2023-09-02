package com.demo.SeleniumPratice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {

	public static String CaptureScreen(WebDriver driver,String filename)throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(f,new File("./Screenshots/"+filename+"img.png"));
		String s = "C:\\Users\\PMOHANTY\\eclipse-workspace\\SeleniumPratice\\Screenshots\\"+filename+".png";

        File dest = new File(s);

        FileUtils.copyFile(f, dest);

        return s;
		

	}

}
