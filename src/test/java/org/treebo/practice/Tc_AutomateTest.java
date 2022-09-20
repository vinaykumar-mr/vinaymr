package org.treebo.practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectRepo.treebo.SearchActivityPage;
import ObjectRepo.treebo.StudentPageDetailPage;
import treebo.genericUtility.BaseClass;

public class Tc_AutomateTest extends BaseClass {
	

		@Test(groups="regression")
		public void tc_automate() throws IOException  {
			

			StudentPageDetailPage studentPageDetail = new ObjectRepo.treebo.StudentPageDetailPage(driver);
			SearchActivityPage searchStudentId = new SearchActivityPage(driver);
			
			String student_id = fileutility.getDataFromPropertyFile("student_id");
			String firstname = fileutility.getDataFromPropertyFile("firstname");
			String middlename = fileutility.getDataFromPropertyFile("middlename");
			String lastname = fileutility.getDataFromPropertyFile("lastname");

			commonpage.clickOnAccountTab();
			commonpage.clickOnStudentTab();
			commonpage.clickOnaddStudent();
			
			studentPageDetail.passStudentId(student_id);
			studentPageDetail.StudentFirstNmae(firstname);
			studentPageDetail.StudentMiddleNmae(middlename);
			studentPageDetail.StudentLastNmae(lastname);
			 ele = driver.findElement(By.name("year"));

			Select s=new Select(ele);
			s.selectByIndex(2);
			studentPageDetail.ClickOnSaveStudent();
			studentPageDetail.clickOnTransactionTab();
			searchStudentId.checkStudentId(student_id);
			searchStudentId.searchStudentId();
			
			
			
			
			
			
		



		}
	}
