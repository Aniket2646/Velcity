package W3School;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	@FindBy (xpath = "//button[@title='Log out']")
	private WebElement Logt;
	
	public LogOut(WebDriver driver){
		PageFactory.initElements(driver, this);}
		
		public void Logout() {
			Logt.click();}

}
