package TestNg_Day4;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(VisulaizerListener.class)
public class Visualizer {

	@Test
	public void Method1() {
		System.out.println("Running Method 1");
	}
    @Test(dependsOnMethods="Method1")
    public void Method2() {
    	System.out.println("Running Method 2");
    }
 
}