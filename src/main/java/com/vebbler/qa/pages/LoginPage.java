package com.vebbler.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vebbler.qa.base.TestBase;

public class LoginPage extends TestBase 
{
	By login=By.linkText("Login / Register");
	By emailLogin=By.xpath("//a)[contains(text(),'Email Login']");
	
	By username=By.id("login-email");
	By password=By.id("login-password");
	By loginButton=By.id("login-submit");
	
	
	
	public WebElement loginbutton() {
		return driver.findElement(login);
	}
	
	public WebElement getEmaillogin() {
		return driver.findElement(emailLogin);
	}
	
	public void getLogin(By username,String pwd) {
              username.s		
		
	}
	
	 
}

