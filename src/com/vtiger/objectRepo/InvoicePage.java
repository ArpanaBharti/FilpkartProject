package com.vtiger.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoicePage
     {
	      @FindBy(css="img[title='Create Invoice...']")
          private WebElement createInvoice;
	
	      public WebElement getCreateInvoice()
	         {
		        return createInvoice;
	         }
	      
	      public void navigateCreateNewInvoicePage()
	      {
	    	  createInvoice.click();
	      }
	 }
