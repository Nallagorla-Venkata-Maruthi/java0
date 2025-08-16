package Day3;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edge_pageload {
    public static void main(String[] args) {
        
        // Set path to Edge
    	System.setProperty("webdriver.edge.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\edgedriver_win64\\msedgedriver.exe");

        // Create EdgeOptions object and maximize window
        EdgeOptions options = new EdgeOptions();
        
        // Set page load strategy to NONE (doesn't wait for full load)
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        // Launch Firefox with options
        WebDriver driver = new EdgeDriver(options);

        try {
            // Open Google
            driver.get("https://www.google.com");
        } finally {
            // Close browser
            driver.close();
        }
    }
}
