package com.task.testng;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.java.common.CommonUtils;

public class HomePage extends CommonUtils {

	@Parameters({"browser"})
	@BeforeTest
	public  void LoginPage() {
		CommonUtils.browserLaunch("chrome");
		CommonUtils.browserMax();
	}
	
	@BeforeGroups("smoke")
	public void beforeGroups() {
		System.out.println("smoke");
	}
	
	@BeforeGroups("sanity")
	public void beforeGroups1() {
		System.out.println("sanity");
	}
	
	@BeforeMethod
	public void browserLaunch() {
		
		CommonUtils.urlLaunch("https://www.amazon.in/");	
		CommonUtils.elementClick(elementFindById("nav-link-accountList-nav-line-1"));
	}
	
	
	
	@Test(dataProvider ="data",dataProviderClass = DataProviderEx.class )
	public void Test001_Login(String name, String pass) {
		
		CommonUtils.type(elementFindByXpath("//input[@type='email']"), name);
		CommonUtils.elementClick(elementFindById("continue"));
		CommonUtils.type((elementFindByName("password")), pass);
		CommonUtils.elementClick(elementFindById("signInSubmit"));
	}
	
	
	@Test(priority = 2, groups = {"smoke"} ,enabled = false )
	public void Test002_Login() {
		
		CommonUtils.type(elementFindByXpath("//input[@type='email']"), "637473569");
		CommonUtils.elementClick(elementFindById("continue"));
		CommonUtils.type((elementFindByName("password")), "feekoshayo37");
		CommonUtils.elementClick(elementFindById("signInSubmit"));
	}
	
	
	@Test(groups= {"sanity"},enabled = false)
	public void Test003_Login() {
		
		CommonUtils.type(elementFindByXpath("//input[@type='email']"), "633475");
		CommonUtils.elementClick(elementFindById("continue"));
		CommonUtils.type((elementFindByName("password")), "");
		CommonUtils.elementClick(elementFindById("signInSubmit"));
		
		
	}
	
	
	
	
	@DataProvider(name="username",parallel=true)
	public Object[][] datapro(){
		return new Object[][] {{"shahul","hameed"},{"elakkiya","selvam"},{"kamali","D"}};
		
	}
	
	
}
