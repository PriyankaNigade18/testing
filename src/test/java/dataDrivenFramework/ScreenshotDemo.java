package dataDrivenFramework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import generic.Utility;

public class ScreenshotDemo {
  @Test
  public void capture() throws IOException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  Utility.getScreenshot(driver);
	  
//	  TakesScreenshot ts=(TakesScreenshot) driver;
//	  File temp=ts.getScreenshotAs(OutputType.FILE);
//	  File dest=new File("./"+"\\Screenshots\\Amazon.png");
//	  
//	  FileHandler.copy(temp, dest);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
