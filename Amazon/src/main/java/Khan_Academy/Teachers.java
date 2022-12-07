package Khan_Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teachers {
	
	//@FindBy (xpath="//*[@id=\"app-shell-root\"]/div/main/div[2]/div/div[2]/div/div[2]/nav/section[2]/ul/li[3]/a")
	private WebElement teachers_01;
	
	//@FindBy (xpath="//a[@role='button']")
	//private WebElement ClsCode;
	
	@FindBy (xpath="//span[text()='Profile']")
	private WebElement prof;
	
	@FindBy (xpath="//a[@class='_j5agvs2']")
	private WebElement learnPrg;
	
	
	public Teachers(WebDriver driver) {
		PageFactory.initElements(driver, this);}
		
	    // public void teachers() {
		//teachers_01.click();}
		
		//public void Class_code () {
		//ClsCode.click();}	
		
		public void Profile() {
		prof.click();}	
		
		public void LearnPRG() {
			learnPrg.click();}
			
		
	}
	

