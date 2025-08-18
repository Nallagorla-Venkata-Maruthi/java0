package Day5;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Book_Appointment360 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://360homedecor.uk/book-appointment");
        Thread.sleep(2000);
        
        WebElement dropd=driver.findElement(By.id("choose_branch"));
        Select select=new Select(dropd);
        select.selectByVisibleText("Veneer");
        Thread.sleep(3000);
        
        WebElement dropd1=driver.findElement(By.id("choose_style"));
        Select select1=new Select(dropd1);
        select1.selectByVisibleText("Luxury"); 
        Thread.sleep(2000);
        
        driver.findElement(By.id("first_name")).sendKeys("Venakata Maruthi");
        Thread.sleep(1000);
        driver.findElement(By.id("last_name")).sendKeys("Nallagorla");
        Thread.sleep(1000);
        driver.findElement(By.id("apt_city")).sendKeys("Ongole");
        Thread.sleep(1000);
        driver.findElement(By.id("phone_number")).sendKeys("9848803064");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("maruthinallagorla@gmail.com");
        
        File uploadFile = new File("C:\\Users\\91938\\OneDrive\\Documents\\Java_ME\\Maruthi_Resume.docx");
        driver.findElement(By.cssSelector("#layoutFiles")).sendKeys(uploadFile.getAbsolutePath());

        WebElement checkbox = driver.findElement(By.cssSelector("#privacyPolicy"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        driver.findElement(By.cssSelector("#appointment_form button")).click();
        Thread.sleep(5000); 
        System.out.println("Form submitted successfully!");  	
	}

}
