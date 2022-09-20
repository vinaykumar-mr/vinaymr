package org.treebo.practice;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import treebo.genericUtility.ExcelUtility;
import treebo.genericUtility.IconstantPath;

public class FetchDataThroughMap {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	ExcelUtility excelutility = new ExcelUtility();
	excelutility.openExcel(IconstantPath.EXCEL_PATH);
	Map<String, String> map = excelutility.getDataFromExcelInMap("form");
	System.out.println(map);
}
}
