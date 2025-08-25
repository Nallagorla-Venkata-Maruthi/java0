package TestNg_Day4;

import org.testng.IConfigurable;
import org.testng.IConfigureCallBack;
import org.testng.ITestResult;

public class iconfigurableListners implements IConfigurable{

	@Override
	public void run(IConfigureCallBack callBack, ITestResult testResult) {
		System.out.println("Before test : "+testResult.getMethod().getMethodName());{
		if (testResult.getMethod().getMethodName().equals("Before Method")){
			System.out.println("Skipping Configuration"+testResult.getMethod().getMethodName());
			testResult.setStatus(ITestResult.SKIP);
		}
		callBack.runConfigurationMethod(testResult);
		System.out.println("After Executing Confuguration"+testResult.getMethod().getMethodName());
			
		}
		
		
		
	}
	

}
