package com.task.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.java.common.CommonUtils;

//@RunWith(Suite.class)	
//@SuiteClasses({HomePage.class,SearchPage.class})

public class SuiteClass extends CommonUtils {

  public static void main(String[] args) {
	
	  Logger log = LoggerFactory.getLogger(SuiteClass.class);
	  
	  Result rs = JUnitCore.runClasses(HomePage.class,SearchPage.class);
	  
	  int failcount =  rs.getFailureCount();
	  System.out.println(failcount);
	  
	  int runCount = rs.getRunCount();
	  System.out.println(runCount);
	  
	  int passcount = runCount- failcount;
	  System.out.println(passcount);
	  
	  List<Failure> fCount = rs.getFailures();
	  for(Failure f :fCount) {
		  System.out.println(f);
	  }
	  
}
  
     
  
  
  
	
}
