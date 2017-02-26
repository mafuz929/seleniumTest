package TestMyAccount;

import org.testng.annotations.Test;

import base.config;

public class Log4jTesting extends config {

	// understand how to config log4j -  DONE
	// why we need log4j -- LOG 
	
	@Test
	public void testLog4j(){
		APPLICATION_LOG.debug ("my log4j test start");
		
			
		typeByXpath ("adsf", "adsf");
		APPLICATION_LOG.debug ("I was able to type");
		
		clickByXpath ("adsfasd");
		APPLICATION_LOG.debug ("I was able click");
		
		APPLICATION_LOG.debug ("my log4j test end");
		
		
	}


			
		}
	}


