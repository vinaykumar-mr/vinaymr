package ObjectRepo.treebo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentPageDetailPage {
	@FindBy(name="student_id")
	private WebElement studentId;

	@FindBy(name="firstname")
	private WebElement finame;

	@FindBy(name="middlename")
	private WebElement midname;

	@FindBy(name="lastname")
	private WebElement lstname;

	@FindBy(name="section")
	private WebElement div;

	@FindBy(name="save_student")
	private WebElement saveStudent;

	@FindBy(xpath="//a[text()=' Transaction']")
	private WebElement transactionTab;

	@FindBy(id="search")
	private WebElement stu_id;
	//
	//@FindBy(id="btn_search")
	//private WebElement stu_search;

	public StudentPageDetailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void passStudentId(String student_id) {
		studentId.sendKeys(student_id);
	}

	public void StudentFirstNmae(String firstname) {
		finame.sendKeys(firstname);
	}
	public void StudentMiddleNmae(String middlename) {
		midname.sendKeys(middlename);
	}
	public void StudentLastNmae(String 	lastname) {
		lstname.sendKeys(lastname);
	}

	public void StudentSection(String division) {
		div.sendKeys(division);
	}
	public void ClickOnSaveStudent() {
		saveStudent.click();
	}
	public void clickOnTransactionTab() {
		transactionTab.click();
	}

	public void passIdIntoSearchField(String search1) {
		stu_id.sendKeys(search1);
	}
	//public void clickOnSearchIcon() {
//		stu_search.click();
	//}

}
