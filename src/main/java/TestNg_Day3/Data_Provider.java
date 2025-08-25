package TestNg_Day3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
    // Data Provider method
    @DataProvider(name = "data")
    public Object[][] getData() {
        return new Object[][] {
            {"value1"},
            {"value2"},
            {"value3"}
        };
    }
    @Test(dataProvider = "data", retryAnalyzer = RetryAnalyzer.class)
    public void testWithDataProvider(String value) {
        System.out.println("Running test with value: " + value);

        // Forcefully failing test to check retry logic
        Assert.fail(value.contains("2") + value);
    }
}
