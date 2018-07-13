package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.NICORForHospitalClinicalandAuditTeams;
import com.nicor.pages.NicorHome;

public class TC_01_002 extends BaseTest
{
	String ForHospitalstitle="NICOR | For hospital clinical and audit teams";
	@Test
	public void testHospitalsPage()
	{
		
	String title="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	NICORForHospitalClinicalandAuditTeams hcat=new NICORForHospitalClinicalandAuditTeams(driver);
	
	// to verify the title
	home.verifyTheTitle(title);
	
	
	home.clickOnhospitalsLink();
	Reporter.log("clicked hosp",true);
	
	
	hcat.verifyTitle(ForHospitalstitle);
	

	
	
	
	
	}
	

}
