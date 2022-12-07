package Khan_Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	// Step-1 Declare the Global variable (Data Member)
	
		@FindBy (xpath="//*[@id=\"login-or-signup\"]")
		private WebElement loginlink;
		
		@FindBy (xpath="(//input[@class='_1azps1NaN'])[1]")
	     private WebElement username;

		@FindBy (xpath="//input[@type='password']")
	    private WebElement password;
		
		@FindBy (xpath="//button[@type='submit']")
	    private WebElement login;
		
		//Step-2 Initialization of Variables
		
		public Login(WebDriver driver) {
			PageFactory.initElements(driver, this);}
	
      // Step-3 Method Create
		
		public void link() {
			loginlink.click();}
		
		public void enterUN() {
			username.sendKeys("Aniket2646");}
		
		public void enetrPWD() {
			password.sendKeys("Aniket@123");}
		
		public void Login1() {
			login.click();
		}
}
