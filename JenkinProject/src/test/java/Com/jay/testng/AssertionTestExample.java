package Com.jay.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTestExample {
	
	@Test
	public void test() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test1() {
		Assert.assertTrue(false);
		
	}

}
