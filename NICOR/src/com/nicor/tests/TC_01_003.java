package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.NICORForHospitalClinicalandAuditTeams;
import com.nicor.pages.NICORForResearchers;
import com.nicor.pages.NicorHome;

public class TC_01_003 extends BaseTest
{
	String ForResearcherstitle="NICOR | For researchers";
	@Test
	public void testresearchersPage()
	{
		
	String title="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	NICORForResearchers nfr=new NICORForResearchers(driver);
	
	// to verify the title
	home.verifyTheTitle(title);
	
	
	home.clickOnresearchersLink();
	Reporter.log("clicked researchers",true);
	
	
	nfr.verifyTitle(ForResearcherstitle);
	
	
	
	
	}
	

}
