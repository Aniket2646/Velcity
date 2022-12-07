package W3School;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnJS {
	
	@FindBy (xpath="//button[text()='Continue']")
	private WebElement Cont;
	
	public LearnJS(WebDriver driver){
		PageFactory.initElements(driver, this);}
	
	public void Continue() {
		Cont.click();
	}

}
