package ObjectRepo.treebo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchActivityPage {
	@FindBy(id="search")
	private WebElement passStudentId;

	@FindBy(xpath = "//span[@class='glyphicon glyphicon-search']")
	private WebElement clickonSearchIcon;

	//initilization
	public SearchActivityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void checkStudentId(String id) {
		passStudentId.sendKeys(id);
	}
	public void searchStudentId() {
		clickonSearchIcon.click();
	}
}
