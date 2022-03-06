package org.locator;

import org.adac.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmHotel extends BaseClass{
	
	public ConfirmHotel() {
		PageFactory.initElements(driver, this);
		

	}
	
	@FindBy(name ="order_no")
	private WebElement OrderNo;

	public WebElement getOrderNo() {
		return OrderNo;
	}
	
	

}
