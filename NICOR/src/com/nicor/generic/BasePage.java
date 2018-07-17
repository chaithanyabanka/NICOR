package com.nicor.generic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	public  WebDriver driver;

	public  BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//to verify the title
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching :"+eTitle,true);
			
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching : Actual title is :"+driver.getTitle(),true);
			Assert.fail();
		}
	}
	
	//to verify the element
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present :",true);
			
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present :",true);
			Assert.fail();
		
		}
	}
	
	// to perform actions class for click on element
	
	public void clickOnElement(WebElement target)
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(target).click();
	}

}
