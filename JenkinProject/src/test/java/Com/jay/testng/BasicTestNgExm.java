package Com.jay.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BasicTestNgExm {
	
	 @BeforeSuite
		public void test1() {
		 System.out.println("Before Suit");
			
		}
		@BeforeTest
	public void test2() {
			System.out.println("Before Test");
		}
		@BeforeClass
		public void test3() {
			System.out.println("Before class");
		}
		@BeforeMethod
		public void test4() {
			System.out.println("Before method");
		}
		@Test
		public void test5() {
			System.out.println("in test class");
		}
		@AfterMethod
		public void test6() {
			System.out.println("After method");
		}
}
