package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOM;

public class TC05_VerifyFilterFunctionality extends TestBaseClass
{
    @Test
    public void verifyFilterDropDown() throws IOException
    {
    	HomePagePOM hp =new HomePagePOM(driver);
    	hp.clickFilter(0);
//    	hp.screenshot(driver);
  
    	log.info("Apply Validation");
    	
    	String expectedEle ="Name (A to Z)";
    	String actualEle = hp.GetText();
    	
    	log.info(actualEle);
    	
    	Assert.assertEquals(expectedEle, actualEle);
    		
    		
    	
    }
	
}
