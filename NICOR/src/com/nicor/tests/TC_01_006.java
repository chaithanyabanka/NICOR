package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.NICORForCommissionersOfHealthcareServices;

import com.nicor.pages.NicorHome;

public class TC_01_006 extends BaseTest 
{
	String ForCommisioners="NICOR | For commissioners of healthcare services";
	@Test
	public void testresearchersPage()
	{
		
	String title="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	NICORForCommissionersOfHealthcareServices nfchs=new NICORForCommissionersOfHealthcareServices(driver);
	
	// to verify the title
	home.verifyTheTitle(title);
	
	
	// to click on commisioners link
	home.clickOncommissionersLink();
	Reporter.log("clicked commisioners",true);
	
	
	
	// to verify the title of commisioners page
	nfchs.verifyTitle(ForCommisioners);
	}
	

}
