package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPOM {
	
// 2.
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement ConShop;
// 3.	
	public void clickContinueShop()
	{
		ConShop.click();
	}
	
//	2. 
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement CheckOut;

	//button[@id='continue-shopping']
	//button[@id='checkout']
}
