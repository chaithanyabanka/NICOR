package com.nicor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nicor.generic.BasePage;

public class NicorHome extends BasePage
{
	//Declaration
	@FindBy(xpath="//span[contains(text(),'Hospitals')]")
	private WebElement hospitalsLink;
	
	@FindBy(xpath="//span[contains(text(),'Researchers')]")
	private WebElement researchersLink;

	@FindBy(xpath="//span[contains(text(),'Charities & Public')]")
	private WebElement charitiesAndPublicLink;

	@FindBy(xpath="//span[contains(text(),'Organisations')]")
	private WebElement OrganisationsLink;

	@FindBy(xpath="//span[contains(text(),'Commissioners')]")
	private WebElement commissionersLink;

	@FindBy(xpath="//span[contains(text(),'Audit Programme')]")
	private WebElement auditProgrammelink;


	
	
	// Initialization
	
	public NicorHome(WebDriver driver)
	
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	// Utilization
	public void verifyTheTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	
	public void verifyTheElement(WebElement element)
	{
		verifyElement(element);
	}
	
	
	
	public void clickOnhospitalsLink()
	{
		hospitalsLink.click();
		
	}
	
	public void clickOnresearchersLink()
	{
		researchersLink.click();
	}
	
	public void clickOncharitiesAndPublicLink()
	{
		charitiesAndPublicLink.click();
	}
	
	public void clickOnOrganisationsLink()
	{
		OrganisationsLink.click();
	}
	
	public void clickOncommissionersLink()
	{
		commissionersLink.click();
	}
	
	public void clickOnauditProgrammelink()
	{
		auditProgrammelink.click();
	}

}
