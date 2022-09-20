package treebo.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class commonPage {
	//@FindBy(xpath = "//a[.=' Activities']")
		//private WebElement activityTab;
		private WebDriver driver;
		private String dynamicXpath="//a[.=' %s']";

		@FindBy(id = "add_activity")
		private WebElement addactivityTab;

		@FindBy(xpath = "//a[.=' Options']")
		private WebElement optionTab;

		@FindBy(xpath = "//a[.=' Logout']")
		private WebElement signoutLink;

		@FindBy(xpath = "//a[.=' Transaction']")
		private WebElement transactionTab;

		@FindBy(xpath = "//a[text()=' Accounts']")
		private WebElement accountTab;

		@FindBy(xpath = "//a[text()=' Student']")
		private WebElement studentTab;

		@FindBy(id="add_student")
		private WebElement addStdent;


		//initilization
		public commonPage (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		//public void clickActivityTab() {
		//activityTab.click();
		//}

		public void clickRequiredTab(TabName tabName,WebDriverUtility webDriverUtility) {
			webDriverUtility.convertDynamicXpathIntoWebElement(dynamicXpath,tabName.getTabName(), driver).click();
		}
		public void clickonaddActivityTab() {
			addactivityTab.click();
		}
		public void signoutAction(WebDriverUtility webDriverUtility) {
			optionTab.click();
			signoutLink.click();
		}
		public void clickOnTransactionTab() {
			transactionTab.click();
		}
		public void clickOnAccountTab() {
			accountTab.click();
		}
		public void clickOnStudentTab() {
			studentTab.click();
		}
		public void clickOnaddStudent() {
			addStdent.click();
		}

}
