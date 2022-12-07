package TestNG;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
	import org.testng.annotations.BeforeClass;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
	import Khan_Academy.Login;
	import Khan_Academy.Logout;
	import Khan_Academy.Teachers;
	import Khan_Academy.Teachers_1;

	public class Cross_Browser {
		WebDriver driver;
		Login login;
		Teachers Tech;
		Logout logout;
		SoftAssert soft;
		
		@Parameters("browser")
		
		@BeforeTest
		public void openBrowser(String browsername) {
			System.out.println(browsername);
			
			if (browsername.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				}
			
			if (browsername.equals("Firefox"))	{
				
				System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.32.0-win64\\geckodriver.exe\\");
				driver = new FirefoxDriver();
		         }
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.khanacademy.org/login");
			driver.manage().window().maximize();}
			
			@BeforeClass
			public void beforeclass() {
				login = new Login(driver);
				Tech = new Teachers(driver);
			// Teachers_1 Tec = new Teachers_1 (driver);
				logout = new Logout(driver);
			 }
			
			@BeforeMethod
			public void beforemethod () {
			
			login.link();
			login.enterUN();
			login.enetrPWD();
			login.Login1();
			soft = new SoftAssert();}
			
			@Test 
			public void test2 () {
			
			Tech.Profile();
			Tech.LearnPRG();
			
			String url = driver.getCurrentUrl();
			soft.assertEquals(url, "https://www.khanacademy.org/computing/computer-programming/programming");
			soft.assertAll();
			}
			
			
		/*	 @Test 
			public void test1() {
			Teachers_1 Tec = new Teachers_1 (driver);
			Tec.Teachers();}  */
		
			
			@AfterMethod
			public void aftermethod() {
			
			logout.UserID();
			logout.Log_out();}
			
			@AfterClass
			public void afterclass () {
				login=null;
				Tech=null;
				logout=null;}
				
			@AfterTest 
			public void afterTest() {
				driver.close();
				System.gc();  // garbage collector object delete and clear memory
	}


}