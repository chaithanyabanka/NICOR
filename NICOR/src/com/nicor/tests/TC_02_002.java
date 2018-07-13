package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;

import com.nicor.pages.Glossary;

import com.nicor.pages.NicorHome;

public class TC_02_002 extends BaseTest
{
	String ForGlossarytitle="NICOR | Glossary";
	@Test
	public void testGlossaryPage()
	{
		
	String title="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	Glossary glo=new Glossary(driver);
	
	// to verify the title
	home.verifyTheTitle(title);
	
	
	
	
	home.clickOnAboutNicor();
	Reporter.log("clicked abt NICOR",true);
	
	home.clickOnGlossarylink();
	
	glo.verifyTitle(ForGlossarytitle);
	
	
	
	
	
	}

}
