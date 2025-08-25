package TestNg_Day4;

import org.testng.IDataProviderListener;
import org.testng.IDataProviderMethod;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;

public class DataProviderListerners implements IDataProviderListener{

	@Override
	public void beforeDataProviderExecution(IDataProviderMethod dataProviderMethod, ITestNGMethod method,ITestContext iTestContext) {
		System.out.println("Before DataProvider Execution: " + dataProviderMethod.getName());
	}

	@Override
	public void afterDataProviderExecution(IDataProviderMethod dataProviderMethod, ITestNGMethod method,ITestContext iTestContext) {
		System.out.println("After DataProvider Execution: " + dataProviderMethod.getName());
	}

	@Override
	public void onDataProviderFailure(ITestNGMethod method, ITestContext ctx, RuntimeException t) {
		System.out.println("DataProvider Failed for method: " + method.getMethodName()+ " due to " + t.getMessage());
	}
	
	

}
