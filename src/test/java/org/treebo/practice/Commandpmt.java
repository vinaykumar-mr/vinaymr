package org.treebo.practice;

import org.testng.annotations.Test;

import treebo.genericUtility.WebDriverUtility;

public class Commandpmt {
@Test
public void Sample(){
//aaaaa
	String browser = System.getProperty("b");
	String url = System.getProperty("u");
	System.out.println("Browser name is -----"+browser);
	System.out.println("url is "+url);
	
	WebDriverUtility webdr = new WebDriverUtility();
	
	webdr.openBrowserWithApplication(browser, 10l, url);
	
}


{
	

}
}
