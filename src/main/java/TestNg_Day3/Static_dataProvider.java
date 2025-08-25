package TestNg_Day3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Static_dataProvider {
	
	@DataProvider(name="Create1")
	public static Object[][] createData(){
		return new Object[][] {
			new Object[] {23}
		};
	}
	@Test(dataProvider="create1",dataProviderClass = Static_dataProvider.class)
	public void create(int age) {
		System.out.println("Age: "+age);
	}
	
}
