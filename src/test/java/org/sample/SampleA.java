package org.sample;



import java.io.IOException;

import org.adac.BaseClass;
import org.locator.BookHotel;
import org.locator.ConfirmHotel;
import org.locator.LoginPage;
import org.locator.SearchHotel;
import org.locator.SelectHotel;

import org.openqa.selenium.WebElement;

public class SampleA extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		BaseClass base = new BaseClass();
		base.getDriver();
		base.UrlLaunch("https://adactinhotelapp.com/");
		base.maximize();
		
		LoginPage page = new LoginPage();
		WebElement name = page.getTxtUserName();
		base.type(name, "naveen53");
		
		WebElement password = page.getTxtPassword();
		base.type(password, "C1IZAU");
		
		WebElement login = page.getBtnlogin();
		base.click(login);
		
		SearchHotel search = new SearchHotel();
		WebElement loc = search.getTxtlocation();
		String data1 = base.getdata("Sheet1", 1, 0);
		base.type(loc, data1);
		
		WebElement hotel = search.getTxtHotel();
		String data2 = base.getdata("Sheet1", 1, 1);
		base.type(hotel, data2);
		
		WebElement roomType = search.getTxtRoomType();
		String data3 = base.getdata("Sheet1", 1, 2);
		base.type(roomType, data3);
		
		
		WebElement roomno = search.getTxtRoomNo();
		String data4 = base.getdata("Sheet1", 1, 3);
		base.type(roomno, data4);
		
		
		WebElement checkin = search.getTxtCheckIn();
		String data5 = base.getdata("Sheet1", 1, 4);
		base.type(checkin, data5);
		
		
		WebElement checkout = search.getTxtCheckOut();
		String data6 = base.getdata("Sheet1", 1, 5);
		base.type(checkout, data6);
		
		WebElement adult = search.getTxtAdultRoom();
		String data7 = base.getdata("Sheet1", 1, 6);
		base.type(adult, data7);
		
		WebElement child = search.getTxtChildRoom();
		String data8 = base.getdata("Sheet1", 1, 7);
		base.type(checkout, data8);
		
		WebElement btnSearch = search.getBtnSearch();
		base.click(btnSearch);
		
		SelectHotel select = new SelectHotel();
		WebElement btnHotel = select.getBtnHotel();
		base.click(btnHotel);
		
		WebElement btnclick = select.getBtnclick();
		base.click(btnclick);
	
		BookHotel book = new BookHotel();
		WebElement First = book.getTxtFirst();
		String data9 = base.getdata("Sheet1", 1, 8);
		base.type(First, data9);
		
		WebElement last = book.getTxtlast();
		String data10 = base.getdata("Sheet1", 1, 9);
		base.type(last, data10);
		
		
		WebElement address = book.getTxtaddress();
		String data11 = base.getdata("Sheet1", 1, 10);
		base.type(address, data11);
		
		
		WebElement CCNum = book.getTxtCardNo();
		String data12 = base.getdata("Sheet1", 1, 11);
		base.type(CCNum, data12);
		
		WebElement CCtype = book.getTxtCardType();
		String data13 = base.getdata("Sheet1", 1, 12);
		base.type(CCtype, data13);
		
		WebElement CCmonth = book.getTxtCardMonth();
		String data14 = base.getdata("Sheet1", 1, 13);
		base.type(CCmonth, data14);
		
		WebElement CCyear = book.getTxtCardYear();
		String data15 = base.getdata("Sheet1", 1, 14);
		base.type(CCyear, data15);
		
		WebElement CCcvv= book.getTxtCardCvv();
		String data16 = base.getdata("Sheet1", 1, 15);
		base.type(CCcvv, data16);
		
		WebElement btnbook = book.getBtnbook();
		btnbook.click();
		
		ConfirmHotel confirm = new ConfirmHotel();
		WebElement orderNo = confirm.getOrderNo();
		String attribute = base.getAttribute(orderNo);
	
	}
	

}
