package org.treebo.practice;


import java.io.IOException;

import org.testng.annotations.Test;

import ObjectRepo.treebo.ActivityInformationPage;
import ObjectRepo.treebo.SearchActivityPage;
import treebo.genericUtility.BaseClass;
import treebo.genericUtility.TabName;

public class TC_3Test extends BaseClass {
	

	@Test(groups="sanity")
	public void tc_3() throws IOException, Throwable {

		ActivityInformationPage activityInformationPage = new ActivityInformationPage(driver);
		SearchActivityPage searchStudentId = new SearchActivityPage(driver);
	
       
		
		commonpage.clickRequiredTab(TabName.ACTIVITIES, webDriverUtility);
		
		String title = fileutility.getDataFromPropertyFile("title");
		String description = fileutility.getDataFromPropertyFile("description");
		String start = fileutility.getDataFromPropertyFile("start");
		String end = fileutility.getDataFromPropertyFile("end");
		String search = fileutility.getDataFromPropertyFile("search");
		
		commonpage.clickonaddActivityTab();
		
		activityInformationPage.addingTittle(title);
		activityInformationPage.addingdescription(description);
		activityInformationPage.addingStartDate(start);
		activityInformationPage.addingEndDate(end);
		activityInformationPage.clickOnSave();
		commonpage.clickOnTransactionTab();
		searchStudentId.checkStudentId(search);
		searchStudentId.searchStudentId();
		
	   }
	}




