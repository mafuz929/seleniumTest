package TestAnnotations;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PrecticeAnnoation {

	
	@BeforeSuite
	public void setup(){
		System.out.println("Before the test execute only once");
		
	}
	
//	@BeforeMethod
//	public void beforeMethod(){
//		// wait 30 sec
//		System.out.println("Before EACH Test Case");
//	}
//	
//	@AfterMethod
//	public void afterMethod(){
//		System.out.println("After EACH Test Case");
//	}
//	
	@Test
	public void loginInvalidUID(){
		// selenium code
		System.out.println("this is my first test");
		
	}
	
	@Test
	public void loginWitValidUID(){
		// selenium code
		System.out.println("this is my 2nd test");
		
	}
	
	// after test
}
