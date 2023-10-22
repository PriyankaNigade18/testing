package testngTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodDemo 
{
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("User should be register!");
	  String act="User not Registered!";
	  String exp="User Registered!";
	  Assert.assertEquals(act,exp,"Error-User Registartion is fail");
	  System.out.println("User Registration is completed!");
  }
 
  @Test(priority=2,dependsOnMethods ="registerTest")
  public void loginTest()
  {
	  System.out.println("User should be Login!");
  }
}
