

package com.java.testng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 extends CommonUtils {

	Logger log = LoggerFactory.getLogger(TestNG.class);

	

	@Test(groups= {"smoke"})
	public void test5() {
		System.out.println("Test");
	}

	@Test(groups= {"tree"})
	public void test6() {
		System.out.println("Test");
	}

	
	
}



