package org.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumconcepts {

public static void main(String[] args) throws InterruptedException {

	// to set the properties for the driver
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SANDEEP\\\\Desktop\\\\SELENIUM\\\\chromedriver.exe");

	//Initialize webdriver

WebDriver driver = new ChromeDriver();
	
	//to maximize window
	
driver.manage().window().maximize();

Thread.sleep(10000);

	// launch the driver

driver.get("https://www.facebook.com/");

Thread.sleep(10000);
	
WebElement username = driver.findElement(By.id("email"));
username.sendKeys("Navya");
	
Thread.sleep(10000);
	
	//killing the driver

driver.quit();
	
	}

}
