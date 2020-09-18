package annotationFrameBrowser;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleSchedule {

	
		
		@BeforeSuite
		public void configBS()
		{
			System.out.println("DB connected");
		}
		@BeforeClass
		public void configBC()
		{
			System.out.println("Launch Browser");
		}
		@BeforeMethod
		public void configBM()
		{
			System.out.println("Login Done");	
		}
		@Test
		public void createUser()
		{
			System.out.println("User created");
		}
		@AfterMethod
		public void configAM()
		{
			System.out.println("Logout Done");
		}
		@AfterClass
		public void configAC()
		{
			System.out.println("Close Browser");
		}
		@AfterSuite
		public void configAS()
		{
			System.out.println("DB Disconnect");
		}
	}


