package TestNg_Day3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RetriableDataProvider {

    private boolean throwException = true;

    @Test(dataProvider = "test-data")
    public void sampleTestMethod(int input) {
        System.out.println("✅ Test executed with Input value = " + input);
    }

    @DataProvider(name = "test-data", retryUsing = RetryDataProvider.class)
    public Object[][] testDataSupplier() {
        if (throwException) {
            throwException = false;
            System.err.println("Simulating a problem in DataProvider...");
            throw new IllegalStateException("Simulated failure in DataProvider");
        }
        return new Object[][]{
                {1}, {2}
        };
    }
}
