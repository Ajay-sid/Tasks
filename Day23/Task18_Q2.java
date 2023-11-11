package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task18_Q2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(drag, drop).perform();
	
		
		String cssVal = "rgb(255, 250, 144)";
		String dropVal = "Dropped!";
		
		if(drop.getCssValue("background").contains(cssVal) && drop.getText().equals(dropVal) ) {
			
			System.out.println("Drop Action performed Successfully!");
			
		}else {
			System.out.println("Drop Action failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
