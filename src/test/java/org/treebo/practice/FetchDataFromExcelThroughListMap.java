package org.treebo.practice;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import treebo.genericUtility.ExcelUtility;
import treebo.genericUtility.IconstantPath;

public class FetchDataFromExcelThroughListMap {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	ExcelUtility excelutility = new ExcelUtility();
	excelutility.openExcel(IconstantPath.EXCEL_PATH);
	List<Map<String,String>>list=excelutility.getDataFromExcelInList("form");
	System.out.println(list.get(2).get("FirstName"));
}
}
