package org.treebo.practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepo.treebo.ExpensesInformationPage;
import treebo.genericUtility.BaseClass;
import treebo.genericUtility.TabName;

public class TC_Automate2 extends BaseClass {
	@Test
	public void tc_Automate2Test() throws IOException {

		ExpensesInformationPage expensesInformationPage = new ExpensesInformationPage(driver);
		String detail = fileutility.getDataFromPropertyFile("detail");
		String price = fileutility.getDataFromPropertyFile("price");
		String year1 = fileutility.getDataFromPropertyFile("year1");
		String year2 = fileutility.getDataFromPropertyFile("year2");
		String deadline = fileutility.getDataFromPropertyFile("deadline");
	

		commonpage.clickRequiredTab(TabName.EXPENSES, webDriverUtility);

		expensesInformationPage.clickOnExpenses();
		expensesInformationPage.clickOnDetails(detail);
		expensesInformationPage.addPrice(price);
		expensesInformationPage.addFirstYear(year1);
		expensesInformationPage.addSecondYear(year2);
		
		 
		expensesInformationPage.addDeadLine(deadline);
		expensesInformationPage.clickOnSace();
		expensesInformationPage.clickOnEdid();
		expensesInformationPage.clickUpdate();

		 ele = driver.findElement(By.name("sem"));
			Select s=new Select(ele);
			s.selectByIndex(1);
		

		driver.findElement(By.name("detail")).sendKeys("123");

		String ActualResult = driver.findElement(By.xpath("//td[.='Aaptop']")).getText();
		Assert.assertEquals(ActualResult, "Aaptop");
		System.out.println("Test Case is pass");

		
	}
}
