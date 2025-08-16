package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSearch {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\geckodriver-v0.36.0-win64\\geckodriver.exe");
		
        WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.google.com");
		
		WebElement searchb=driver.findElement(By.name("q"));
		searchb.sendKeys("selenium official website");
		searchb.submit();
		try {
            Thread.sleep(50000); // Pauses the program for 50 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Page Title: " +driver.getTitle());
		driver.quit();
		

	}

}
