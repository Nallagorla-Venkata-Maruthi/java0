package Day3;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_pageload {
    public static void main(String[] args) {
        
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\chromedriver-win64\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
        
        // Set page load strategy to NONE (doesn't wait for full load)
        //options.setPageLoadStrategy(PageLoadStrategy.NONE); //Very Shortest Load Time
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL); //Highest load time
        //options.setPageLoadStrategy(PageLoadStrategy.EAGER); //Shorter load time
       

        // Launch Chrome with options
        WebDriver driver = new ChromeDriver(options);

        try {
            // Open Google
        	driver.get("https://www.amazon.in");
        } finally {
            // Close browser
            //driver.close();
        }
    }
}
