package com.nicor.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.NicorHome;

public class TC_01_001 extends BaseTest
{	
	//private WebElement hospitalsLink;

	@Test
	public void testHomePage()
	{
		
	String Hometitle="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	// to verify the title
	home.verifyTheTitle(Hometitle);
	
	home.verifyTheElement(null);
	
	
	home.clickOnhospitalsLink();
	Reporter.log("clicked hosp",true);
	
	driver.navigate().back();
	
	home.clickOnresearchersLink();
	Reporter.log("clicked research",true);
	driver.navigate().back();
	
	home.clickOncharitiesAndPublicLink();
	Reporter.log("clicked charities",true);
	driver.navigate().back();
	
	
	home.clickOnOrganisationsLink();
	Reporter.log("clicked organisation",true);
	driver.navigate().back();
	
	home.clickOncommissionersLink();
	Reporter.log("clicked comm",true);
	driver.navigate().back();
	
	home.clickOnauditProgrammelink();
	Reporter.log("clicked audit",true);
	driver.navigate().back();
	
	}
	

}
