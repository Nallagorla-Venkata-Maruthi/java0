package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.safari.SafariDriver;

public class Multiple {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver =new EdgeDriver();
		
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\geckodriver-v0.36.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.safari.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\safaridriver-win64\\safaridriver.exe");
		WebDriver driver = new SafariDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		//open the website
		driver.get("https://www.youtube.com/");
		System.out.println("Page Title: "+driver.getTitle()); 
		
		driver.switchTo().newWindow(WindowType.TAB); //This help to open multiple websites at a time

		
		driver.get("https://in.search.yahoo.com/yhs/search?hspart=sz&hsimp=yhs-002&p=greekforgreeks&type=type80160-2184732695&param1=3375672290");
		System.out.println("Page Title: "+driver.getTitle()); 
		
		//driver.quit();
		//driver.close();
		

	}

}
