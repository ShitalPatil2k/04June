package com.sauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOM;


public class TC03_VerifyAddToCartFuctionality extends TestBaseClass
{
	@Test
      public void verifyAddToCart() 
      {  
        HomePagePOM hp=new HomePagePOM(driver);
        hp.clickRedTShirt();
        log.info("red tshirt added");
        
        hp.clickOnesie();
        log.info("Oncie is Added");
        
        String expectedCartValue = "2";
		
		String actualCartValue = hp.getText();
		
        Assert.assertEquals(expectedCartValue, actualCartValue);
    
        
        
		
	}

}
