package org.locator;

import org.adac.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);

	}
		
		@FindBy(id="username")
		private WebElement txtUserName;
		
		@FindBy(id="password")
		private WebElement txtPassword;
		
		@FindBy(id="login")
		private WebElement btnlogin;

		public WebElement getTxtUserName() {
			return txtUserName;
		}

		public WebElement getTxtPassword() {
			return txtPassword;
		}

		public WebElement getBtnlogin() {
			return btnlogin;
		}	
		
		public void Login(String Username,String Password) {
			WebElement name = getTxtUserName();
			type(name, Username);
			
			WebElement password2 = getTxtPassword();
			type(password2, Password);
			
			WebElement btnlogin2 = getBtnlogin();
			btnlogin2.click();
			
			
		}
		
	}


