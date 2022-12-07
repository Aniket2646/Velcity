package Flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
	@FindBy (xpath = "//div[@class='YUhWwv']")
	private WebElement Prof;
	
	public Cart (WebDriver driver) {
		PageFactory.initElements(driver, this);}
		
		public void cart ( ) {
			Prof.click();}

}
