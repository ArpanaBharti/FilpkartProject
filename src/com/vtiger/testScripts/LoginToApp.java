package com.vtiger.testScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.genericLib.FileData;

public class LoginToApp extends BaseClass 
   {
        @Test
		public void checkLogin() throws IOException
		   {
		    	String actTitle=driver.getTitle();
			    System.out.println("Actual title is:"+actTitle);
			    String expTitle=data.fetchDataFromExcel("LoginPageData",1,2);
			
			    Assert.assertTrue(actTitle.contains(expTitle));
			    System.out.println("Validation Pass");
		   }
   }
