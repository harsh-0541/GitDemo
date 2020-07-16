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
	
	@Test(priority=1)
	public void LoginbarTest() {
		loginPage.validateLogin();
	}
	@Test(priority=2)
	public void EmailLoginTest() {
		loginPage.ValidateEmailLogin();
	}
	@Test(priority=3)
	public void Titletest() {
	String title=loginPage.validateTitle();
	Assert.assertEquals(title, "Login to Vebbler Studio");
	}
	@Test(priority=4)
	public void vebblerLogoTest() {
	boolean flag=loginPage.validateVebblerLogo();
	Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void loginPageTest() {
		homePage=loginPage.Validateloginpage(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
