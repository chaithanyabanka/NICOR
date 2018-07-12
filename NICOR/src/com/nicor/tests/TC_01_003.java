package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
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
	
	// to click on for researchers link
	home.clickOnresearchersLink();
	Reporter.log("clicked researchers",true);
	
	// to verify the title of for researchers page
	nfr.verifyTitle(ForResearcherstitle);
	
	
	
	
	}
	

}
