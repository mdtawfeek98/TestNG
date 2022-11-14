package com.java.testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Retry {

	@Test(retryAnalyzer = RetryAnaly.class)
	public void Ret() {
		assertTrue(false);
	}
	
}
