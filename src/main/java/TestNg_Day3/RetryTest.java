package TestNg_Day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testRetryExample() {
        System.out.println("Running testRetryExample...");
        Assert.fail("Failing test to check retry logic");
    }
}

