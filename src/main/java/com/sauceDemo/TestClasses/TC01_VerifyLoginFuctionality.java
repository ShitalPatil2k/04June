package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.LogInPOM;
import com.sauceDemo.utilityClass.ScreenShotClass;

public class TC01_VerifyLoginFuctionality extends TestBaseClass
{
	
	
	@Test	
    public void VerifyLoginFunctinality() throws IOException {
	    
		ScreenShotClass.screenshot(driver);
		
		log.info("Apply validation");

		String expectedTitle = "Swag Labs";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle,"Failure due to mismatch");
		
	}
	
		
		
		
		
	}


