package org.adac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public void getDriver() {
 		WebDriverManager.chromedriver().setup();
 		driver = new ChromeDriver();
 	}

 	// URL Launch
 	public void UrlLaunch(String url) {
 		driver.get(url);
 	}
 	//maximize
 	public void maximize() {
driver.manage().window().maximize();
	}
 	//sendkeys
 	public void type(WebElement element,String text) {
 		element.sendKeys(text);
 		
	}
 	
 // LocatorByID
 	 	public WebElement findElementById(String attributevalue) {
 	 		WebElement element = driver.findElement(By.id(attributevalue));
 	 		return element;
 	 	}

 	 	// LocatorByName
 	 	public WebElement findlocatorByName(String attributevalue) {
 	 		WebElement element = driver.findElement(By.name(attributevalue));
 	 		return element;
 	 	}

 	 	// LocatorbyXpath
 	 	public WebElement findElementByXpath(String Xpath) {
 	 		WebElement element = driver.findElement(By.xpath(Xpath));
 	 		return element;
 	 	
 	 		}
 	// LocatorBycalssName
 		 	public WebElement findElementByClassName(String attribute) {
 		 		WebElement element = driver.findElement(By.className(attribute));
 		 		return element;
 		 	}

 		 	// Get Text
 		 	public String getText(WebElement element) {
 		 		String text = element.getText();
 		 		return text;
 		 	}

 		 	// GetAttribute -type1
 		 	public String getAttribute(WebElement element) {
 		 		String text = element.getAttribute("value");
 		 		return text;
 		 	}
 		// GetAttribute -Type2
 		 	public String getAttribute(WebElement element, String string) {
 		 		String text = element.getAttribute(string);
 		 		return text;
 		 	}

 		 	// GetTitle
 		 	public String getTitle() {
 		 		String text = driver.getTitle();
 		 		return text;
 		 	}
 		// SelectOptionByText
 		 	public void selectOptionByText(WebElement element, String text) {
 		 		Select select = new Select(element);
 		 		select.selectByVisibleText(text);
 		 	}

 		 	// SelectoptionByIndex
 		 	public void selectOptionByIndex(WebElement element, int index) {
 		 		new Select(element).selectByIndex(index);
 		 	}

 		 	// SelectOptionByAttributeValue
 		 	public void selectOptionByAttributeValue(WebElement element, String value) {
 		 		new Select(element).selectByValue(value);
 		 	}
 		// TyPE JS
 		 	public void typeJs(WebElement element, String text) {
 		 		JavascriptExecutor executor = (JavascriptExecutor) driver;
 		 		executor.executeScript("argument[0].setAttribute('value'," + text + "')", element);
 		 	}

 		 	// Navigate
 		 	public void navigate(String url) {
 		 		driver.navigate().to(url);
 		 	}

 		 	// forward-Navigate
 		 	public void forward() {
 		 		driver.navigate().forward();
 		 	}

 		 	// Back-Navigate
 		 	public void back() {
 		 		driver.navigate().back();
 		 	}

 		 	// Refresh-Navigate
 		 	public void refresh() {
 		 		driver.navigate().refresh();
 		 	}
 		// MouseOverAction-Click
 		 	public void click(WebElement element) {
 		 		element.click();
 		 	}

 		 	// Click ok
 		 	public void accept() {
 		 		Alert alert = driver.switchTo().alert();
 		 		alert.accept();
 		 	}

 		 	// Confirm Alert
 		 	public void dismiss() {
 		 		Alert alert = driver.switchTo().alert();
 		 		alert.dismiss();
 		 	}

 		 	// PromptAlert
 		 	public void promptAlert(String text) {
 		 		Alert alert = driver.switchTo().alert();
 		 		alert.sendKeys(text);
 		 		alert.accept();
 		 	}

 		 	// ScreenShot-Syntax
 		 	public void getScreenshot(String path) throws IOException {
 		 		TakesScreenshot screenshot = (TakesScreenshot) driver;

 		 		File source = screenshot.getScreenshotAs(OutputType.FILE);
 		 		File Destination = new File(path);
 		 		FileUtils.copyFile(source, Destination);

 		 	}

 		 	// Js Click
 		 	public void jsClick(WebElement element) {
 		 		JavascriptExecutor executor = (JavascriptExecutor) driver;
 		 		executor.executeScript("argument[0].click()", element);
 		 	}

 		 	// ScrollDown
 		 	public void scrollDown(WebElement element) {
 		 		JavascriptExecutor executor = (JavascriptExecutor) driver;
 		 		executor.executeScript("argument[0].scrollIntoView(true)", element);
 		 	}

 		 	// ScrollDown
 		 	public void scrollUp(WebElement element) {
 		 		JavascriptExecutor executor = (JavascriptExecutor) driver;
 		 		executor.executeScript("argument[0].scrollIntoView(false)", element);
 		 	}
 		 

 		 	// firstselectedoption
 		 	public WebElement getFirstSelectedOption(WebElement element) {
 		 		Select select = new Select(element);
 		 		WebElement firstSelectedOption = select.getFirstSelectedOption();
 		 		return firstSelectedOption;
 		 	}

 		 	// is Multiple
 		 	public boolean isMultiple(WebElement element) {
 		 		Select select = new Select(element);
 		 		boolean multiple = select.isMultiple();
 		 		return multiple;
 		 	}

 		 	// deselectbyindex
 		 	public void deselectByIndex(WebElement element, int index) {
 		 		Select select = new Select(element);
 		 		select.deselectByIndex(index);
 		 	}

 		 	// deselectbyVisibletext
 		 	public void deselectByVisibleText(WebElement element, String text) {
 		 		Select select = new Select(element);
 		 		select.deselectByVisibleText(text);
 		 	}

 		 	// deselectall
 		 	public void deselectAll(WebElement element) {
 		 		Select select = new Select(element);
 		 		select.deselectAll();
 		 	}

 		 	// deselectbyvalue
 		 	public void deselectByValue(WebElement element, String value) {
 		 		Select select = new Select(element);
 		 		select.deselectByValue(value);
 		 	}
 		 	public String getdata(String SheetName, int rownum, int cellnum) throws IOException {
 		 		String res = null;
 		 		File file = new File("C:\\Users\\Kavitha\\eclipse-workspace\\Hotel\\ExcelSheet\\Book1.xlsx");
 		 		FileInputStream stream = new FileInputStream(file);
 		 		Workbook workbook = new XSSFWorkbook(stream);
 		 		Sheet sheet = workbook.getSheet(SheetName);
 		 		Row row = sheet.getRow(rownum);
 		 		Cell cell = row.getCell(cellnum);
 		 		CellType type = cell.getCellType();
 		 		switch (type) {
 		 		case STRING:
 		 			res = cell.getStringCellValue();
 		 			break;

 		 		case NUMERIC:
 		 			if (DateUtil.isCellDateFormatted(cell)) {
 		 				java.util.Date date = cell.getDateCellValue();
 		 				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-YYYY");
 		 				res = dateformat.format(date);
 		 			} else {
 		 				double d = cell.getNumericCellValue();
 		 				BigDecimal num = BigDecimal.valueOf(d);
 		 				res = num.toString();
 		 			}
 		 		default:
 		 			break;
 		 		}
 		 		return res;

 		 	}
 		 	public void WriteData(String sheetname, int rownum, int cellnum, String value) throws IOException {
 		 		String res = null;
 		 		File file = new File("C:\\Users\\Kavitha\\eclipse-workspace\\Hotel\\ExcelSheet\\Book1.xlsx");
 		 		FileInputStream stream = new FileInputStream(file);
 		 		Workbook workbook = new XSSFWorkbook(stream);
 		 		Sheet sheet = workbook.getSheet(sheetname);
 		 		Row row = sheet.getRow(rownum);
 		 		Cell cell = row.createCell(cellnum);
 		 		cell.setCellValue(value);
 		 		FileOutputStream out = new FileOutputStream(file);
 		 		workbook.write(out);
 		 	}
 		     
}
 			 	