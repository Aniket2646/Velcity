package Khan_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Khan_Academy.Login;
import Khan_Academy.Logout;
import Khan_Academy.Teachers;

public class Test_01 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.khanacademy.org/login");
		
		// driver.manage().window().maximize();
		
		Login login = new Login(driver);
		
		login.link();
		login.enterUN();
		login.enetrPWD();
		login.Login1();
		
		
		Teachers Tech = new Teachers(driver);
		//Tech.teachers();
		//Tech.Class_code();
		Tech.Profile();
		Tech.LearnPRG();
		Thread.sleep(2000);
		
		Logout logout = new Logout(driver);
		logout.UserID();
		logout.Log_out();
		
	}

}
