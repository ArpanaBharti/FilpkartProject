package com.vtiger.genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {

	      public void waitForElement(WebElement element)
	          {
	            WebDriverWait wait =new WebDriverWait(BaseClass.driver,20);
		        wait.until(ExpectedConditions.visibilityOf(element));
	          }
	      
	      public void alertAccept()
	          {
	           	 BaseClass.driver.switchTo().alert().accept();
	          }
	
	      public String getAlertMsg()
	          {
	              return BaseClass.driver.switchTo().alert().getText();
	          }
	
	      public void switchToFrame(WebElement element)
	          {
	     	      BaseClass.driver.switchTo().frame(element);
	          }
	
	      public void switchToDefaultPage()
	          {
	              BaseClass.driver.switchTo().defaultContent();
	          }
	
	      public void moveMousePointer(WebElement element)
	          {
	             Actions act=new Actions(BaseClass.driver);
		         act.moveToElement(element).perform();
	          }
	
	      public void selectItemFromList(WebElement Listbox,String itemName)
	          {
		         Select s=new Select(Listbox);
		         s.selectByVisibleText(itemName);
	          }
	 }
