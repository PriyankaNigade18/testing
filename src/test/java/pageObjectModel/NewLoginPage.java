package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLoginPage 
{
  private WebDriver driver;
	
	//initialize driver
	public NewLoginPage(WebDriver driver)//Base class
	{
		this.driver=driver;
	}
	
	//by locator way
	private @FindBy(name="username")
	WebElement uname;
	
	private @FindBy(name="password")
	WebElement pass;
	
	private @FindBy(xpath="//button[@type='submit']")
	WebElement btn;
	
	//method
	
	public void doLogin(String un,String psw)
	{
		uname.sendKeys(un);
		pass.sendKeys(psw);
		btn.click();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	

}
