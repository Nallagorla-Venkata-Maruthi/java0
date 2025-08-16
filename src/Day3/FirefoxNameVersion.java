package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Capabilities;

public class FirefoxNameVersion {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\geckodriver-v0.36.0-win64\\geckodriver.exe");

        FirefoxOptions options=new FirefoxOptions();
        options.addArguments("--start-maximized");

        WebDriver driver=new FirefoxDriver(options);

        // Open Google
        driver.get("https://www.google.com");

        // Print  name and version
        Capabilities options1= ((RemoteWebDriver) driver).getCapabilities();
        String browserName=options1.getBrowserName();
        String browserVersion =options1.getBrowserVersion();
        System.out.println("Browser Name: " + browserName);
        System.out.println("Browser Version: " + browserVersion);

        // Quit browser
        driver.quit();
    }
}
