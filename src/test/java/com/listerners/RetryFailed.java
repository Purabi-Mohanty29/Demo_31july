package com.listerners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer {
	int counter=0;
	int retryLimited=4;
	@Override
	public boolean retry(ITestResult result) {
		if(counter<retryLimited) {
			counter++;
			return true;
		}
		return false;
	}

}
