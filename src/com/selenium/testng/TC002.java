package com.selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC002 
{
	WebDriver driver;
	
	@BeforeMethod
	public void browserCode()
	{
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 Reporter.log("Chrome browser is opened");
		

	}
	
	@AfterMethod
	public void broswerClose()
	{
		driver.close();
		Reporter.log("browser is closed");
	}

			@Test
			public void tc002()
			{
			//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Swetha\\Eclipse Projects\\WallMart\\Drivers\\chromedriver.exe");
		
			/*	System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			*/	
				String expectedURL = "https://www.facebook.com/";
				driver.get(expectedURL);
				Reporter.log(expectedURL + " is entered");
				
			String actualURL = 	driver.getCurrentUrl();
			Reporter.log(actualURL + " is displayed");

			
		Assert.assertEquals(expectedURL, actualURL);
			
			
			String actualTitle=	driver.getTitle();
			String expectedTitle = "Facebook – log in or sign up";
			
			if(expectedTitle.equals(actualTitle))
			{
				System.out.println(expectedTitle + " is matched with " + actualTitle);
			}else
			{
				System.out.println(expectedTitle + " is not matched with " + actualTitle);
				Assert.fail(expectedTitle + " is not matched with " + actualTitle);
			}
			
			}
			
		/*	@Test
			public void tc003()
			{
			//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Swetha\\Eclipse Projects\\WallMart\\Drivers\\chromedriver.exe");
		
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				String expectedURL = "https://www.facebook.com/";
				driver.get(expectedURL);
				Reporter.log(expectedURL + " is entered");
				
			String actualURL = 	driver.getCurrentUrl();
			Reporter.log(actualURL + " is displayed");

			
		Assert.assertEquals(expectedURL, actualURL);
			
			
			String actualTitle=	driver.getTitle();
			String expectedTitle = "Facebook – log in or sign up";
			
			if(expectedTitle.equals(actualTitle))
			{
				System.out.println(expectedTitle + " is matched with " + actualTitle);
			}else
			{
				System.out.println(expectedTitle + " is not matched with " + actualTitle);
				Assert.fail(expectedTitle + " is not matched with " + actualTitle);
			}
			
			}*/
			
	/*		
			@Test
			public void tc004()
			{
			//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Swetha\\Eclipse Projects\\WallMart\\Drivers\\chromedriver.exe");
		
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				String expectedURL = "https://www.facebook.com/";
				driver.get(expectedURL);
				Reporter.log(expectedURL + " is entered");
				
			String actualURL = 	driver.getCurrentUrl();
			Reporter.log(actualURL + " is displayed");

			
		Assert.assertEquals(expectedURL, actualURL);
			
			
			String actualTitle=	driver.getTitle();
			String expectedTitle = "Facebook – log in or sign up";
			
			if(expectedTitle.equals(actualTitle))
			{
				System.out.println(expectedTitle + " is matched with " + actualTitle);
			}else
			{
				System.out.println(expectedTitle + " is not matched with " + actualTitle);
				Assert.fail(expectedTitle + " is not matched with " + actualTitle);
			}
			
			}
			

			@Test
			public void tc002()
			{
			//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Swetha\\Eclipse Projects\\WallMart\\Drivers\\chromedriver.exe");
		
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				String expectedURL = "https://www.facebook.com/";
				driver.get(expectedURL);
				Reporter.log(expectedURL + " is entered");
				
			String actualURL = 	driver.getCurrentUrl();
			Reporter.log(actualURL + " is displayed");

			
		Assert.assertEquals(expectedURL, actualURL);
			
			
			String actualTitle=	driver.getTitle();
			String expectedTitle = "Facebook – log in or sign up";
			
			if(expectedTitle.equals(actualTitle))
			{
				System.out.println(expectedTitle + " is matched with " + actualTitle);
			}else
			{
				System.out.println(expectedTitle + " is not matched with " + actualTitle);
				Assert.fail(expectedTitle + " is not matched with " + actualTitle);
			}
			
			}
			*/
}
