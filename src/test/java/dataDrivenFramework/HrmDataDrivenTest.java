package dataDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmDataDrivenTest
{
	//@Test(dataProvider ="TestData",dataProviderClass = CustomData.class)
	@Test(dataProvider ="ExcelData",dataProviderClass = CustomData.class)
	
	  public void loginTest(String un,String psw)
	  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//username
		driver.findElement(By.name("username")).sendKeys(un);
		
		//password
		driver.findElement(By.name("password")).sendKeys(psw);
		
		//login
		//driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		
		
		driver.findElement(By.className("oxd-button")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login fail");
		System.out.println("Login completed!");
	  }
}
