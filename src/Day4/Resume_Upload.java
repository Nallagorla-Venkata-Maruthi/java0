package Day4;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume_Upload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		try {

			driver.get("https://www.naukri.com/nlogin/login");

			driver.findElement(By.className("err-border")).sendKeys("maruthinallagorla594@gmail.com");
            ((WebElement) driver.findElements(By.className("err-border"))).sendKeys("Maruthi@5a29848");
            driver.findElement(By.id("login_Layer")).click();
            

            WebElement fileInput=driver.findElement(By.className("secondary-content"));

			Thread.sleep(5000);

			driver.get("https://www.naukri.com/mnjuser/profile");
			Thread.sleep(3000);

			File uploadFile = new File("C:\\Users\\91938\\OneDrive\\Documents\\Java_ME\\Maruthi_Resume.docx");

			WebElement fileInput1 = driver.findElement(By.id("attachCV"));
			fileInput1.sendKeys(uploadFile.getAbsolutePath());

			Thread.sleep(5000);

			System.out.println("Resume uploaded succesfully");

		} finally {
			driver.quit();
		}
	}
}