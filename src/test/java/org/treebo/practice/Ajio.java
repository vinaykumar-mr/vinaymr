package org.treebo.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Ajio");
	String ProductName = sheet.getRow(1).getCell(0).getStringCellValue();
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
driver.get("http://www.ajio.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[@title='KIDS']")).click();
driver.findElement(By.xpath("//a[@href='/s/0-to-2-years-3767-54091']")).click();
String ProductPrice = driver.findElement(By.xpath("//div[text()='Graphic Print Hooded T-shirt']/following-sibling::div/span[@class='price  ']")).getText();
System.out.println(ProductPrice);
sheet.getRow(1).createCell(1).setCellValue(ProductPrice);
FileOutputStream fos=new FileOutputStream("./src/test/resources/TestData1.xlsx");
wb.write(fos);
driver.findElement(By.xpath("//div[text()='"+ProductName+"']")).click();










 //JavascriptExecutor jse=( JavascriptExecutor)driver;









 //jse.executeScript("arguments[0].scrollview", ele);
}
}
