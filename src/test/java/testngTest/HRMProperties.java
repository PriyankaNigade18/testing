package testngTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.PropertiesUtil;

public class HRMProperties {
  @Test
  public void verifyLogin() 
  {
	//create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		PropertiesUtil p1=new PropertiesUtil();
		
		//username
		driver.findElement(By.name("username")).sendKeys(p1.getData("un"));
		
		//password
		driver.findElement(By.name("password")).sendKeys(p1.getData("psw"));
		
		//login
		//driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		
		
		driver.findElement(By.className("oxd-button")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login fail");
		System.out.println("Login completed!");
		
  }
}
