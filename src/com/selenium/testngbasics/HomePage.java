package com.selenium.testngbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage 
{
	
	
	@Test
	public void tc0011()
	{
		System.out.println("TC0011 - Login is executed");
		Assert.fail("Intentionally failed the testcase");
	}

	
	@Test(dependsOnMethods="tc0011")
	public void tc0012()
	{
		System.out.println("TC0012 - HomePage is executed");
	}
	
	
	@Test(dependsOnMethods="tc0011",enabled=true,priority=5)
	public void tc0013()
	{
		System.out.println("TC0013 - Logout is executed");
	}
}
