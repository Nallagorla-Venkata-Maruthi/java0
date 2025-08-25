package TestNg_Day2;

import org.testng.annotations.Test;

public class AmazonTest {

    @Test(groups= {"smoke"})
    public void testLogin() {
        System.out.println("Smoke: Login Test");
    }

    @Test(groups= {"Regression"})
    public void testAddToCart() {
        System.out.println("Regression: Add to Cart Test");
    }

    @Test(groups= {"sanity","Regression"})
    public void testCheckout() {
        System.out.println("Sanity/Regression: Checkout Test");
    }
}
