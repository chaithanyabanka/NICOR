package com.nicor.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.TestResult;

public abstract class BaseTest implements AutoConstant 
{	
	public WebDriver driver;
	@BeforeMethod
	public void precondition()
	{
		System.setProperty(chrome_key, chrome_value);
		System.setProperty(gecko_key, gecko_value);
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nicor.org.uk/");
	}
	
	@AfterMethod
	public void postCondition(TestResult res)
	{
		int status=res.getStatus();
		if(status==2)
		{
			String name=res.getMethod().getMethodName();
			GenericUtils.getScreenShot(driver,name);
			
		}
		driver.close();
		
	}

}
