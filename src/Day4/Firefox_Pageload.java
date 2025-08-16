package Day4;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox_Pageload {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\geckodriver-v0.36.0-win64\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL); ////Highest load time
		//options.setPageLoadStrategy(PageLoadStrategy.NONE); //Very Shortest Load Time
        //options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		WebDriver driver =new FirefoxDriver(options);
		
		try {
			driver.get("https://www.amazon.in");
		}
		finally {
			//driver.close();		
			}
	}

}
