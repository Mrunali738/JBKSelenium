package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathEx {
	public static WebDriver driver;
	@Test
	public static void verifyForm() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/forms");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Practice Form")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']//preceding::input[1]")).sendKeys("Mrunali");
		driver.findElement(By.xpath("//input[@id='firstName']//following::input[1]")).sendKeys("Bandebuche");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("mrunali@123");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		Thread.sleep(2000);
	}
	@Test
	public static void verifyAlert() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		
	}
}