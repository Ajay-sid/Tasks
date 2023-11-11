package day23;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task18_Q1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Actions build = new Actions(driver);
		
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(1000);
		
		WebElement CreateActButton = driver.findElement(By.linkText("Create new account"));
		CreateActButton.click();
		
		Thread.sleep(1000);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Ajay");
		
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Sid32");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("testingpurpose6299@gmail.com");
		
		
		WebElement ReEmail = driver.findElement(By.name("reg_email_confirmation__"));
		ReEmail.sendKeys("testingpurpose6299@gmail.com");
		
		
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("Test@123");
		
		WebElement dayDrop = driver.findElement(By.name("birthday_day"));
		Select optionDay = new Select(dayDrop);
		optionDay.selectByValue("11");
		
		WebElement monthDrop = driver.findElement(By.name("birthday_month"));
		Select optionMonth = new Select(monthDrop);
		optionMonth.selectByValue("5");

		WebElement yearDrop = driver.findElement(By.name("birthday_year"));
		Select optionYear = new Select(yearDrop);
		optionYear.selectByValue("1985");
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
		
		build.click(gender).perform();
				
				
		driver.findElement(By.name("websubmit")).click();
		
		//Unable to validate successfull user register as its directing to eMail OTP
		
		Thread.sleep(5000);
		driver.close();
		
		
		
			
			
			
			
		
		
		
		
	}

}
