package Bank;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bank1 extends Report{
	static boolean b=true;
	static int indexSI = 1;
	@Test(priority=1, groups={"Reg"})
	public void MoneyTransfer() throws IOException{
		if(b) {
		System.out.println("Transfer money online");
		updateResult(indexSI++, "MoneyTransfer", "Pass", "Bank1");
		}else {
			updateResult(indexSI++, "MoneyTransfer", "Fail", "Bank1");
		}
		//WebDriver driver=new FirefoxDriver();
		//driver.get("http://demo.borland.com/gmopost/");	
	}

	@Test(priority=4, groups={"Reg"})
	public void StdGen() throws IOException{
		if(b) {
			System.out.println("Generate statement");
			updateResult(indexSI++, "StdGen", "Pass", "Bank1");
			}else {
				updateResult(indexSI++, "StdGen", "Fail", "Bank1");
			}
		
	}
	
	@Test(priority=2,groups={"Acceptance"} )//enabled=false
	public void BillPayment() throws IOException{
		b=false;
		if(b) {
			System.out.println("Pay the bill Online");
			updateResult(indexSI++, "BillPayment", "Pass", "Bank1");
			//Assert.assertEquals(4, 5);
			}else {
				updateResult(indexSI++, "BillPayment", "Fail", "Bank1");
			}
		
	}
	
	@Test(priority=3, groups={"Reg", "Acceptance"}, dependsOnMethods={"BillPayment"})
	public void ApplyCC() throws IOException{
		b=true;
		if(b) {
			System.out.println("Apply for a CC");
			updateResult(indexSI++, "ApplyCC", "Pass", "Bank1");
			
			}else {
				updateResult(indexSI++, "ApplyCC", "Fail", "Bank1");
			}
		
	}
	
	@BeforeMethod
	public void Login(){
		System.out.println("BeforeMethod-----------------------");
	}
	
	@AfterMethod
	public void Logout(){
		System.out.println("AfterMethod..............");
	}
	
	@BeforeClass
	public void openBrowser(){
		System.out.println("BeforeClass============");
		
	}
	
	@AfterClass
	public void CloseBrowser(){
		System.out.println("AfterClass============");
	}
	
	@BeforeTest
	public void connectDB(){
		System.out.println("BeforeTest***************");
	
	}
	
	@AfterTest
	public void DisconnectDB(){
		System.out.println("AfterTest****************");
		
	}
	
	@BeforeSuite
	public void OpenSel(){
		System.out.println("BeforeSuite###########################");
	}
	
	@AfterSuite
	public void CloseSel(){
		System.out.println("AfterSuite#######################");
	}
	
	
	
	
}
