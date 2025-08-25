package TestNg_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Demo_Xm {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openSite() {
        driver.get("https://www.ixigo.com/");
    }

    @Test(priority = 1)
    public void sampleTest() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.tagName("body"));
        System.out.println("Page loaded: " + (element != null));
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
