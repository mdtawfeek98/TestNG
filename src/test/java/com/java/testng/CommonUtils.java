package com.java.testng;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class CommonUtils {

	Logger log = LoggerFactory.getLogger(TestNG.class);


	@BeforeGroups("smoke")
	public void test01() {
		System.out.println("beforegroupsmoke");
	}
	

	@BeforeGroups("sanity")
	public void test011() {
		System.out.println("beforegroupsanity");
	}


	//	@BeforeSuite
	//	public void test0() {
	//		System.out.println("befoesuite");
	//	
	//	}
	//	
	//	@Parameters({"browser"})  
	//	@BeforeTest
	//	public void test1(String br1) {
	//		log.info(br1);
	//		
	//	}
	//
	//	@BeforeClass
	//	public void test2() {
	//		log.info("BeforeClass");
	//	}
	//
	//	@BeforeMethod
	//	public void test3() {
	//		log.info("BeforeMethod");
	//	}
	//	
	//	@AfterMethod
	//	public void test4() {
	//		log.info("AfterMethod");
	//	}
	//
	//
	//	@AfterClass
	//	public void test5() {
	//		log.info("AfterClass");
	//	}
	//	
	//	@AfterTest
	//	public void test() {
	//		log.info("BeforeTest");
	//	}
	//
	//	@AfterSuite
	//	public void test6() {
	//		log.info("AfterSuite");
	//	}
	//	

}
