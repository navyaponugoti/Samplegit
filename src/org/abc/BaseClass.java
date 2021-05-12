package org.abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {

		// to set the properties for the driver
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SANDEEP\\\\Desktop\\\\SELENIUM\\\\chromedriver.exe");

			//Initialize webdriver

		 driver = new ChromeDriver();
		 
		 return driver;
		 
	}
	
	//URL Launching
	
	public static void getURL(String URL) {
		
		driver.get(URL);
	}

	//inserting data
	public static void insertData(WebElement element, String text) {
		
		element.sendKeys(text);
		
	}
	
	//click
	
	public static void click(WebElement element) {
		
		element.click();
	}
	
	// quit browser
	
	
	public static void quitBrowser() {

		driver.quit();
	}
	
	}