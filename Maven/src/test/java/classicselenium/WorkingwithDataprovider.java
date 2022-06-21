package classicselenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingwithDataprovider {

     @Test(dataProvider="TestData")
		public static void data(String fc,String sc){
    	 System.out.println(fc);
    	 System.out.println(sc);
     }
@DataProvider(name="TestData")
	public static Object[][] data(){
	Object[][] obj=new Object[2][2];
	obj[0][0]="hello";
	obj[0][1]="123";
	obj[1][0]="hi";
	obj[1][1]="1234";
	return obj;

}
}