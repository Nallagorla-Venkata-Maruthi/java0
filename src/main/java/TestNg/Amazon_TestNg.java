package TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_TestNg {

    WebDriver driver;
    String email;
    String password;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.edgedriver().setup();
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\91938\\eclipse-workspace\\maven\\amazon.properties");
        props.load(fis);
        email = props.getProperty("amazon.email");
        password = props.getProperty("amazon.password");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void loginAmazon() {
        driver.get("https://www.amazon.in");
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email_login")).sendKeys(email);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
        System.out.println("Logged in successfully.");
    }

    @Test(priority = 2)
    public void searchAndAddProducts() throws InterruptedException {
        List<String> products = new ArrayList<>();
        products.add("laptop");
        products.add("headphones");
        products.add("wireless mouse");

        for (String product : products) {
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.clear();
            searchBox.sendKeys(product);
            driver.findElement(By.id("nav-search-submit-button")).click();
            Thread.sleep(2000);

            try {
                driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
                System.out.println("Added " + product + " to cart from search results.");
            } catch (Exception e) {
                System.out.println("Could not add" + product + " to cart from search results.");
            }

            Thread.sleep(2000);
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        System.out.println("Browser closed.");
    }
}
