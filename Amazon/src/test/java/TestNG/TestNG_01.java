package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_01 {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class method is running");}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method is running");}
	
	@Test
	public void test() {
		System.out.println("Test Method is running");}
	

}
