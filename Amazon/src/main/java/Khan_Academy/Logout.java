package Khan_Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	@FindBy (xpath="//span[@class='_wozql4 _13hnk7qk']")
	private WebElement ID;
	
	@FindBy (xpath="//span[text()='Log out']")
	private WebElement Logt;
	
	public Logout (WebDriver driver) {
		PageFactory.initElements(driver, this);}
		
	public void UserID () {
		ID.click();}
		
	public void Log_out() {
		Logt.click();}


}