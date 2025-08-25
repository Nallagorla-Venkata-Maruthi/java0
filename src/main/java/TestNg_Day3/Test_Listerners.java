package TestNg_Day3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test_Listerners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTest Started");	
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");	
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");	
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");	
	}
	@Override
    public void onFinish(ITestContext context) {
        System.out.println("Suite Finished: " + context.getName());
    }

}
