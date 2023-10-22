package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class BaseClass
{
	public WebDriver driver;
	public LoginPage lp;
	public NewLoginPage login;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 lp=new LoginPage(driver);
		 login=PageFactory.initElements(driver,NewLoginPage.class);
	}
	
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
