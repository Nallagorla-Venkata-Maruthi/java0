package TestNg_Day4;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ihookableListerner implements IHookable {
	
	@Test
	public void test() {
		System.out.println("Inside The Test Method");
	}
	@Test
	public void test1() {
		System.out.println("Inside The Test secound Method");
	}
	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {
		System.out.println("Before Starting The Test Method: "+testResult.getMethod().getMethodName());
		callBack.runTestMethod(testResult);
		System.out.println("After executing: " + testResult.getMethod().getMethodName());	
	}

}
