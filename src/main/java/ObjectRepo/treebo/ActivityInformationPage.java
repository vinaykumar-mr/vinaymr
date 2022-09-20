package ObjectRepo.treebo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityInformationPage {
	//declartion
		@FindBy(name="title")
		private WebElement addTitle;

		@FindBy(name="description")
		private WebElement adddescription;

		@FindBy(name="start")
		private WebElement startDate;

		@FindBy(name="end")
		private WebElement endDate;

		@FindBy(name="save_activity")
		private WebElement clickonSaveActivity;
		
		@FindBy(xpath ="//a[.=' Update']")
		private WebElement Update;
		
		@FindBy(name="title")
		private WebElement addingTitle;

		@FindBy(name="update_activity")
		private WebElement UpdateActivity;

		//initilization
		public ActivityInformationPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void addingTittle(String title) {
			addTitle.sendKeys(title);
		}

		public void addingdescription(String description) {
			adddescription.sendKeys(description);
		}
		public void addingStartDate(String start) {
			startDate.sendKeys(start);
		}
		public void addingEndDate(String end) {
			endDate.sendKeys(end);
		}
		public void clickOnSave() {
			clickonSaveActivity.click();
		}
		public void clickOnUpdate() {
			Update.click();
		}
		public void clickOnUpdateActivity() {
			UpdateActivity.click();
		}
		public void updateTitle(String title1) {
			addingTitle.sendKeys(title1);
		}
}
