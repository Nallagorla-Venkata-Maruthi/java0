package TestNg_Day4;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class isuitelisterner implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("ISuite Started: "+ suite.getName());
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("ISuite Ended: " +suite.getName());
	}
}
