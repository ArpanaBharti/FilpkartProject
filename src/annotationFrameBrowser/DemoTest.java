package annotationFrameBrowser;
 
import org.testng.annotations.Test;
public class DemoTest {
     
	@Test(invocationCount=4)
	public void createUser()
	{
		System.out.println("User created...");
	}
	@Test
	public void modifyUser()
	{
		System.out.println("user modified");
	}
	@Test(enabled=false)
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
}
