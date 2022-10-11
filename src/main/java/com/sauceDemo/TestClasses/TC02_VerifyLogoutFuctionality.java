package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOM;
import com.sauceDemo.POMClasses.LogInPOM;
import com.sauceDemo.utilityClass.ScreenShotClass;

public class TC02_VerifyLogoutFuctionality extends TestBaseClass
{

	 @Test
      public void verifyLogoutFunctionality() throws IOException
        {
        HomePagePOM hp=new HomePagePOM(driver);
	    hp.clickMenu();
	    log.info("Menu is clicked");
        
        hp.clicklogout();
        log.info("Logout is clicked");
        
        ScreenShotClass.screenshot(driver);
        
        log.info("Apply validation");

		String expectedTitle = "Swag Labs";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
}
