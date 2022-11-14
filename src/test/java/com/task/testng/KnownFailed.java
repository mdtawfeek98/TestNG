package com.task.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class KnownFailed implements IRetryAnalyzer {

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
