package pageObjectModel;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewLoginPageTest extends BaseClass
{
  @Test
  public void verifyTitle() 
  {
	// NewLoginPage login= PageFactory.initElements(driver,NewLoginPage.class);
	  String act=login.getAppTitle();
	  Assert.assertTrue(act.contains("HRM"),"Title is not match");
	  System.out.println("Title is match");
  }
  
  @Test
  public void verifyLogin()
  {
	  login.doLogin("Admin", "admin123");
	  
  }
}
