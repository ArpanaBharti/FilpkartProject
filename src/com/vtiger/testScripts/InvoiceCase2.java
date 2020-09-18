package com.vtiger.testScripts;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vtiger.genericLib.BaseClass;

public class InvoiceCase2 extends BaseClass{

	@Test
	public void createInvoice() throws IOException
	  {
	     WebElement moredd=driver.findElement(By.linkText("More"));
	
	     Actions act=new Actions(driver);
       	act.moveToElement(moredd).perform();
	    driver.findElement(By.linkText("Invoice")).click();
	    String InvoicePage = driver.getTitle();
	    String exp="Administrator - Invoice - vtiger CRM 5 - Commercial Open Source CRM";//use CR  for failed result
	   
	    SoftAssert sa=new SoftAssert();
	    sa.assertEquals(InvoicePage, exp);
	    System.out.println("Invoice page validation done");
	    
        driver.findElement(By.xpath("//img[@title='Create Invoice...']")).click();
		
		driver.findElement(By.name("subject")).sendKeys(data.fetchDataFromExcel("MyData",4,0));
		
		driver.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[3]")).click();
		
	    //1st window popup
			
	    String mainId=driver.getWindowHandle();
		  
		 Set<String> allId = driver.getWindowHandles();
		   for(String s:allId)
		   {
			   if(!mainId.equals(s))
			   {
				driver.switchTo().window(s);
				
			   }
		   }
		   driver.findElement(By.linkText("vtiger")).click();
			
			driver.switchTo().alert().accept();
			driver.switchTo().window(mainId);
	
			//2nd window for item type
			driver.findElement(By.xpath("//img[@title='Products']")).click();
		   
			//2nd window popup
		  String mainId1=driver.getWindowHandle();
			  
			 Set<String> allId1 = driver.getWindowHandles();
			   for(String s1:allId1)
			   {
				   if(!mainId1.equals(s1))
				   {
					driver.switchTo().window(s1);
					
				   }
			   }
			   driver.findElement(By.linkText("Vtiger 25 Users Pack")).click();
				
				
				 driver.switchTo().window(mainId1);
		
	      driver.findElement(By.xpath("//input[@id='qty1']")).sendKeys(data.fetchDataFromExcel("MyData", 5,0));
	     
		  driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		  
		  String actText = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		  boolean flag=actText.contains("RedMiMobile");
		  Assert.assertTrue(flag);
		  System.out.println("Invoice created successfully!!");
		  sa.assertAll();
		  
		  
		
		  
	}
	
}
