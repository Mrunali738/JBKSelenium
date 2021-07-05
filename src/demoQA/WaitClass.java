package demoQA;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitClass {
  @Test
  public void demoLogin() {
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demoqa.com/login");
	  driver.manage().window().maximize();
	  
	 //Browser Related waits---globaly declared
	  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); //timeout Exception
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); //nosuchElement Exception
	   driver.findElement(By.id("userName")).sendKeys("Mrunali");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@id='newUser']")).click();
		
		/* element specific waits---declared as and when necessary 
		 * WebDriverWait wait= new WebDriverWait(driver, 30);
	     * wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName"))));
	 
		 * Wait w = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS)
		 * .ignoring(NoSuchElementException.class).pollingEvery(3, TimeUnit.SECONDS);
		 * w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName"))));
		 */
	  
  }
}
