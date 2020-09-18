package com.vtiger.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
  {

	      @FindBy(name="user_name")
	      private WebElement un;
	
	      @FindBy(name="user_password")
	      private WebElement pwd;
	
	      @FindBy(id="submitButton")
	      private WebElement loginBtn;
	
	      @FindBy(xpath="//div[contains(text(),'vaild username and password')]")
	      private WebElement errorMsg;
	
	      @FindBy(linkText="Calendar")
	      private WebElement calenderPage1;
	
	      @FindBy(linkText="Leads")
	      private WebElement leadsPage;
	
	      @FindBy(linkText="Organizations")
	      private WebElement organizationsPage;
	
	      @FindBy(linkText="Contacts")
	      private WebElement contactsPage;
	
	      @FindBy(linkText="Opportunities")
	      private WebElement opportunitiesPage;
	
	      @FindBy(linkText="Products")
	      private WebElement productsPage;
	
	      public WebElement getUn()
	          {
	            	return un;
	          }
  
	      public WebElement getPwd()
              {
    	            return pwd;
              }
	
	      public WebElement getLoginBtn()
	          {
		           return loginBtn;
	          }
	
	      public WebElement getErrorMsg()
	          {
	            	return errorMsg;
	          }
	
	      public WebElement getCalenderPage1()
	          {
		            return calenderPage1;
	          }
	
	       public WebElement getLeadsPage()
	           {
		            return leadsPage;
	           }
	
	       public WebElement getOrganizationsPage()
	           {
		            return organizationsPage;
	           }
	
	       public WebElement getContactsPage()
	           {
		            return contactsPage;
	           }
	
	       public WebElement getOpportunitiesPage()
	           {
		            return opportunitiesPage;
	           }
	
	       public WebElement getProductsPage()
	           {
		            return productsPage;
	           }
	
	       public void loginToVtiger(String username,String password)
	           {
		            un.sendKeys(username);
		            pwd.sendKeys(password);
		            loginBtn.click();
	           }
	
    }
