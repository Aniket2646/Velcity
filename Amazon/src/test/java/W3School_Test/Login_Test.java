package W3School_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import W3School.LearnJS;
import W3School.LogOut;
import W3School.My_Learning;
//import W3School.Typescript_Tutor;
import W3School.W3_Login;

public class Login_Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://profile.w3schools.com/");
		driver.manage().window().maximize();
		
		W3_Login login = new W3_Login (driver);
		
		login.Email();
		login.password();
		login.Login();
		Thread.sleep(3000);
		
		My_Learning Learn = new My_Learning (driver);
		Learn.Learning();
		Thread.sleep(3000);
		
		//LearnJS cont1 = new LearnJS (driver);
		//cont1.Continue();
		//Thread.sleep(3000);
	
	    //Typescript_Tutor profile =new Typescript_Tutor(driver);
	    //profile.Profile();
	    //Thread.sleep(3000);
	    
	    LogOut Lgt = new LogOut (driver);
	    Lgt.Logout(); 
	    Thread.sleep(3000);
	  
	
	}
}
