package TestNg_Day3;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Test_Listerners.class)
public class Listerner {
	
	@Test
    public void TestMethod1() {
        System.out.println("I am iside method 1");
    }
	@Test
    public void testmethod2() {
        System.out.println("I am iside method 2");
        Assert.assertTrue(false);
    }
	
	@Test(timeOut=1000)
    public void testmethod3() throws InterruptedException {
		Thread.sleep(2000);
        System.out.println("I am iside method 3");
    }
	@Test(dependsOnMethods="testmethod3")
    public void testmethod4() {
        System.out.println("I am iside method 4");
    }
	
}
