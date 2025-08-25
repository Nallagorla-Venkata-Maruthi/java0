package TestNg_Day3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int retryCount = 0;                   // to keep track of how many times retried
    private static final int maxRetryCount = 2;   // retry failed test 2 times
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;   
        }
        return false;   
    }
}

