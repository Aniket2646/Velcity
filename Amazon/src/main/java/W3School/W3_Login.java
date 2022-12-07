package W3School;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3_Login {
	
	@FindBy (xpath="//input[@name='email']")
	private WebElement Email_input;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement Pass_input;
	
	@FindBy (xpath="//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button")
	private WebElement Login_01;
	
	// Initialization of Variables
	public W3_Login (WebDriver driver) {
		PageFactory.initElements(driver, this);}
	
	public void Email() {
		Email_input.sendKeys("aniketpatil2646@gmail.com");}
	
	public void password () {
		Pass_input.sendKeys("Aniket@123");}
	
	public void Login() {
		Login_01.click();
	}

}
