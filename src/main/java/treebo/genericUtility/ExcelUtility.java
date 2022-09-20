package treebo.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consist reusable to handle Excel file
 * @author nadaf
 *
 */
public class ExcelUtility {
	Workbook workBook;
	/**
	 * 
	 * @param excelpath
	 * @param sheetname
	 * @param rowNumber
	 * @param cellNumber
	 * @return
	 */

	public String getDataFromExcel(String excelpath,String sheetname,int rowNumber,int cellNumber)
	{

		FileInputStream fisexcel = null;
		try {
			fisexcel = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Workbook WorkBook=null;
		try {
			WorkBook = WorkbookFactory.create(fisexcel);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = WorkBook.getSheet(sheetname);
		String data = new DataFormatter().formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
		try {
			WorkBook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	/**
	 * This Method is use to fetch the data from Excel
	 * @param sheetname
	 * @param requiredKey
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDataFromExcel(String sheetname,String requiredKey ) throws EncryptedDocumentException, IOException {
		FileInputStream fisexcel = new FileInputStream("./src/test/resources/TestData1.xlsx");
		Workbook WorkBook=null;
		WorkBook = WorkbookFactory.create(fisexcel);
		Sheet sheet = WorkBook.getSheet(sheetname);
		String value=null;
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			String actualKey = sheet.getRow(i).getCell(0).getStringCellValue();
			if(actualKey.equalsIgnoreCase(requiredKey)) {
				value = sheet.getRow(i).getCell(1).getStringCellValue();
				break;
			}
		}
		return value;
	}
	/**
	 * This Method used to fetch the multiple data from excel and return as 2 dimensional array
	 * @param excelPath
	 * @return 
	 */
	public String[][] getMultipleData(String sheetName) {
		Sheet sheet = workBook.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		String[][] arr=new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				arr[i-1][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		return arr;
	}
	public void openExcel(String excelPath) {
		// TODO Auto-generated method stub

	}
	public Map<String, String> getDataFromExcelInMap(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fisexcel = new FileInputStream("./src/test/resources/TestData1.xlsx");
		Workbook WorkBook=null;
		WorkBook = WorkbookFactory.create(fisexcel);
		Sheet sheet = WorkBook.getSheet(sheetname);
		Map<String, String> map=new HashedMap<>();
		DataFormatter df = new DataFormatter();
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			map.put(df.formatCellValue(sheet.getRow(i).getCell(0)), df.formatCellValue(sheet.getRow(i).getCell(1)));

		}
		return map;
	}

	public List<Map<String, String>> getDataFromExcelInList(String sheetname ) throws EncryptedDocumentException, IOException {
		FileInputStream fisexcel = new FileInputStream("./src/test/resources/TestData1.xlsx");
		Workbook WorkBook=null;
		WorkBook = WorkbookFactory.create(fisexcel);
		Sheet sheet = WorkBook.getSheet(sheetname);
		List<Map<String,String>>list = new ArrayList<>();
		DataFormatter df = new DataFormatter();
		for(int k=1;k<=sheet.getRow(0).getLastCellNum();k++) {
			Map<String,String > map=new HashedMap<>();
			for(int i=0;i<=sheet.getLastRowNum();i++) {
				map.put(df.formatCellValue(sheet.getRow(i).getCell(0)), df.formatCellValue(sheet.getRow(i).getCell(k))); 
			}
			list.add(map);
		}
		return list;



	}

	}
