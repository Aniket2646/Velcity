package W3School;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Typescript_Tutor {
	
	@FindBy (xpath = "//div[@id='mypagediv']")
	private WebElement Prof;
	
	public Typescript_Tutor (WebDriver driver) {
		PageFactory.initElements(driver, this);}
	
	public void Profile() {
		Prof.click();
	}

}
