package com.sauceDemo.TestClasses;




import org.testng.Assert;

import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOM;

public class TC04_VerifyAllProductsFuctionality extends TestBaseClass
{
	
	@Test
	public void verifyAllProducts()
	{
		HomePagePOM hp=new HomePagePOM(driver);
		hp.clickAllProducts();
		hp.clickCart();
		log.info("Applay Validation");
	    String expectedProduct ="6";
	   
		String actualProduct =hp.getText();
		
		log.info(actualProduct);
		 
		Assert.assertEquals(expectedProduct, actualProduct);
	}
	
	
	
	
	

}
