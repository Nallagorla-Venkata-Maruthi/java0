package maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form_Automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Venkata");
		driver.findElement(By.id("lastName")).sendKeys("Maruthi");
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("maruthinallagorla594@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9848803064");
		Thread.sleep(20);
		WebElement dobField=driver.findElement(By.id("dateOfBirthInput"));
		dobField.sendKeys(Keys.CONTROL+"a");
		dobField.sendKeys("07 Aug 2003");
		dobField.sendKeys(Keys.ENTER);  
		Thread.sleep(20); 
		WebElement subjectInput=driver.findElement(By.id("subjectsInput"));
		subjectInput.sendKeys("Computer Science");
		subjectInput.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]")).click();
        Thread.sleep(10); 
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\91938\\OneDrive\\Desktop\\MINE\\Mine pics\\image 20.jpg");
        driver.findElement(By.id("currentAddress")).sendKeys("Thammavaram Village,Korisapadu Mandal,Bapatla District,Andhrapradesh,inida");
        Thread.sleep(10);
        
        driver.findElement(By.id("state")).click();
        WebElement stateInput = driver.findElement(By.xpath("//div[@id='state']//input"));
        stateInput.sendKeys("NCR");
        stateInput.sendKeys(Keys.ENTER);

        driver.findElement(By.id("city")).click();
        WebElement cityInput = driver.findElement(By.xpath("//div[@id='city']//input"));
        cityInput.sendKeys("Noida");
        cityInput.sendKeys(Keys.ENTER);

        driver.findElement(By.id("submit")).click();
        System.out.println("SuccessFully Form Submitted");
	}

}
