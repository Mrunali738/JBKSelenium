package com.Listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DemoTest2 {
	public static WebDriver driver;

	public static void getScreenshot(String name) {
		  SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
		  String date = sdf.format(new Date());
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
       File dest = new File("C:\\Users\\sac\\eclipse-workspace\\jbkSelenium\\screenshot\\"+name+".jpg");
		  try {
		  FileUtils.copyFile(src, dest);
		  } catch (IOException e) {
		  e.printStackTrace();
		  }
		}
 @Test
 public void Test01() {
	 System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/index.html");
	  driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("kiran@gmail.com");
	  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123456");
	  driver.findElement(By.xpath("//button")).click();
 }
  
  @Test
  public void Test02() {
	  System.out.println("test02");
	  Assert.assertEquals(true, false);
  }
  @Test
  public void Test03() {
	  System.out.println("test03");
	  throw new SkipException("skipping testcase");
  }

}