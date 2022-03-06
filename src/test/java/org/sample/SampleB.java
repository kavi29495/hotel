package org.sample;

import java.io.IOException;

import org.adac.BaseClass;
import org.locator.LoginPage;
import org.locator.SearchHotel;
import org.locator.SelectHotel;

public class SampleB {
	
	public static void main(String[] args) throws IOException {
		BaseClass base = new BaseClass();
		base.getDriver();
		base.UrlLaunch("https://adactinhotelapp.com/");
		base.maximize();
		
		LoginPage l = new LoginPage();
		l.Login("naveen53", "C1IZAU");
		
		SearchHotel s = new SearchHotel();
		s.search("Sheet1", 1, 0);
		s.search("Sheet1", 1, 1);
		s.search("Sheet1", 1, 2);
		s.search("Sheet1", 1, 3);
		s.search("Sheet1", 1, 4);
		s.search("Sheet1", 1, 5);
		s.search("Sheet1", 1, 6);
		s.search("Sheet1", 1, 7);
		
		SelectHotel h = new SelectHotel();
		h.select();
		
	}

}
