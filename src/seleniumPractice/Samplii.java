//example of SoftAssert class

package seleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Samplii {
	@Test
	public void checkAssertion()
	{
		String act="Hello";
		String exp="Hello35";
		
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(exp.contains(act));
		System.out.println("Good Morning!!!");
		sa.assertAll();
		
	}

}
