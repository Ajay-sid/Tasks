/*
2. Write a Selenium Java script that opens the Chrome browser, navigates to
"https://www.demoblaze.com, maximizes the browser window, 
verifies if the title of the page is "STORE", 
and prints "Page landed on correct website" if the title matches,
 else prints "Page not landed on correct website"
*/


package day19_Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19_Q2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.demoblaze.com");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("Page "+((title.equals("STORE"))?"":"Not ")+"landed on correct website");
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
