package TestNg_Day4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(DataProviderListerners.class)
public class DataProviderTest {
	
	@DataProvider(name="Provider")
	public Object[][] createObject(){
		return new Object[][] {
			{1},{2},{3}
		};
	}
	@Test(dataProvider="Provider")
	public void testnumber(int Num) {
		System.out.println("Test executed with: " + Num);
		
	}
	

}
