package org.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Basiccode {
public static void main(String[] args) throws InterruptedException {
	
	// to set the properties for the driver

	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SELENIUM\\chromedriver.exe");

//Initialize webdriver

WebDriver driver = new ChromeDriver();

Thread.sleep(10000);

// launch the driver
driver.get("https://www.facebook.com/");

Thread.sleep(10000);

//WebElement username = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));

//text() xpath

//WebElement username = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));

//contains() xpath
WebElement username = driver.findElement(By.xpath("//input[contains(@name,'mail')]"));

username.sendKeys("Jiyansha");

Thread.sleep(10000);
//killing the driver

driver.quit();

}	
}
