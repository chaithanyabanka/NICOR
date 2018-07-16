package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.NicorHome;

public class TC_01_001 extends BaseTest
{	
	//private WebElement hospitalsLink;

	@Test
	public void testHomePage() throws InterruptedException
	{
		
	String Hometitle="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	// to verify the title
	home.verifyTheTitle(Hometitle);
	
	
	// to verify the elements present in home page
	home.verifyTheElement(home.getHospitalsLink());
	Reporter.log("hosp",true);
	
	home.verifyElement(home.getResearchersLink());
	Reporter.log("research",true);
	
	home.verifyTheElement(home.getCharitiesAndPublicLink());
	Reporter.log("charities and public",true);
	
	
	home.verifyTheElement(home.getOrganisationsLink());
	Reporter.log("organisations",true);
	
	home.verifyTheElement(home.getCommissionersLink());
	Reporter.log("commissioners",true);
	
	home.verifyTheElement(home.getAuditProgrammelink());
	Reporter.log("audit programme",true);
	
		
	
	}
	

}
