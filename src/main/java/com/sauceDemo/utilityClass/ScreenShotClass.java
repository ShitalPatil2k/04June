package com.sauceDemo.utilityClass;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass {
	 WebDriver driver;
	public static void screenshot(WebDriver driver) throws IOException
	{
	  Date d= new Date();
	  DateFormat d1= new SimpleDateFormat("MM_dd_yy && HH_mm_ss");
	  String Date= d1.format(d);
	  
	  TakesScreenshot ts =(TakesScreenshot)driver;
	  File Source=ts.getScreenshotAs(OutputType.FILE);
	  File Myfile =new File("./ScreenShots\\"+Date+".jpg");
	  FileHandler.copy(Source, Myfile);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
