package day25_DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task20_Q1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://jqueryui.com/datepicker/");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	    WebElement date22 = driver.findElement(By.xpath("//a[text()='22']"));
	    
	    date22.click();

	    System.out.println("Selected Date: " + date22.getText());
	    
	    Thread.sleep(2000);
	    
	    driver.quit();
		
		
		
		
		
	
		

		
		
			
		
		
		
		
			
		
		
		
		
		
		
		
	}
	
	
}
