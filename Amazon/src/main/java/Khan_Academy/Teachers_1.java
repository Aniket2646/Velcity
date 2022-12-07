package Khan_Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teachers_1 {
	
	@FindBy (xpath="//*[@id=\"app-shell-root\"]/div/main/div[2]/div/div[2]/div/div[2]/nav/section[2]/ul/li[3]/a")
	private WebElement teachers_01;
	
	public Teachers_1 (WebDriver driver) {
		PageFactory.initElements(driver, this);}
		
		public void Teachers () {
			teachers_01.click();}
		
	

}
