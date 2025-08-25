package TestNg_Day4;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class MyInvokedMethodListener implements IInvokedMethodListener  {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		
		System.out.println("Before Invocation : "+method.getTestMethod().getMethodName());
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("After Invocation : "+method.getTestMethod().getMethodName());
	}
}
