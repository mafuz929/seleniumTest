package TestMyAccount;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipdisable {

	@Test(priority=2)	
	public void signOut (){
		System.out.println("Sign Out");
	}
	

	@Test(priority=1)
	public void signIn (){
		System.out.println("SignIn should happen b4 signOut");
	}
	
	
	@Test	
	public void test1 (){
		System.out.println("my first test");
	}

	@Test	
	public void thridTest (){

		System.out.println("test3");
	}

	@Test	
	public void test2 (){
		System.out.println("test2");
		System.out.println("skipping this test for some reason");
		throw new SkipException ("skipping this test for some reason");
	}
	
	
	@Test	(enabled=false)
	public void test5 (){
		System.out.println("test5: going to disable it");
	}

	@Test	
	public void test4 (){

		System.out.println("test4");
	}


}
