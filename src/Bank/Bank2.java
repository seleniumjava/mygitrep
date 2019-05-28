package Bank;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bank2 extends Report{
	@BeforeSuite
	public void OpenSel(){
		System.out.println("BeforeSuite%%%%%%%%%%%%");
	}
	
	@AfterSuite
	public void CloseSel(){
		System.out.println("AfterSuite%%%%%%%%%%%%%%");
	}
	
	@BeforeMethod
	public void xyz(){
		System.out.println("Beforetest method in Bank2");
		//throw new SkipException("Skipping the test ");
	}
	static boolean b=true;
	static int indexSI=1;
	@Test
	public void ApplyHL() throws IOException{
		if(b) {
			System.out.println("Apply for Home Loan");
			updateResult(indexSI++, "ApplyHL", "Pass", "Bank2");
			}else {
				updateResult(indexSI++, "ApplyHL", "Fail", "Bank2");
			}
		
	}
	
	@Test
	public void ApplyPL() throws IOException{
		if(b) {
			System.out.println("Apply for Personal Loan");
			updateResult(indexSI++, "ApplyPL", "Pass", "Bank2");
			}else {
				updateResult(indexSI++, "ApplyPL", "Fail", "Bank2");
			}
		
	}

}
