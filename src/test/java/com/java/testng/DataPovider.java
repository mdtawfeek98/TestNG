package com.java.testng;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPovider {

	
	@Test(dataProvider="dataPr" )
	public void main(String name,String pas) {
		System.out.println(new Date());
		System.out.println(name + " " + pas);
		
	}
	
	@DataProvider(parallel =true)
	public Object[][] dataPr(){
		return new Object[][] {{"dillibabu","Babu@01"},{"nandha","Nanda@01"},{"tawfeek","Tawfeek@01"}};
	}
	
	
	
	
	
}
