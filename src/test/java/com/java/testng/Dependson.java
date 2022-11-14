package com.java.testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Dependson {

	@Test(dependsOnMethods = {"test2","test3"})
	public void test1() {
		System.out.println("test11");
	}
	
	@Test
	public void test2() {
		assertTrue(false);
	}
	
	@Test
	public void test3() {
		assertTrue(false);
	}
	
}
