package seleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test //Test annotation which works as a main() method for execution in TestNG
	public void checkAssertion()
	{
		String act="Hello";
		String exp="Helloo";
		//Here we are applying Hard Assert because  Assert class we are using for strict comparison
		Assert.assertEquals(act,exp);
		System.out.println("Validation Pass!!!");
	}

}
