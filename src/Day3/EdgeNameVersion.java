package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Capabilities;

public class EdgeNameVersion {
    public static void main(String[] args) {

        // Set EdgeDriver path
        System.setProperty("webdriver.edge.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\edgedriver_win64\\msedgedriver.exe");

        // Create EdgeOptions object and maximize window
        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");

        // Launch Edge with options
        WebDriver driver = new EdgeDriver(options);

        // Open Google
        driver.get("https://www.google.com");

        // Print browser name and version
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = caps.getBrowserName();
        String browserVersion = caps.getBrowserVersion();
        System.out.println("Browser Name: " + browserName);
        System.out.println("Browser Version: " + browserVersion);

        // Quit browser
        driver.quit();
    }
}
