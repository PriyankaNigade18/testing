package testngTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGAttributes 
{
  @Test(priority=1,description="This is test case 1")
  public void registerTest() 
  {
	  System.out.println("User will register!");
	 
  }
  
  @Test(priority=2,description="This is test case 2",invocationCount=3)
  public void loginTest() 
  {
	  System.out.println("User will login!");
	 
  }
  
  
  @Test(priority=3)
  public void logoutTest() 
  {
	  System.out.println("User will logout!");
	 
  }
}
