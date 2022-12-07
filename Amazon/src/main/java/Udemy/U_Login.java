package Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class U_Login {
	
	
	// https://www.udemy.com/join/login-popup/
	@FindBy (xpath="//input[@name='email']")
	private WebElement Email_input;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement Pass_input;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement submit_1;
	
	// Initialization of Variables
	public U_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);}
	
	// Method creation
	
	public void Email() {
		Email_input.sendKeys("poojawaghmare262000@gmail.com");}
		
	public void password() {
		Pass_input.sendKeys("Pujarohan@160207");}
	
	public void submit () {
		submit_1.click();}

	

}
