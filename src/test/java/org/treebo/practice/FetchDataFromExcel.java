package org.treebo.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fisExcel=new FileInputStream("./src/test/resources/TestData1.xlsx");
	Workbook wb = WorkbookFactory.create(fisExcel);
	Sheet sheet = wb.getSheet("CommonData");
	int lastrow = sheet.getLastRowNum();
	for(int i=0;i<lastrow;i++)
	{
		Row row = sheet.getRow(i);
		int cellvalue = row.getLastCellNum();
		for(int j=0;i<cellvalue-1;j++)
		{
			Cell cell = row.getCell(j);
			String value = cell.toString();
			System.out.println(value);
		}
	}
	
}
}
