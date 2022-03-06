package org.locator;

import org.adac.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass{
	
	public BookHotel() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(name ="first_name")
	private WebElement txtFirst;
	
	@FindBy(name ="last_name")
	private WebElement txtlast;
	
	@FindBy(name ="address")
	private WebElement txtaddress;
	
	
	@FindBy(name ="cc_num")
	private WebElement txtCardNo;
	
	@FindBy(name ="cc_type")
	private WebElement txtCardType;
	
	@FindBy(name ="cc_exp_month")
	private WebElement txtCardMonth;
	
	@FindBy(name ="cc_exp_year")
	private WebElement txtCardYear;
	
	@FindBy(xpath ="//input[@type='button']")
	private WebElement btnbook;
	
	public WebElement getBtnbook() {
		return btnbook;
	}

	public WebElement getTxtFirst() {
		return txtFirst;
	}

	public WebElement getTxtlast() {
		return txtlast;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getTxtCardType() {
		return txtCardType;
	}

	public WebElement getTxtCardMonth() {
		return txtCardMonth;
	}

	public WebElement getTxtCardYear() {
		return txtCardYear;
	}

	public WebElement getTxtCardCvv() {
		return txtCardCvv;
	}

	@FindBy(name ="cc_cvv")
	private WebElement txtCardCvv;
	
	
	
	
	
	
	
	
	

}
