package TestMyAccount;

import org.testng.annotations.Test;

import base.config;
import utils.Xls_Reader;

public class ReadfromXl extends config {

	//Xls_Reader xl = new Xls_Reader (System.getProperty("user.dir") +"//data.xlsx");
	
	Xls_Reader xl = new Xls_Reader ("C:Users//Hasan//workspace//SeleniumFramework//data.xlsx");
	
		// object refect
	// importing
	
	@Test
	public void testReadFromXL(){

		APPLICATION_LOG.debug("Test case - lern how to read from excel");
 driver.get("http://www.facebook.com");
		//String locators = xl.getCellData(sheetName, colName, rowNum)
		String locators = xl.getCellData("fb", "Locators", 2);
		String value = xl.getCellData("fb", "Values", 2);
		
		typeByXpath (locators, value);
	



	}
}


