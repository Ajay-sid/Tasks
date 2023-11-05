/*
 * Q2 Write a Selenium script in Java to open Google and search for "Selenium Browser Driver."

 */

package Day18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {


public static void main(String[] args) throws InterruptedException {
	
    // Set the path to the ChromeDriver executable (download it from https://chromedriver.chromium.org/)

	//or paste "Automation" dependency from MVN in your POM.xml
	
	
    // Create a WebDriver instance for the Chrome browser
	WebDriver driver = new ChromeDriver();
	
    // Maximize the browser window
	driver.manage().window().maximize();
	
    // Navigate to Google
	driver.get("https://www.google.com");
	
    // Find the search input element by its "Id" attribute (in this case, it's 'APjFqb' for Google)
    // and Enter the search query using sendKeys method
	driver.findElement(By.id("APjFqb")).sendKeys("Selenium Browser Driver");
	
	//Using Implicitwait to wait for specific time to prevent any Exception
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
    // Find and click the Google Search button (name attribute is 'btnK' for Google)
	driver.findElement(By.name("btnK")).click();
	
	//Can also java wait 
	Thread.sleep(7000);
	
	
	//Closing the browser
	driver.quit();
	
	
	
	
}
}
