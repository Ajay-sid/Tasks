/*
 * 1. Write a Selenium script that opens the Firefox browser,
 *  maximizes the browser window,
 *  navigates to "http://google.com" prints the URL, of the current page
 *  , reloads the page, and closes the browser.

 */

package day19_Task16;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Day19_Q1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://google.com");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
