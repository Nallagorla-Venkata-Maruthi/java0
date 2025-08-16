package Day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {

        // Set the ChromeDriver path if not in system PATH
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\geckodriver-v0.36.0-win64\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://www.google.com");
        
        try {
            Thread.sleep(30000); // Pauses the program for 30 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hi");
        driver.quit();
    }
}
