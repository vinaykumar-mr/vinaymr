package org.treebo.practice;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import treebo.genericUtility.ExcelUtility;
import treebo.genericUtility.IconstantPath;

public class TestNGPractice1Test {
@Test(dataProvider = "getData")
public void step1Test(String username,String password) {
	System.out.println(Thread.currentThread().getId());
	System.out.println("username"+username);
	System.out.println("password"+password);
	System.out.println();
}
@DataProvider
public String[][] getData() {
	ExcelUtility excelutility = new ExcelUtility();
	excelutility.openExcel(IconstantPath.EXCEL_PATH);
	String[][] obj = excelutility.getMultipleData("Login Data");
	return obj;
}

}
