package com.java.testng;

import org.testng.annotations.Test;

public class NewDataClass {


	
	@Test(dataProvider="dataPr" , dataProviderClass=DataPovider.class)
	public void main(String name,String pas) {
		System.out.println(name + " " + pas);
	}
	

	
}
