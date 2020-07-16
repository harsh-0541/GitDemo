package com.vebbler.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vebbler.qa.base.TestBase;
import com.vebbler.qa.pages.HomePage;
import com.vebbler.qa.pages.LoginPage;

public class loginTest extends TestBase 
{
	LoginPage loginPage;
	HomePage homePage;
	public loginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initializer();	
		 loginPage=new LoginPage();
	}
	@Test
	public void gitcommand() {
		System.out.println("gitcommand");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
