package maven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cancel_Appointemt {

	private static Object wait;

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
        
        driver1.findElement(By.cssSelector("#root > div > div > div.global-nav-bar > div.practo_GlobalNavigation > div.navbar.mobile.consumer-nav.en > div.wrapper.branding > div.nav-right > span > span.downarrow.icon-ic_down_cheveron")).click();
        driver1.findElement(By.className("nav-interact")).click();
        driver1.findElement(By.id("viewDetailsBtn12ac0e922e7f4b7ca7fa771673cd3823")).click();
        driver1.findElement(By.id("//*[@id=\"container\"]/div[2]/div[2]/div/div[4]/a[1]")).click();

        Thread.sleep(100);
	}
}