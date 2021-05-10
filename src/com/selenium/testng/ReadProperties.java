package com.selenium.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperties
{
	
	
	@Test
	public void tc001() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:/Users/Lenovo/Documents/Swetha/Eclipse Projects/WallMart/src/com/selenium/properties/config.properties");
		Properties prop = new Properties();
		prop.load(fis);


		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
		
		
		
		
		FileInputStream fis1 = new FileInputStream("C:/Users/Lenovo/Documents/Swetha/Eclipse Projects/WallMart/src/com/selenium/properties/OR.properties");
		Properties OR = new Properties();
	
		OR.load(fis1);
		
		System.out.println(OR.getProperty("username_xpath"));
		System.out.println(OR.getProperty("password_xpath"));
	
	
	}

}
