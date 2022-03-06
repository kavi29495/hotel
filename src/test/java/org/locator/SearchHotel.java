package org.locator;

import java.io.IOException;

import org.adac.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass{
	
	public SearchHotel() {

		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath ="//select[@name='location']")
	private WebElement txtlocation;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement txtHotel;
	
	@FindBy(name="room_type")
	private WebElement txtRoomType;
	
	@FindBy(name="room_nos")
	private WebElement txtRoomNo;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement txtCheckIn;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement txtCheckOut;
	
	@FindBy(name="adult_room")
	private WebElement txtAdultRoom;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement txtChildRoom;
	
	@FindBy(xpath = "(//input[@type='submit'])")
	private WebElement btnSearch;

	public WebElement getTxtlocation() {
		return txtlocation;
	}

	public WebElement getTxtHotel() {
		return txtHotel;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getTxtRoomNo() {
		return txtRoomNo;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getTxtAdultRoom() {
		return txtAdultRoom;
	}

	public WebElement getTxtChildRoom() {
		return txtChildRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	public void search(String SheetName,int rownum,int cellnum) throws IOException {
		WebElement loc = getTxtlocation();
		String data1 = getdata(SheetName, rownum, cellnum);
		type(loc, data1);
		
		WebElement hotel = getTxtHotel();
		String data2 = getdata(SheetName, rownum, cellnum);
		type(hotel, data2);
		
		WebElement roomType = getTxtRoomType();
		String data3 = getdata(SheetName, rownum, cellnum);
		type(roomType, data3);
		
		
		WebElement roomno = getTxtRoomNo();
		String data4 = getdata(SheetName, rownum, cellnum);
		type(roomno, data4);
		
		
		WebElement checkin = getTxtCheckIn();
		String data5 = getdata(SheetName, rownum, cellnum);
		type(checkin, data5);
		
		
		WebElement checkout = getTxtCheckOut();
		String data6 = getdata(SheetName, rownum, cellnum);
		type(checkout, data6);
		
		WebElement adult = getTxtAdultRoom();
		String data7 = getdata(SheetName, rownum, cellnum);
		type(adult, data7);
		
		WebElement child = getTxtChildRoom();
		String data8 = getdata(SheetName, rownum, cellnum);
		type(child, data8);
		
		WebElement btnSearch = getBtnSearch();
		btnSearch.click();
		
		
		
	}
	
	

}
