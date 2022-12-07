package Flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	// https://www.flipkart.com/
	
	@FindBy (xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement Email;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement Pass;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement Sub;
	
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);}
	
	public void UI () {
		Email.sendKeys("aniketpatil2646@gmail.com");}
	
	public void Password() {
		Pass.sendKeys("9970526283");}
	
	public void Submit() {
		Sub.click();}
	
}
