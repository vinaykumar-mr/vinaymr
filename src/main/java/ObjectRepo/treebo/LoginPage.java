package ObjectRepo.treebo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaratio
		@FindBy(id="username")
		private WebElement userNameTextField;

		@FindBy(id="password")
		private WebElement passwordTextField;


		@FindBy(id="login")
		private WebElement loginutton;

		//initilization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		//buisnness Library
		public void loginAction(String username,String password) {
			userNameTextField.sendKeys(username);
			passwordTextField.sendKeys(password);
			loginutton.click();
		}
}
