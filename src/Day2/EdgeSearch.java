package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
	
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
