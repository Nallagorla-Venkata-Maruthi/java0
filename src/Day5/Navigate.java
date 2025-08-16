package Day5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");
        driver.navigate().to("https://360homedecor.uk/");
        Thread.sleep(6000);

        driver.navigate().back();
        Thread.sleep(2000);
        
        driver.navigate().forward(); 
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        String url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);

      

        // Close browser
        driver.quit();
    }
}
