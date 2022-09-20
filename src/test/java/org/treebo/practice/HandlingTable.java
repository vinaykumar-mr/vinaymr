package org.treebo.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("http://rmgtestingserver:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Organizations")).click();
	String exOrgName = "ACC99";
	
	List<WebElement> OrganizatioList = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td/a[@title='Organizations']"));
	for(WebElement org: OrganizatioList)
	{
		String orgname = org.getText();
		System.out.println(orgname);
		if(orgname.equals(exOrgName))
		{
			driver.findElement(By.xpath("//a[text()='"+exOrgName+"']/parent::td/preceding-sibling::td/input")).click();
			break;
		}
	}
	driver.findElement(By.xpath("//input[@class='crmbutton small delete']")).click();
	driver.switchTo().alert().accept();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@id='status']/img"))));
	
	
	List<WebElement> latestOrganizatioList = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td/a[@title='Organizations']"));
	for(WebElement org:latestOrganizatioList )
	{
		String orgname = org.getText();
		if(orgname.equals(exOrgName))
		{
			System.out.println("TC is fail....organisation is not deleted");
		}
	}
	
	
	
	
	
	
	
	
}
}
