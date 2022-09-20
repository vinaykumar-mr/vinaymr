package org.treebo.practice;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class MakeMyTrip {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
driver.get("http://www.makemytrip.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//label[@for='fromCity']")).click();
driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
driver.findElement(By.xpath("//label[@for='toCity']")).click();
driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("bengaluru");
//driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();





//driver.findElement(By.xpath("//span[.='From']")).click();
//WebElement ele = driver.findElement(By.xpath("//input[@placeholder='From']"));
//ele.sendKeys("Mumbai");
//Actions a=new Actions(driver);
//a.moveToElement(ele).perform();
//driver.findElement(By.xpath("//div[@class='calc60']")).click();
//ele.sendKeys(Keys.ARROW_DOWN);
//ele.sendKeys(Keys.ENTER);
//WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='To']"));
//ele1.sendKeys("sydney");
//ele1.sendKeys(Keys.ARROW_DOWN);
//ele1.sendKeys(Keys.ENTER);
}
}
