package Bank;

import org.testng.annotations.DataProvider;

public class data_provider {

	@DataProvider(name="uidpwd")
	public static Object[][] p1(){
		Object[][] data=new Object[2][2];//2 rows and 2 columns
		data[0][0]="u1";
		data[0][1]="p1";
		//data[0][2]="data13";
		
		data[1][0]="u2";
		data[1][1]="p2";
		//data[1][2]="data23";
		
		return data;
	}
	
	
}
