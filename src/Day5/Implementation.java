package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implementation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://360homedecor.uk/");
		
		//page tile
		String title=driver.getTitle();
        System.out.println("Page Title: " +title);
        
        //current url kosam
        String url=driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
        
        String url1=driver.getWindowHandle();
        System.out.println("Current Handle: "+url1);
        
        String pageHtml=driver.getPageSource();
        System.out.println("html page with string format"+pageHtml);
        driver.quit();
        
        //getTitle(),getCurrentUrl(),getWindowHandle()


	}

}
