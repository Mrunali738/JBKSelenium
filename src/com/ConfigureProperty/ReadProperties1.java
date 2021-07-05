package com.ConfigureProperty;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadProperties1 {
	public String getProperty(String key) {
		Properties prop = new Properties();
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("config.properties1");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	
  @Test
  public void test03() throws Exception {
	  FileInputStream fis = new FileInputStream("config.Properties1");
	  Properties prop = new Properties();
	  prop.load(fis);
	  String value = prop.getProperty("username");
	  System.out.println(value);
  }
  
  @Test
  public void test04(){
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get(getProperty("Url"));
	  driver.findElement(By.id("email")).sendKeys(getProperty("Username"));
	  driver.findElement(By.id("password")).sendKeys(getProperty("Password"));
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

  }
}

	
	
		
	


