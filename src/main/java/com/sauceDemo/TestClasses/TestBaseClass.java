package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMClasses.LogInPOM;

public class TestBaseClass {
     WebDriver driver;
     Logger log =Logger.getLogger("SauceDemoMaven04June");
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
       
		System.setProperty("webdriver.chrome.driver","./DriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","./DriverFiles\\geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
        PropertyConfigurator.configure("log4j.properties");
        log.info("Browser is Opened");
        log.info("Browser is Opened"); 
		
		
		driver.get("https://www.saucedemo.com/");
		log.info("URL is Opened");
		
		driver.manage().window().maximize();
		log.info("Browser is maximized");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		LogInPOM ln=new LogInPOM(driver);
		ln.sendUsername();
		log.info("username entered");
		
	    ln.sendPassword();
	    log.info("Password entered");
		
        ln.clickLogin();
        log.info("Login is clicked");
	
//		ln.screenshot(driver);
        
	}
	
	@AfterMethod
	public void tearDown()
	{
        driver.close();
        log.info("Browser is closed");
        log.info("End of Program");
	}

}
