package Day4;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) throws IOException, InterruptedException {

        
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\91938\\eclipse-workspace\\Selenium\\src\\Day4\\Amazon.properties");
        props.load(fis);

        String email = props.getProperty("amazon.email");
        String password = props.getProperty("amazon.password");
        String chromeDriverPath = props.getProperty("chromedriver.path");

        
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

   
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            
            driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&ref_%3Dnav_em_hd_clc_signin_0_1_1_38");

            
            driver.findElement(By.id("ap_email")).sendKeys(email);
            driver.findElement(By.id("continue")).click();

            Thread.sleep(5000); 

            
            driver.findElement(By.id("ap_password")).sendKeys(password);
            driver.findElement(By.id("signInSubmit")).click();

            Thread.sleep(5000);

            System.out.println("Amazon login completed");

        } finally {
            driver.quit();
        }
    }
}