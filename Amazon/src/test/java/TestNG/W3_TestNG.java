package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.ltgfmt.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import W3School.LogOut;
import W3School.My_Learning;
import W3School.W3_Login;

public class W3_TestNG {
	WebDriver driver;
	W3_Login login;
	My_Learning Learn;
	LogOut Lgt;

		@BeforeClass
		public void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://profile.w3schools.com/");
		driver.manage().window().maximize();}
		
		@BeforeMethod
		public void beforemethod() {
		login = new W3_Login (driver);
		login.Email();
		login.password();
		login.Login();}
		
		@Test
	    public void test () {
		Learn = new My_Learning (driver);
		Learn.Learning();}
	    
		@AfterMethod
		public void aftermethod() {
	    Lgt = new LogOut (driver);
	    Lgt.Logout(); 
	    }
		
		@AfterClass
		public void afterclass() {
			driver.close();}
		
}
	  
	
	


