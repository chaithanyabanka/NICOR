package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.NICORForPatientsCarersCharitiesAndThePublic;

import com.nicor.pages.NicorHome;

public class TC_01_004 extends BaseTest
{
	String ForCharitiesAndPublic="NICOR | For patients, carers, charities and the public";
	@Test
	public void testresearchersPage()
	{
		
	String title="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	NICORForPatientsCarersCharitiesAndThePublic nfp=new NICORForPatientsCarersCharitiesAndThePublic(driver);
	
	// to verify the title
	home.verifyTheTitle(title);
	
	
	home.clickOncharitiesAndPublicLink();
	Reporter.log("clicked charities and public link",true);
	
	
	
	// to verify the title of for charities and public
	nfp.verifyTitle(ForCharitiesAndPublic);
	
	
	}
	

}
