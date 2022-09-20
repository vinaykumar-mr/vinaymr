package org.treebo.practice;

import java.io.IOException;

import treebo.genericUtility.ExcelUtility;
import treebo.genericUtility.FileUtility;
import treebo.genericUtility.IconstantPath;
import treebo.genericUtility.Java;

public class TestingGenericUtility {
public static void main(String[] args) throws IOException {
	int randomNumber = new Java().getRandomNumber(2000);
	
	String data = new ExcelUtility().getDataFromExcel(IconstantPath.EXCEL_PATH, "Contacts", 2, 1)+randomNumber;
	System.out.println(data);
	  //String browser = new FileUtility().getDataFromPropertyFile(IconstantPath.PROPERTY_FILE_PATH,"browser");
	  //System.out.println(browser);
}
}
