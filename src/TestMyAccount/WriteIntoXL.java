package TestMyAccount;

import org.testng.annotations.Test;

import base.config;
import utils.Xls_Reader;

public class WriteIntoXL extends config {

	Xls_Reader xl = new Xls_Reader (System.getProperty("user.dir") +"//data.xlsx");

	@Test
	public void testWriteIntoXL(){

		//APPLICATION_LOG.debug("Test case - lern how to write into excel");
		
		driver.get("http://www.facebook.com");

		//xl.setCellData(sheetName, colName, rowNum)
		// we got the xpath - locators
		String textPath = xl.getCellData("fb", "Locators", 3);
	//	String actText = driver.findElement(By.xpath(textPath)).getText();
		
		// write into excel
		//xl.setCellData(sheetName, colName, rowNum, data)
		//xl.setCellData ("fb", "Values", 3, actText);
		
		//APPLICATION_LOG.debug("PASS");

	}
}


