package TestNg_Day4;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(isuitelisterner.class)
public class suiteListerners {
	
	@Test()
	public void test1() {
		System.out.println("Running Test-1............");
	}
	@Test()
	public void test2() {
		System.out.println("Running Test-2.........");
	}
}
