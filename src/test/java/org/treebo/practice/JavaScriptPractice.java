package org.treebo.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import treebo.genericUtility.WebDriverUtility;

public class JavaScriptPractice {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	WebDriverUtility wdu=new WebDriverUtility();
	driver.manage().window().maximize();
	wdu.jsinitillization(driver);
	wdu.openAppUsingJS("http://rmgtestingserver/domain/Society_Management_System/admin/");
	wdu.sendKeysUsingJS(driver.findElement(By.id("username")), "admin");
	wdu.sendKeysUsingJS(driver.findElement(By.id("password")), "admin");
	wdu.clicksUsingJS(driver.findElement(By.id("login")));
	wdu.clicksUsingJS(driver.findElement(By.xpath("//a[@href='activity.php']")));
}
}
