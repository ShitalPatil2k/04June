package com.sauceDemo.POMClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOM {
//	1.
	private WebDriver driver;
	private Select s;
//	2.
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menubutton;
	
	public void clickMenu()
	{
		menubutton.click();
	}
//	2.
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement Logout;
//	3.
	public void clicklogout()
	{
		Logout.click();
	}
//	2.
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cart;
//	3.
	public void clickCart()
	{
		cart.click();
	}
	
	public String getText()
	{
		return cart.getText();
		
	}
//	2.
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	 private WebElement bagpack;
//	3.
	public void clickBagpack()
	{
		bagpack.click();
	}
//	2.
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	 private WebElement BikeLight;
	
//  3.
	public void clickBikeLight() 
	{
		BikeLight.click();
	}
//	2.
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	WebElement Tshirt;
//	3.
	public void clickTShirt() 
	{
		Tshirt.click();
	}
//	2.
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	WebElement Onesie;
//	3.
	public void clickOnesie() 
	{
		Onesie.click();
	}
//	2.
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	WebElement RedTShirt;
//	3.
	public void clickRedTShirt() 
	{
		RedTShirt.click();
	}
//	2.
	@FindBy(xpath="//select[@class='product_sort_container']")
	 private WebElement Filter;
//	3.
	public void clickFilter(int a) 
	 {
		Filter.click();
	    s =new Select(Filter);
		s.selectByIndex(a);
	 }
	public String GetText()
	{
	    String z =s.getFirstSelectedOption().getText();
	    return z;
	}
	
//	2.
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> allProduct;
	
//	3.
	public void clickAllProducts()
	{
		for(WebElement i:allProduct)
		{
			i.click();
		}
	}
	
//	@FindBy(xpath="//option[text()='Name (A to Z)']")
//	private WebElement DropDownEle;
//	
//	public void clickDropDown()
//	{
//		DropDownEle.click();
//	}
//	public String GetText()
//	{
//		return DropDownEle.getText();
//	}
	
	
	
//   
	public HomePagePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

}
