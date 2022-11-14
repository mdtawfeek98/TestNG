package com.java.testng;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNG {

	Logger log = LoggerFactory.getLogger(TestNG.class);
	
	
	@Test(priority=0,groups= {"smoke"},dependsOnGroups = "sanity")
	public void main23() {
		System.getProperty("browser");
		System.out.println("test23");
		//System.out.println(new Date());
	}
	
	@Test(priority=2,groups= {"sanity"} )
	public void main1() {
		System.out.println("test1");
		//System.out.println(new Date());
	}
	
	@Test(priority=-1,groups= {"smoke"})
	public void main234() {
		System.out.println("test234");
		//System.out.println(new Date());
	}

	
	@Test(groups= {"sanity"})
	public void main345() {
		System.out.println("test345");
//		System.out.println(new Date());
	}
	
	
	
	

	



}
