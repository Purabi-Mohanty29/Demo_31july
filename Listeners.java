package com.listerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
    public void onTestStart(ITestResult result) {

        String testname = result.getName();
        System.out.println("Comment" + testname + "Test  Started");

    }

 

    @Override
    public void onTestSuccess(ITestResult result) {

 

        String testname = result.getName();
        System.out.println("Comment" + testname + "Test  Successful");
    }

 

    @Override
    public void onTestFailure(ITestResult result) {

        String testname = result.getName();
        System.out.println("Comment" + testname + "Test  Failed Due To");

    }

 

    

 

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

 

        String testname = result.getName();
        System.out.println("Comment" + testname + "Test  Failed Due To TimeOut");

    }

 

    @Override
    public void onStart(ITestContext context) {

        String testname = context.getName();
        System.out.println("Comment" + testname + "On Start Context");

    }

 

    @Override
    public void onFinish(ITestContext context) {
        String testname = context.getName();
        System.out.println("Comment" + testname + "On Finish Context");
    }

 

 

}


