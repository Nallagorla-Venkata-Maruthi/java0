package TestNg;
 
import java.io.IOException;
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
public class Aireoplane_testNg {
	
	WebDriver driver;
 
    @BeforeClass
    public void setup() throws IOException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
    }
    
    @BeforeMethod
    public void IxigoSite() {
    	driver.get("https://www.ixigo.com/");
    	
    }
    
    @Test(priority=0)
    public void Login() throws InterruptedException {
    	driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]")).click();
    	driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Mobile Number')]")).sendKeys("9848803064");
    	driver.findElement(By.xpath("//button[@class='inline-flex justify-center items-center bg-brand-solid text-brand-solid hover:bg-brand-solid-over gap-5px rounded-10 min-h-40 button-md icon-md px-15px w-full mt-20 mb-15 h-12 py-3 px-20']")).click();
    	Thread.sleep(20000);
    	
    }
    
    @Test(priority=1)
    public void BookFlight() throws InterruptedException {
    	driver.findElement(By.xpath("/html/body/main/div[2]/div[4]/div[2]/div/div/div[1]/div[2]/div[2]/a/button")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/div[3]/div[1]/button")).click();
    	//continue
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/button")).click();
        //DropDown
    	Thread.sleep(1000);
    	//WebElement titleDropdown = driver.findElement(By.xpath("//input[@placeholder='Title']"));
    	//titleDropdown.click();
    	//Thread.sleep(1000);

    	// Select "Mr" from dropdown list
    	//WebElement optionMr = driver.findElement(By.cssSelector("#portal-root > div > div > p:nth-child(1)"));
    	//optionMr.click();
    	//Thread.sleep(1000);
        Thread.sleep(15000);
        driver.findElement(By.xpath("//*[@id=\"adult1\"]/div[2]/div/form/div/div[2]/div/div/div[1]/div[2]/input")).sendKeys("Venkata Maruthi");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"adult1\"]/div[2]/div/form/div/div[3]/div/div/div[1]/div[2]/input")).sendKeys("nallagorla");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div[4]/div[1]/div[2]/div/div[3]/div/div[2]/input")).sendKeys("maruthinallagorla@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/button")).click();
        Thread.sleep(10000);
    }
    
    
 
}