package com.selenium.testngbasics;

import org.testng.annotations.Test;

public class Login 
{
	
	
	@Test(enabled=false)
	public void tc001()
	{
		System.out.println("TC001 is executed");
	}

	
	
	@Test(priority=1,groups="regression")
	public void tc002()
	{
		System.out.println("TC002 is executed");
	}

	
	
	@Test(priority=0,enabled=true)
	public void tc003()
	{
		System.out.println("TC003 is executed");
	}

}
