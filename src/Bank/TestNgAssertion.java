package Bank;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgAssertion {
	SoftAssert sa=new SoftAssert();
	@Test
	public void user_Login() {
		//SoftAssert sa=new SoftAssert();	
		System.out.println("TC1: user_Login starts");
		Reporter.log("Log of TC1: user_Login starts");
		
		//Assert.assertEquals(3, 4);
		sa.assertEquals(3, 4);
		//Assert.assertEquals(33, 24);
		sa.assertEquals(33, 24);
		//Assert.assertEquals(44, 44);
		sa.assertEquals(44, 44);
		Reporter.log("Log of TC1: user_Login ends");
		System.out.println("TC1: user_Login ends");
		sa.assertAll();
	}
	
	@Test
	public void user_Reg() {
		System.out.println("TC2: user_Reg starts");
		Assert.assertTrue(10>4);
		Assert.assertFalse(2>7);
		System.out.println("TC2: user_Reg ends");
	}
	@AfterClass
	public void afterclassMethod() {
	//	sa.assertAll();
	//	config failure error but TC passed
	}

}
