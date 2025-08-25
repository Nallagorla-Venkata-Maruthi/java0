package maven;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hospital {

    public static void main(String[] args) {
        // Setup EdgeDriver
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://my.fortishealthcare.com/");

            WebElement phoneInput=driver.findElement(By.name("MobileNumber"));
            phoneInput.sendKeys("9848803064");


            driver.findElement(By.xpath("//button[contains(text(),'Login using PIN')]")).click();
            Thread.sleep(3000);

            if(driver.getCurrentUrl().contains("dashboard")) {
                System.out.println(" Dashboard displayed");
            } else {
                WebElement error = driver.findElement(By.className("error-message"));
                System.out.println(" Login failed: " + error.getText());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
