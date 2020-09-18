package com.vtiger.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImplementation implements ITestListener 
{
       @Override
	   public void onFinish(ITestContext arg0) 	{}

	   @Override
	   public void onStart(ITestContext arg0) {}

	   @Override
	   public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {}

	   @Override
	   public void onTestFailure(ITestResult res) 
	       {
	         String name=res.getName();
		     System.out.println("Test Case Failed");
		     EventFiringWebDriver efw=new EventFiringWebDriver(BaseClass.driver);
		
		     File srcFile=efw.getScreenshotAs(OutputType.FILE);
		     File destFile=new File("./Screenshot/"+name+".png");
	         try
		        {
		        	FileUtils.copyFile(srcFile, destFile);
	        	}
		     catch(IOException e)
		        {
		            e.printStackTrace();
		        }
	        }

	    @Override
	    public void onTestSkipped(ITestResult arg0) {}

	    @Override
	    public void onTestStart(ITestResult arg0) {}

	    @Override
	    public void onTestSuccess(ITestResult arg0) {}
  }
