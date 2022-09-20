package ObjectRepo.treebo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesInformationPage {
//declaration
	@FindBy(id="add_expenses")
	private WebElement addExpenses;
	
	@FindBy(name="detail")
	private WebElement Deatils;
	
	@FindBy(name="price")
	private WebElement prices;
	
	@FindBy(name="ay1")
	private WebElement firstYear;
	

	@FindBy(name="ay2")
	private WebElement secondYear;
	
	@FindBy(name="deadline")
	private WebElement Deadline;
	

	@FindBy(name="save_expenses")
	private WebElement Expenses;
	
	@FindBy(xpath="//a[@href='edit_expenses.php?expenses_id=30']")
	private WebElement edit;
	
	@FindBy(name="update_expenses")
	private WebElement update;
	
	//initilization
	public ExpensesInformationPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnExpenses() {
		addExpenses.click();
	}
	public void clickOnDetails(String detail) {
		Deatils.sendKeys(detail);
	}
	public void addPrice(String price) {
		prices.sendKeys(price);
	}
	public void addFirstYear(String year1) {
		firstYear.sendKeys(year1);
	}
	public void addSecondYear(String year2) {
		secondYear.sendKeys(year2);
	}
	public void addDeadLine(String deadline) {
		Deadline.sendKeys(deadline);
	}
	public void clickOnSace() {
		Expenses.click();
		}
	public void clickOnEdid() {
		edit.click();
	}
	public void clickUpdate() {
		update.click();
	}
}
