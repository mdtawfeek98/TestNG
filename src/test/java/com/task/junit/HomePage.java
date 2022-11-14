package com.task.junit;





import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


import com.java.common.CommonUtils;



public class HomePage extends CommonUtils{

	
	
	
	@Before
	public  void LoginPage() {
		CommonUtils.browserLaunch("chrome");
		CommonUtils.browserMax();
		CommonUtils.urlLaunch("https://www.amazon.in/");	
		CommonUtils.elementClick(elementFindById("nav-link-accountList-nav-line-1"));
	}
	
	
	@Test
	public void Test001_Login() {
		
		CommonUtils.type(elementFindByXpath("//input[@type='email']"), "6374735696");
		CommonUtils.elementClick(elementFindById("continue"));
		CommonUtils.type((elementFindByName("password")), "feekoshayo3798");
		CommonUtils.elementClick(elementFindById("signInSubmit"));
	}
	
	
	@Test
	public void Test002_Login() {
		
		CommonUtils.type(elementFindByXpath("//input[@type='email']"), "637473569");
		CommonUtils.elementClick(elementFindById("continue"));
		CommonUtils.type((elementFindByName("password")), "feekoshayo37");
		CommonUtils.elementClick(elementFindById("signInSubmit"));
	}
	
	
	@Test
	public void Test003_Login() {
		
		CommonUtils.type(elementFindByXpath("//input[@type='email']"), "");
		CommonUtils.elementClick(elementFindById("continue"));
		CommonUtils.type((elementFindByName("password")), "");
		CommonUtils.elementClick(elementFindById("signInSubmit"));
	}
	
	
	@Test
	public void Test004_Login() {
		
		CommonUtils.type(elementFindByXpath("//input[@type='email']"), "zfsfsfsegsvdndgswg");
		CommonUtils.elementClick(elementFindById("continue"));
		CommonUtils.type((elementFindByName("password")), "nniwiwiohqhffphqpjojhhh");
		CommonUtils.elementClick(elementFindById("signInSubmit"));
	}
	
	
	
	
	
}
