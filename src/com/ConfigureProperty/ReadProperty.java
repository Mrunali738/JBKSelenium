package com.ConfigureProperty;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadProperty {
	public String getProperty(String key) throws Exception {
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("config.properties");
			prop.load(fis);
		
		return prop.getProperty(key);
	}
	
  @Test
  public void test01() throws Exception {
	  FileInputStream fis = new FileInputStream("config.Properties");
	  Properties prop = new Properties();
	  prop.load(fis);
	  String value = prop.getProperty("username");
	  System.out.println(value);
  }
  
  @Test
  public void test02() throws Exception{
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get(getProperty("url"));
	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/input")).sendKeys(getProperty("username"));
	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys(getProperty("password"));
	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/div/button")).click();

  }
}
