//	package org.sdet40.TreeboUtility;
//	
//	import org.sdet40.generirutility.Baseclass;
//import org.testng.annotations.Test;
//
//import objectRepository.TabNames;
//	
//	public class TC_3_Activities_Test extends Baseclass{
//	@Test
//	public void tc_3() {
//	ActivitiesPage_POM activitypage = new ActivitiesPage_POM(driver);
//	
//	
//	activitypage.clickRequiredTab(TabNames.ACTIVITIES, webDriverUtility);
//	
//	String title = fileutility.getDataFromPropertyFile("title");
//	String description = fileutility.getDataFromPropertyFile("description");
//	String start = fileutility.getDataFromPropertyFile("start");
//	String end = fileutility.getDataFromPropertyFile("end");
//	
//	
//	activitypage.addactivities();
//	activitypage.title(title);
//	activitypage.Description(description);
//	activitypage.start(start);
//	activitypage.end(end);
//	activitypage.save();
//
//	}
//	}
