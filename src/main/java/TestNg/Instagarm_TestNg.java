package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Instagarm_TestNg {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        System.out.println("Browser launched and setup done.");
    }

    @Test
    public void loginToInstagram() throws InterruptedException {
        driver.get("https://www.instagram.com/accounts/login/");
        Thread.sleep(3000);

        driver.findElement(By.name("username")).sendKeys("maruthi_393");
        driver.findElement(By.name("password")).sendKeys("Maruthi@5a29848");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]/button")).click();

        System.out.println("Login submitted successfully!");
        Thread.sleep(30000);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
