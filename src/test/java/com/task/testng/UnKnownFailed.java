package com.task.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class UnKnownFailed implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		arg0.setRetryAnalyzer(KnownFailed.class);
		
	}

	
	
	
	
	@Test(description = "Verify that user can be able to login by entering a valid credentials" )
	public void me() {
		System.out.println("sds");
	}
	
	
	
	
}
