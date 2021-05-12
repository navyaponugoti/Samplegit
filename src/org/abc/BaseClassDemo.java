package org.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClassDemo extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
	
		//driver initiation
		
		WebDriver driver2 = getDriver();
	
		//url
		getURL("https://www.facebook.com/");
		
		//insert data
		WebElement username = driver.findElement(By.id("email"));
		insertData(username, "Testing");
		WebElement password = driver.findElement(By.id("pass"));
		insertData(password, "Selenium");
		
		//click
		WebElement login = driver.findElement(By.name("login"));
		click(login);
		
		Thread.sleep(10000);
		//quit Browser
		quitBrowser();
	}
	

}
