package com.task.testng;




import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

//	public static ExtentHtmlReporter extenthtmlreport;
//	public static ExtentReports extentreport  = new ExtentReports();
//	public static ExtentTest logger ;
//	
//	
//	@BeforeSuite
//	public void method() {
//		extenthtmlreport = new ExtentHtmlReporter("./batch.html");
//		extentreport.attachReporter(extenthtmlreport);
//		System.out.println("beforeSuite");
//	}
//	
//	@Test
//	public void me() {
//		logger = extentreport.createTest("t01");
//		System.out.println("bn");
//	}
//	
//	@AfterSuite
//	public void fl() {
//		extentreport.flush();
//	}
	
	
	protected static ExtentReports extentreport = new ExtentReports();
	protected static ExtentHtmlReporter extenthtmlreport;
	protected static ExtentTest logger;
	

	
	@BeforeClass
	public static void beforeSuite() {
		extenthtmlreport = new ExtentHtmlReporter("./batch56report.html");
		extentreport.attachReporter(extenthtmlreport);
		System.out.println("befor suite");
	}
	
	
	@Test()
	public void me() {
		logger = extentreport.createTest("me");
		System.out.println("Test");
		
		}
	
	
	@AfterClass
	public static void endReport() {
		extentreport.flush();
		System.out.println("AfterClass");
       
	}
	
	
	
}
