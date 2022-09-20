package org.treebo.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopup {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String requireDate = "20";
	String requireMonth = "March";
	String requireYear = "2024";
	driver.get("https://testleaf.herokuapp.com/pages/Calendar.html");
	driver.findElement(By.id("datepicker")).click();
	
	
	
	String actualMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	
	
	String[] str=actualMonthYear.split(" ");
	String actualMonth=str[0];
	String actualYear=str[1];
	
	while(!(actualMonth.equals(requireMonth) && actualYear.equals(requireYear)))
	{
		driver.findElement(By.xpath("//span[.='Next']")).click();
		 actualMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		 str=actualMonthYear.split(" ");
		 actualMonth=str[0];
		 actualYear=str[1];
		
		
	}
	driver.findElement(By.xpath("//a[.='"+requireDate+"']")).click();
}
}
