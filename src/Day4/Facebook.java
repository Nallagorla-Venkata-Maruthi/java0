package Day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		Properties props = new Properties();
		WebDriver driver= null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\91938\\eclipse-workspace\\Selenium\\Facebook.properties");
			props.load(fis);
			String username=props.getProperty("facebook.username");
            String password=props.getProperty("facebook.password");
            String chromeDriverPath=props.getProperty("C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\chromedriver-win64\\chromedriver.exe");
            
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            
            driver.get("https://www.facebook.com/login.php/");
            Thread.sleep(3000);
            
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9848803064");
            driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Maruthi@5a29848");
            driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
            Thread.sleep(5000);

            System.out.println("Login submitted successfully!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			driver.quit();	
		}

	}

}
