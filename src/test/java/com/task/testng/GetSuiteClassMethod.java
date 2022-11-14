package com.task.testng;

import static org.testng.Assert.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.DynamicGraph.Status;

import net.bytebuddy.implementation.bind.MethodNameEqualityResolver;

public class GetSuiteClassMethod {
	
	Logger log = LoggerFactory.getLogger(GetSuiteClassMethod.class);

	@BeforeMethod()
//public void startOfTest(ITestContext context) throws Exception {
//		
//		log.info(context.getClass().getName());
//		log.info(context.getSuite().getName());
//	}
	
public void startOfTest(ITestContext context) throws Exception {
		
		log.info(context.getClass().getName());
		
		
		
	}


	@Test	
	public void meth() {
		assertTrue(true);
	}
	
	@AfterMethod()
	public void m(ITestResult arg1) {
		if(arg1.getStatus() == ITestResult.FAILURE) {
			System.out.println( );
		}
	}
}
