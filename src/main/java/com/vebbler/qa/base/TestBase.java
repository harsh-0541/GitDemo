package com.vebbler.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vebbler.qa.util.TestUtil;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;

	public TestBase(){
		 try {
				prop=new Properties();
				 FileInputStream fis=new FileInputStream(System.getProperty("C:/Users/vebbler-11/eclipse-workspace/VebblerStudioAutomation/src/main/java/com/vebbler/qa/config/config.properties"));
				 prop.load(fis);
			 }
			 catch(FileNotFoundException e)
			 {
				 e.printStackTrace();
				 
			 }
			 catch(IOException e)
			 {
				 e.printStackTrace();
			 }
	}
	
	public static void initializer() {
	String browser=	prop.getProperty("browser");
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vebbler-11\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver-v0.26.0-win64\\geckodriver.exe");
            driver=new FirefoxDriver();
			}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait_timeout, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

		
	}
}
