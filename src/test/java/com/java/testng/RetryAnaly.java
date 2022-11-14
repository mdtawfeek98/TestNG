package com.java.testng;

import static org.testng.Assert.assertTrue;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAnaly implements IRetryAnalyzer {

	int min = 0;
	int max = 5;

	@Override
	public boolean retry(ITestResult arg0) {

		if(min<max) {
			min++;
			return true;
		}
		return false;
	}


}
