package Byjus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN-Brand-BYJU%27S-USD-Exact&utm_term=byjus&gclid=Cj0KCQjwy5maBhDdARIsAMxrkw30p2qYMoe8xOHblLDi_uHpY-rPiZwNcjD2aSjj0kksaMtQvK4RH9EaAthoEALw_wcB");
	
	WebElement Dropdown = driver.findElement(By.xpath("//select[@class='form-control video-selection']"));
	WebElement scroll = driver.findElement(By.xpath("//h2[text()='Watch video lessons ']"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", scroll); // To reach that Web Element on that Web page
	
	Select select = new Select(Dropdown);         // To select the Dropdown
	for(int index=0; index<7; index++) {
	select.selectByIndex(index);                 // To select all the options from dropdown by index method
	
	System.out.println("Available Videos for Class "+ (index+4));
	List<WebElement> Videos = driver.findElements(By.xpath("//div[@class='row row-inline']//a"));
	if(Videos.size()==2) {
		System.out.println("Passed");
		}
	
	Videos.get(0).click();
	driver.switchTo().frame(0);
    String Title = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div")).getText();
	System.out.println(Title);
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("(//button[@type='button'])[14]")).click(); 
	Thread.sleep(3000);
	
	Videos.get(1).click();
	driver.switchTo().frame(0);
    String Title1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div")).getText();
	System.out.println(Title1);
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("(//button[@type='button'])[14]")).click(); 
	System.out.println("===============================================================");

	
	
	
	
	}
	}
}
