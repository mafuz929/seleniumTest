package TestMyAccount;

import org.testng.annotations.Test;

import base.config;

public class loggingTesting extends config{
	
	@Test
	public void testingLog4j (){
		APPLICATION_LOG.debug ("my log4j test start");
		APPLICATION_LOG.debug ("my log4j test end");
	}

}
