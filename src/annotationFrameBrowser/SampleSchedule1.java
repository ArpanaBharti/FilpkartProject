package annotationFrameBrowser;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleSchedule1 {


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
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("User created");
	}
	@Test(priority=2)
	public void modifyUser()
	{
		System.out.println("User modified");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("User deleted");
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
