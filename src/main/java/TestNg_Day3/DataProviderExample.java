package TestNg_Day3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@DataProvider(name="test1")
	public Object[][] CreateData(){
		return new Object[][]{
			{"Maruthi",22},
			{"Vasu",23},
			{"Sunny",25}
		};
	}
	@Test(dataProvider="test1")
	public void verifydata(String Name,int Age) {
		System.out.println("Name : "+Name+"Age :"+Age);
	}
	
}
