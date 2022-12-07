package Byjus;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drag_n_Drop {
	
	WebDriverWait wait;
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.khanacademy.org/login");
	// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//input[@class='_1azps1NaN'])[1]")).sendKeys("Aniket2646");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aniket@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//span[@class='_18gnmgv']")).click();   // Courses Selected 
	driver.findElement(By.xpath("//span[text()='Class 1']")).click();    // Class 1 selected 
	driver.findElement(By.xpath("//a[@class='_1rhl3qm4']")).click();     // Get Started 
	driver.findElement(By.xpath("//a[@class='_1lrvdlvw']")).click();     // Start Quiz
	Thread.sleep(3000);
	
	WebElement source = driver.findElement(By.xpath("(//div[@class='paragraph'])[5]"));
	
	WebElement target = driver.findElement(By.xpath("//div[@class='card drag-hint']"));
	
	Actions banana = new Actions (driver);
	
	for (int fruit = 0; fruit<6; fruit++) {
		Thread.sleep(2000);
		banana.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);
	}
		
	
	
	
	
	}
}
