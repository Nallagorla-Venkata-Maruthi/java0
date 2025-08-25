package TestNg_Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dependencies {
	WebDriver driver;

	@BeforeClass
	public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void healthsetup() {
		driver.get("https://o2.openmrs.org/openmrs/login.htm");

	}

	@Test(dependsOnMethods = { "healthsetup" })
	public void login() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Registration Desk")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
	}
	/*
	 * @Test(dependsOnMethods= {"healthsetup","Login"}) public void
	 * patientRigestration() throws InterruptedException {
	 * driver.findElement(By.xpath(
	 * "referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension"
	 * )).click(); Thread.sleep(3000);
	 * driver.findElement(By.id("fr3089-field")).sendKeys("Maruthi");
	 * driver.findElement(By.xpath("fr4191-field")).sendKeys("Nallagorla");
	 * driver.findElement(By.id("next-button")).click();
	 */

}
