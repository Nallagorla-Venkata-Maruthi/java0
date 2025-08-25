package TestNg_Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazon_Retry_Datapro {
	private 

	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test(groups= {"smoke"})
    public void testLogin() {
        System.out.println("smoke test-Title Check");
        System.out.println("Page Title: "+driver.getTitle());
    }

    @Test(groups= {"Regression"})
    public void testAddToCart() {
        System.out.println("Regression Test-Search");
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email_login")).sendKeys("maruthinallagorla@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Maruthi@5a29848");
        driver.findElement(By.id("signInSubmit")).click();
    }
    @Test(groups= {"sanitory", "Regression"})
    public void  testCart()
    {
    	System.out.println("Sanity + Regression- Cart test");
    }
    @AfterClass
	public void teardown()
	{
		driver.quit();
	} 
}

