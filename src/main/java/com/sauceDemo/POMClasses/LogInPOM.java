package com.sauceDemo.POMClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPOM {
//	1.
	WebDriver driver;
//	2.
	@FindBy(xpath="//input[@id='user-name']")
	WebElement Username;
	
//	3.
	public void sendUsername()
	{
		Username.sendKeys("standard_user");
	}
	
//	2.
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
//	3.
	public void sendPassword()
	{
		Password.sendKeys("secret_sauce");
	}
//	2.
	@FindBy(xpath="//input[@id='login-button']")
	WebElement LoginButton;
//	3.
	public void clickLogin()
	{
		LoginButton.click();
	}
	
	
    public LogInPOM(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);	
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
