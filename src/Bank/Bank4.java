package Bank;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank4 {
	
	@Test
	public void ITReturn(){
		System.out.println("Upload form 16");
	}

	@Test
	public void PayTax(){
		System.out.println("Pay tax online");
	
	Assert.assertEquals("AAA", "AAA");
	try{
	Assert.assertTrue(8>30, "Error Message");
	}catch(Throwable t){
		System.out.println("Error msg: "+t);
	}
	Assert.assertFalse(3>6, "Error----");
	
	}
	
	
	
	
	
}
