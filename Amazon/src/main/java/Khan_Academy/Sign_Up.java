package Khan_Academy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sign_Up {
	
	// Step-1 Declare the Global variable (Data Member)
	
	//@FindBy (xpath="")
	
	@FindBy (xpath="(//input[@class='_1azps1NaN'])[1]")
     private WebElement username;

	@FindBy (xpath="(//input[@class='_1azps1NaN'])[2]")
    private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
    private WebElement login;
	
	//Step-2 Initialization of Variables
	
	//public Login
	
	
	
}
