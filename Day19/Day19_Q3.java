/*
 
3. Write a Selenium Java script that opens the chrome browser, navigates to
https://www.wikipedia.org/"
maximizes the browser window, searches for the query
"Artificial Intelligence"
", clicks on the "History" section in the search results, and prints
the title of the section.
 */


package day19_Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19_Q3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.wikipedia.org");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence",Keys.ENTER);
		
		driver.findElement(By.linkText("History")).click();
       
        WebElement historySection = driver.findElement(By.cssSelector("h1#firstHeading"));
        String title = historySection.getText();
        System.out.println(title);

        
        driver.quit();
    
		
		
		
		
		
		
		

	}

}
