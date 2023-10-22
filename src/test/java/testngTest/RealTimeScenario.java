package testngTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class RealTimeScenario extends Baseclass
{
	//public WebDriver driver;
	
  @Test
  public void loginTest() 
  {
	   //login test
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test@123");
	  driver.findElement(By.id("submit-id")).click();
	  
  }
  
  
}
