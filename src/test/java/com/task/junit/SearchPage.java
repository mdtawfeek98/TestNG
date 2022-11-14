package com.task.junit;

import org.junit.Test;

import com.java.common.CommonUtils;

public class SearchPage extends CommonUtils {

	@Test
	public void Test004_Login() {
		
		CommonUtils.type(elementFindByXpath("//input[@type='email']"), "zfsfsfsegsvdndgswg");
		CommonUtils.elementClick(elementFindById("continue"));
		CommonUtils.type((elementFindByName("password")), "nniwiwiohqhffphqpjojhhh");
		CommonUtils.elementClick(elementFindById("signInSubmit"));
	}
	
}
