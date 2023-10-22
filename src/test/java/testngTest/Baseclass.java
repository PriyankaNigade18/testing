package testngTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Baseclass 
{

	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		//start the browser session
		 driver=new ChromeDriver();
		 driver.get("https://automationplayground.com/crm/login.html");
	}
	
	@AfterMethod
	  public void varifyTitle()
	  {
		//title/current url validate
		  String exp="Customers";
		  Assert.assertEquals(driver.getTitle(), exp,"Erroe-Title not matched!");
		  System.out.println("Title matched!");
	  }
	  
	  
	  @AfterClass
	  public void tearDown()
	  {
	 //close the browser
		  driver.quit();
	  }
}
