package com.vtiger.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepo.LoginPage;

public class TestCase3 extends BaseClass{
    
	@Test
	public void CaseTest1()
	{
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.getCalenderPage1().click();
		lp.getLeadsPage().click();
		lp.getOrganizationsPage().click();
		lp.getContactsPage().click();
		lp.getOpportunitiesPage().click();
		lp.getProductsPage().click();
	}
}
