package TestMyAccount;

import org.testng.annotations.Test;

import base.config;
import values.seachValues;

public class SearchSPA extends config{

	
	seachValues sv = new seachValues();
	searchLocators sl = new searchLocators();
	
	// intro - @BeforeMethod - located in config.java
	// body - @Test
	// conc - @AfterMethod - located in config.jav
	
	@Test	
	public void serchForSpa (){
		driver.get ("http://www.spafinder.com");
		
		System.out.println(driver.getTitle());
		
	
		typeByXpath (sl.iWantSearchLocator, sv.iWantToSearchValue);
		typeByXpath (sl.iWantSearchZipLoc, sv.iWantZipValue);
		clickByXpath (sl.iWantSearchButtonLoc);
	
	}
	
	
}


