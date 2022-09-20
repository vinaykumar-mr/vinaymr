package org.treebo.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromDb {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/TestData1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	DataFormatter df=new DataFormatter();
	try
	{
		Sheet sheet = wb.getSheet("Sheet1");
	Cell cell = sheet.getRow(0).getCell(0);
	String data = df.formatCellValue(cell);
	System.out.println(data);
	}
	/*try
	{
	 Sheet sheet = wb.getSheet("Sheet1");
			 int data = (int)sheet.getRow(0).getCell(0).getNumericCellValue();
			 
	System.out.println(data);
	}*/
	finally
	{
		wb.close();
	}
}
}
