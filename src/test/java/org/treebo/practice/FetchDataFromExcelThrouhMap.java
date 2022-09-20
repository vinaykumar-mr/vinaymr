package org.treebo.practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;


public class FetchDataFromExcelThrouhMap {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	treebo.genericUtility.ExcelUtility excelutility = new treebo.genericUtility.ExcelUtility();
	excelutility.openExcel(treebo.genericUtility.IconstantPath.EXCEL_PATH);
	String firstname = excelutility.getDataFromExcel("form", "FirstName");
	String State = excelutility.getDataFromExcel("form", "State");
	System.out.println(firstname);
	System.out.println(State);
	
}
}
