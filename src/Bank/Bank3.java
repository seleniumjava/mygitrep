package Bank;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Bank3 {
	
	@Test(dataProvider="product")
	public void product(String s1, String s2, String s3){
		System.out.println(s1+"------"+s2+"------"+s3);
	}
	
	@Test(dataProviderClass=data_provider.class,dataProvider="uidpwd")
	public void login(String u, String p){
		System.out.println(u+"------"+p+"------");
	}
	
	
	@DataProvider
	public Object[][] product(){
		Object[][] data=new Object[2][3];//2 rows and 3 columns
		data[0][0]="data11";
		data[0][1]="data12";
		data[0][2]="data13";
		
		data[1][0]="data21";
		data[1][1]="data22";
		data[1][2]="data23";
		
		return data;
	}

}
