package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSetProperty {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
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
