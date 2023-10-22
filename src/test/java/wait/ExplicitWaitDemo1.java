package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Utility;

public class ExplicitWaitDemo1
{
	
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//By locator
		By emailid=By.name("email");
		By psw=By.name("password");
		By btn=By.xpath("//input[@value='Login']");
		
		
		//driver.findElement(emailid).sendKeys("test@gmail.com");
		/*
		 * TimeOutException:
		 * Expected condition failed: waiting for presence of element located by: 
		 * By.name: email### (tried for 10 second(s) with 500 milliseconds interval)
		 * Selenium server default timeout of identifying web element 500ms=0.5 sec
		 * interval time=polling time
		 */
		
		Utility.waitForElementPresent(driver,emailid).sendKeys("test@gmail.com");
		Utility.waitForElementVisbiblity(driver,psw).sendKeys("test123");
		Utility.waitForElementClickable(driver,btn).click();
		
		
		
		
		
		
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement emailele=wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
//		emailele.sendKeys("test@gmail.com");
		
		
		
//		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(psw)).sendKeys("test123");
		
//		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait3.until(ExpectedConditions.elementToBeClickable(btn)).click();
		
		
		
		
		
		
	}

}
