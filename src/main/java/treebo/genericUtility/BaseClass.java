package treebo.genericUtility;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	protected LoginPage loginbutton;
	protected commonPage commonpage;
	private String username;
	private String password;
	protected WebDriverUtility webDriverUtility;
	protected WebDriver driver;
	protected FileUtility fileutility;
	public static WebDriver sdriver;
	public static Java sjava;
	protected WebElement ele;

	/**
	 * initilize the all activities
	 * open Excel,open property file
	 * read the common data
	 * creatae the instance for browser(launch browser)
	 * maximize,implicit wait
	 * open the application
	 * initilize jsexecutor,actions,webdriverwait
	 * create the instance foe commom object repo
	 * @throws IOException 
	 * 
	 */
	@BeforeClass(groups="baseclass")
	public void classSetUp() throws IOException {

		//create instance for the Generic Utility
		 fileutility = new FileUtility();
		Java java = new Java();
		 webDriverUtility = new WebDriverUtility();
		 sjava=java;
		 

		//initilize the property file
		 
		fileutility.initilizePropertyFile(IconstantPath.PROPERTY_FILE_PATH);

		//Fetch the Data from property file
		String browser=fileutility.getDataFromPropertyFile("browser");
		String url = fileutility.getDataFromPropertyFile("url");
		 username = fileutility.getDataFromPropertyFile("username");
		 password = fileutility.getDataFromPropertyFile("password");
		String timeout = fileutility.getDataFromPropertyFile("timeout");
		

		long longTimeout =(long) java.converStringIntoAnyDatatype(timeout, DataType.LONG);

		//launching the browser and doing some browser setting
		 driver = webDriverUtility.launchBrowser(browser);
		webDriverUtility.maximizeBrowser();
		webDriverUtility.waitTillPageLoad(longTimeout);
		webDriverUtility.navigateApplication(driver, url);
		sdriver=driver;
		webDriverUtility.jsinitillization(driver);

		//create object for common pom repo
		loginbutton = new LoginPage(driver);
		commonpage = new commonPage(driver);
		


	}
	/**
	 * whenever we create the testscript class for module and test annotation method for testcase
	 * create the instance for browser(launch the browser)
	 * initilize jsexecutor,actions,webdriverwait
	 * create the instance for common object repo(driver)
	 * login to app
	 */
	@BeforeMethod(groups="baseclass")
	public void methodSetUp() {
		
		loginbutton.loginAction(username, password);
	}
	@AfterMethod(groups="baseclass")
	public void methodTearDown(){
		commonpage.signoutAction(webDriverUtility);
	}

}
