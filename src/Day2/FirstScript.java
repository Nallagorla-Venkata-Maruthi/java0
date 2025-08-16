package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));

        WebElement textBox=driver.findElement(By.name("my-text"));
        WebElement submitButton=driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message=driver.findElement(By.id("message"));
        message.getText();
        try {
            Thread.sleep(20000); // Pauses the program for 20 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}