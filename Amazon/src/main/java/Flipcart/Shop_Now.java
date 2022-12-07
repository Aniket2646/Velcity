package Flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop_Now {
	
	@FindBy (xpath="//div[@class='exehdJ']")
	private WebElement Profi;
	
	public Shop_Now (WebDriver driver) {
		PageFactory.initElements(driver, this);}
	
	public void Profile () {
		Profi.click();
	}
	
	

}
