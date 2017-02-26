package base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import utils.WebDriverFunctions;

public class config extends WebDriverFunctions{

	// start stuite
	 	// config browser path
	 	// setup browsers type
	// setup the baseURL
	
	// end - suite
	 	// close browser
 
		// public static Logger APPLICATION_LOG = Logger.getLogger("hasan");
		
		public static Logger APPLICATION_LOG = Logger.getLogger("dest1");
		
	
		@BeforeMethod

	  
	public void setUp (){
		
		// start the test
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\workspace\\Driver\\chromedriver.exe");	
 	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
	//close
	driver.close();
	driver.quit();
	}
	}
