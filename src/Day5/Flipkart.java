package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[2]/div[2]/div/div/div/div/a/span")).click();
		Thread.sleep(1500);

		CharSequence number = null;
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys(number);
		Thread.sleep(10000);
		driver.findElement(By.className("r4vIwl BV+Dqf"));
		driver.findElement(By.xpath("//button[contains(text(),'Request OTP')]")).click();

		Thread.sleep(5000);

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		WebElement firstProduct = driver.findElement(By.xpath("//div[@class='...']"));
		firstProduct.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();

		
	}
}


	
