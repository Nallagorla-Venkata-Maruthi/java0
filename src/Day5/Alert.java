package Day5;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        driver.get("https://360homedecor.uk/home");
        driver.findElement(By.xpath("//*[@id=\"check_login\"]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"existed_user_login\"]/div[5]/button")).click();
        */

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();

        org.openqa.selenium.Alert alrt = driver.switchTo().alert();
        System.out.println("Print Alret"+alrt.getText());
        Thread.sleep(2000);
        alrt.accept();

        Thread.sleep(3000);
        driver.quit();
    }
}
