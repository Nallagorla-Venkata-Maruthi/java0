package Day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property {

    public static void main(String[] args) throws InterruptedException {
        Properties props = new Properties();
        WebDriver driver =new ChromeDriver();
        
        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\91938\\OneDrive\\Documents\\Java_ME\\TESTING\\sample.propites.txt");
            props.load(fis);

            String email = props.getProperty("naukri.email");
            String password = props.getProperty("naukri.password");
            String resumePath = props.getProperty("resume.path");
            String chromeDriverPath = props.getProperty("chromedriver.path");
            System.setProperty("webdriver.chrome.driver",chromeDriverPath);


            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            driver.get("https://www.naukri.com/nlogin/login");

         
            driver.findElement(By.id("usernameField")).sendKeys(email);
            driver.findElement(By.id("passwordField")).sendKeys(password);

            driver.findElement(By.xpath("//button[text()='Login']")).click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://www.naukri.com/mnjuser/profile");
            Thread.sleep(5000);

            WebElement uploadBtn = driver.findElement(By.id("attachCV"));
            uploadBtn.sendKeys(resumePath);

            System.out.println("Resume uploaded successfully!");

        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        finally {
            if(driver != null) {
                driver.quit();
            }
        }

    }
}
