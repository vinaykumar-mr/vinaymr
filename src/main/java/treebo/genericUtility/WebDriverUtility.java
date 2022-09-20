package treebo.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This Method is use to launch the browser
 * @author nadaf
 *
 */
public class WebDriverUtility {
	Java java;
	static WebDriver driver;
	JavascriptExecutor jse;
	public WebDriver launchBrowser(String browser) {
		switch(browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		default:
			System.out.println("you entered wrong Browser key in the property file");
			break;
		}
		return driver;
	}
	/**
	 * This Method is use to maximize the browser
	 */
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to wait the controller implicitly till load
	 */
	public void waitTillPageLoad(Long longTimeout)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longTimeout));
	}
	/**
	 * this methiod is use to open the application
	 * @param driver
	 * @param url
	 */
	public void navigateApplication(WebDriver driver,String url)
	{
		driver.get(url);
	}
	public WebDriver openBrowserWithApplication(String browser,Long longTimeout,String url)
	{
		WebDriver driver = launchBrowser(browser);
		maximizeBrowser();
		waitTillPageLoad(longTimeout);
		navigateApplication(driver,url);
		return driver;
	}
	public void jsinitillization(WebDriver driver)
	{
		jse = (JavascriptExecutor)driver;
	}
	public void openAppUsingJS(String url)
	{
		jse.executeScript("window.location=arguments[0]", url);	
	}
	public void sendKeysUsingJS(WebElement element,String data) {
		jse.executeScript("arguments[0].value=arguments[1]",element, data);
	}
	public void clicksUsingJS(WebElement element) {
		jse.executeScript("arguments[0].click()",element);
	}
	public void scrollTillElement(WebElement element) {
		jse.executeScript("arguments[0].scrollIntoView",element);


	}
	public WebElement convertDynamicXpathIntoWebElement(String dynamicXpath,String replaceData,WebDriver driver  ) {
		String requiredXpath = String.format(dynamicXpath, replaceData);
		WebElement element = driver.findElement(By.xpath(requiredXpath));
		return element;
	}
	
	public By convertDynamicXpathIntoByClass(String dynamicXpath,String replaceData) {
		String requiredXpath = String.format(dynamicXpath, replaceData);
		By element = By.xpath(requiredXpath);
		return element;
	}
	  public void screenshot(WebDriver driver, Java java, String className) throws IOException {
		
		 String currentTime = java.currentTime();
		 TakesScreenshot tss = (TakesScreenshot)driver;
		 File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot"+className+"_"+currentTime+".png");
		FileUtils.copyFile(src, dst);
	  }

	}
