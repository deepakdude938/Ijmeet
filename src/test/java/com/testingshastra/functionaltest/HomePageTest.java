package com.testingshastra.functionaltest;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.FileUtility;
import utility.Keywords;

public class HomePageTest {
	
	Logger log=Logger.getLogger(HomePageTest.class);
	
//	Locator loc=new Locator();
	@Test
	public void verifyLogo() {
		Keywords.keyword("IE");
		log.info("Browser opening");
		Keywords.openUrl("https://ijmeet.com/");
//		Assert.assertTrue(Keywords.isElementDisplayed("XPATH", ));
		Keywords.clickOnElement("XPATH", FileUtility.getproperty("logoImage"));
//		Assert.assertTrue(Keywords.isElementDisplayed("XPATH", Locator.getLogoImage()));
	//	log.
		
	}

}
