package maven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hospital_Appointment_Booking {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
 
        WebDriver driver1=new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver1.get("https://www.practo.com/");
        Thread.sleep(1000);
        driver1.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[4]/span/a")).click();
        driver1.findElement(By.id("username")).sendKeys("9848803064");
        driver1.findElement(By.id("password")).sendKeys("Maruthi@5a29848");
        driver1.findElement(By.xpath("//*[@id=\"login\"]")).click();
        Thread.sleep(1000);
        driver1.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input")).click();
        WebElement searchInput = driver1.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input"));
        searchInput.sendKeys("Dentist");
        searchInput.sendKeys(Keys.ENTER);
        System.out.println("Visting the Dintist Doctor");
        Thread.sleep(1000);  
        driver1.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[2]/div[1]/div[1]/span[1]/div")).click();
        Thread.sleep(1000);  
        driver1.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div/div[2]/div/div/div[2]/div[1]/button")).click();  
        Thread.sleep(1000); 
        driver1.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[3]/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/span")).click();
        //Thread.sleep(1000); 
        //driver1.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/input")).sendKeys("9848803064");
        //Thread.sleep(1000);
        driver1.findElement(By.className("c-btn--dark")).click();
        Thread.sleep(1000);
        driver1.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div[3]/div/input")).sendKeys("maruthinallagorla@gmail.com");
        Thread.sleep(1000);
        driver1.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[2]/div/div[6]/div[3]/div[1]/button")).click();
        Thread.sleep(2000);
        driver1.quit();
        System.out.println("Booking Appointment is Conforimed"); 
        Thread.sleep(6000);
        driver1.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[2]/div/div[4]/a[1]")).click();
        Thread.sleep(1000);
        driver1.quit();
        

	}

}
