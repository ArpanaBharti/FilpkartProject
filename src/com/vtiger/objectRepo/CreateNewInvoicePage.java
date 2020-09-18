package com.vtiger.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewInvoicePage
 {
	 @FindBy(name="subject")
     private WebElement invoiceNameTb;
	 
	 @FindBy(xpath='(//img[@title='Select'])[3]')
	 private WebElement organizationNameTLink;	
 }
