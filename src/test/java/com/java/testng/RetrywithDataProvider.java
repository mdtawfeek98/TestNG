package com.java.testng;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RetrywithDataProvider {

	@DataProvider
	public Object[][] data(){
		return new Object[][]{{"taw"},{"f"}};
	}
	
	@Test(dataProvider = "data"  )
	public void main(String name) {
		
		if(name.equalsIgnoreCase("taw")) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}
	
	
}
