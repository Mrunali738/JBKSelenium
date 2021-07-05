package com.Webtable;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CreateWebtable {
	
  @Test
  public void allCols() throws Exception {
	  int expectedCol = 8;
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/users.html");
	 driver.manage().window().maximize();
	 List<WebElement> cols = driver.findElements(By.tagName("th"));
	 int actualCol = cols.size();
	 System.out.println(actualCol);
	 Assert.assertEquals(actualCol, expectedCol);
	 Thread.sleep(2000);
  }
  
  @Test
  public void allRows() {
	  int expectedRows = 4;
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/users.html");
		 driver.manage().window().maximize();
		 ArrayList<WebElement> rows = new ArrayList<WebElement>();
		 for(int i=2; i<=5; i++) {
			 WebElement row = driver.findElement(By.xpath("//tr["+i+"]"));
			 System.out.println(row.getText());
			 rows.add(row);
		 }
		 int actualRows = rows.size();
		 Assert.assertEquals(actualRows, expectedRows);
  }
  
}
