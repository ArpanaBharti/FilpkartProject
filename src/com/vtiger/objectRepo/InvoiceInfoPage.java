package com.vtiger.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoiceInfoPage 
   {
	  @FindBy(xpath="//span[contains(text(),'Invoice Information')]")
      private WebElement successMsg;
     
	  public WebElement getSuccessMsg()
	     {
		    return successMsg;
		 }
   }
