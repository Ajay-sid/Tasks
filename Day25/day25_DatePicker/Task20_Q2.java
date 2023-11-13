package day25_DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task20_Q2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		String fullName = "Ajay Sid";
		String email = "Testingpurpose6299@gmail.com";
		String password = "Test@123";
				
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.guvi.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
		//SignUp
		driver.findElement(By.xpath("//a[text()='Sign up'][1]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.id("name")).sendKeys(fullName);
		
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("999999999");
		
		driver.findElement(By.id("signup-btn")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.navigate().back();
		//Unable to validate SignUp functionality
		
		
		//Login 
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("login-btn")).click();
		
		//Login validation
		if(driver.getTitle().equals("GUVI | Login")) {
			System.out.println("User Logged in Successfully!");
		}else {
			System.out.println("Logged in Failed");
		}
			
		
				
				
	}

}
