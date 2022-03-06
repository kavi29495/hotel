package org.locator;

import org.adac.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass{
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement btnHotel;
	
	@FindBy(xpath ="//input[@type='submit']")
	private WebElement btnclick;

	public WebElement getBtnHotel() {
		return btnHotel;
	}

	public WebElement getBtnclick() {
		return btnclick;
	}
	
	public void select() {
		WebElement btnHotel2 = getBtnHotel();
		btnHotel2.click();
		
		WebElement btnclick2 = getBtnclick();
		btnclick2.click();
		
		

	}	
	}

