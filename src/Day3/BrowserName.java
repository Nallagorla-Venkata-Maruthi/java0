package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Capabilities;

public class BrowserName {
    public static void main(String[] args) {

        // Set ChromeDriver path
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\chromedriver-win64\\chromedriver.exe");

        // Create ChromeOptions object and maximize window
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        // Launch Chrome with options
        WebDriver driver = new ChromeDriver(options);

        // Open Google
        driver.get("https://www.google.com");

        // Print browser name
        Capabilities options1 = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = options1.getBrowserName();
        String browserVersion=options1.getBrowserVersion();
        System.out.println("Browser Name:"+browserName);
        System.out.println("Browser Version:"+browserVersion);
        

        // Quit browser
        driver.quit();
        
    }
}
