package Day4;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

    public static void main(String[] args) {
        Properties props = new Properties();
        WebDriver driver = null;

        try 
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\91938\\eclipse-workspace\\Selenium\\config.propertie");
            props.load(fis);

            String username=props.getProperty("instagram.username");
            String password=props.getProperty("instagram.password");
            

            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            driver.get("https://www.instagram.com//accounts//login//");
            Thread.sleep(3000); 

            driver.findElement(By.name("username")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]")).click();

            System.out.println("Login submitted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null);
        }
    }
}
