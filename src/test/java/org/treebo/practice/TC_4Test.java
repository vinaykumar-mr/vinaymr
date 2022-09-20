package org.treebo.practice;

import java.io.IOException;

import org.testng.annotations.Test;

import ObjectRepo.treebo.ActivityInformationPage;
import treebo.genericUtility.BaseClass;
import treebo.genericUtility.TabName;

public class TC_4Test extends BaseClass{
	@Test
	public void tc_4() throws IOException {
		ActivityInformationPage activityInformationPage = new ActivityInformationPage(driver);


		String title = fileutility.getDataFromPropertyFile("title");
		String description = fileutility.getDataFromPropertyFile("description");
		String start = fileutility.getDataFromPropertyFile("start");
		String end = fileutility.getDataFromPropertyFile("end");
		String title1 = fileutility.getDataFromPropertyFile("title");

		commonpage.clickRequiredTab(TabName.ACTIVITIES, webDriverUtility);

		commonpage.clickonaddActivityTab();

		activityInformationPage.addingTittle(title);
		activityInformationPage.addingdescription(description);
		activityInformationPage.addingStartDate(start);
		activityInformationPage.addingEndDate(end);
		activityInformationPage.clickOnSave();
	activityInformationPage.clickOnUpdate();
	activityInformationPage.updateTitle(title1);
		activityInformationPage.clickOnUpdateActivity();

//		driver.findElement(By.name("title")).sendKeys("meet");
//		String ActualResult = driver.findElement(By.xpath("//td[.='AnnualsportsAnnualsportsmeetNaveed']")).getText();
//		System.out.println(ActualResult);
//		Assert.assertEquals(ActualResult, "AnnualsportsAnnualsportsmeetNaveed");
//		System.out.println("TC is pass");

		



	}
}
