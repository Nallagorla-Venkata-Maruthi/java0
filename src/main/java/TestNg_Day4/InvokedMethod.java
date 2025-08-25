package TestNg_Day4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyInvokedMethodListener.class)
public class InvokedMethod {
	
	@BeforeMethod
    public void setup() {
		System.out.println("Inside the test Method");
	}

    @Test
    public void testMethod1() {
    	System.out.println("Test one is Running........");
    }

    @Test
    public void testMethod2() {
    	System.out.println("Test Two is Running........");
    	
    }
    @AfterMethod
    public void setdown() {
    	System.out.println("OutSide the test Method");
    	
    }

}
