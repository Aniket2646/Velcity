package W3School;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Learning {
	
	@FindBy (xpath="//div[@class='TutorialCard_cardBody__2N_I0 card-body']")
		private WebElement Lrn;
	
	public My_Learning (WebDriver driver) {
		PageFactory.initElements(driver, this);}
		
		public void Learning() {
			Lrn.click();}
		
}


