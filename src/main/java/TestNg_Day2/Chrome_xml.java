package TestNg_Day2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
public class Chrome_xml
{
 
	WebDriver driver;
 
    @BeforeClass
    public void setup() {
        System.out.println("Launching Browser...");
        driver = new ChromeDriver();   
        driver.manage().window().maximize();
    }
 
    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Page Title: " + driver.getTitle());
    }
 
    @AfterClass
    public void teardown() {
        System.out.println("Closing Browser...");
        driver.quit();
    }
}