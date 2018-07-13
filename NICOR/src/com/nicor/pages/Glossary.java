package com.nicor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nicor.generic.BasePage;


public class Glossary extends BasePage
{
	
	// Declaration
	@FindBy(xpath=".//h3[.='A']")
	private WebElement A;
	
	@FindBy(id="ace-i")
	private WebElement ACEI;
	
	@FindBy(id="acs")
	private WebElement ACS;
	
	@FindBy(id="af")
	private WebElement AF;
	
	@FindBy(id="angiogram")
	private WebElement ANGIOGRAM;
	
	@FindBy(id="angiography")
	private WebElement ANGIOGRAPHY;
	
	@FindBy(id="aortic-stenosis")
	private WebElement AORTICSTENOSIS;
	
	@FindBy(id="arb")
	private WebElement ARB;
	
	@FindBy(id="atherosclerosis")
	private WebElement ATHEROSCLEROSIS;
	
	@FindBy(id="atrial-fibrillation")
	private WebElement ATRIALFIBRILLATION;

	@FindBy(xpath=".//h3[.='B']")
	private WebElement B;
	
	@FindBy(id="bb")
	private WebElement BB;

	@FindBy(id="bcca")
	private WebElement BCCA;

	@FindBy(id="bcis")
	private WebElement BCIS;

	@FindBy(id="bcs")
	private WebElement BCS;

	@FindBy(id="bhrs")
	private WebElement BHRS;

	@FindBy(id="bms")
	private WebElement BMS;

	@FindBy(id="bsh")
	private WebElement BSH;

	
	@FindBy(xpath=".//h3[.='C']")
	private WebElement C;
	
	@FindBy(xpath=".//h3[.='D']")
	private WebElement D;
	
	@FindBy(xpath=".//h3[.='E']")
	private WebElement E;
	
	@FindBy(xpath=".//h3[.='H']")
	private WebElement H;
	
	@FindBy(xpath=".//h3[.='I']")
	private WebElement I;
	
	@FindBy(xpath=".//h3[.='L']")
	private WebElement L;
	
	@FindBy(xpath=".//h3[.='M']")
	private WebElement M;
	
	@FindBy(xpath=".//h3[.='N']")
	private WebElement N;
	
	@FindBy(xpath=".//h3[.='P']")
	private WebElement P;
	
	@FindBy(xpath=".//h3[.='R']")
	private WebElement R;
	
	@FindBy(xpath=".//h3[.='S']")
	private WebElement S;
	
	@FindBy(xpath=".//h3[.='T']")
	private WebElement T;
	
	@FindBy(xpath=".//h3[.='U']")
	private WebElement U;
	
	
	
	
	
	
	// Initialization
		public Glossary(WebDriver driver) 
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		
		
	
	// utilization
	
	 
	

}
