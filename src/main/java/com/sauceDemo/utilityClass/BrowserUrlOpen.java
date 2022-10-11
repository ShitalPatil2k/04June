package com.sauceDemo.utilityClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUrlOpen {
	WebDriver driver;
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		System.out.println("Browser is Opened");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is Opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
