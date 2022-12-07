package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.beust.jcommander.Parameters;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Khan_Academy.Login;
import Khan_Academy.Logout;
import Khan_Academy.Teachers;
import Khan_Academy.Teachers_1;
import Utils.Utility;


public class Khan_TestNG {
	int testID;
	WebDriver driver;
	Login login;
	Teachers Tech;
	Logout logout;

	
   
		@BeforeClass
		public void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.khanacademy.org/login");
		driver.manage().window().maximize(); }
		
		@BeforeMethod
		public void beforemethod () {
		login = new Login(driver);
		
		login.link();
		login.enterUN();
		login.enetrPWD();
		login.Login1();}
		
		@Test 
		public void test2 () {
		testID=001;	
		Tech = new Teachers(driver);
		Tech.Profile();
		Tech.LearnPRG();
		
		String url = driver.getCurrentUrl();
		//Assert.assertEquals(url, "https://www.khanacademy.org/computing/computer-programming/programming");}
		boolean result = url.equals("https://www.khanacademy.org/computing/computer-programming/programming");
		AssertJUnit.assertTrue(result);}
		/* if (url.equals("https://www.khanacademy.org/computing/computer-programming/programming")) {
			 System.out.println("URL is correct");}
		 else {
			 System.out.println("URL is incorrect");}} */
		
		 @Test 
		public void test1() {
			testID=002; 
		Teachers_1 Tec = new Teachers_1 (driver);
		Tec.Teachers();}
	
		
		@AfterMethod
		public void aftermethod(ITestResult result) throws IOException {
			
		if (ITestResult.FAILURE == result.getStatus()) {
			Utility.captureScreenshot(driver, testID); }
		
		logout = new Logout(driver);
		logout.UserID();
		logout.Log_out();}
		
		@AfterClass
		public void afterclass () {
			driver.close();}
		
		
	

}
