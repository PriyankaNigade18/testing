package testngTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SequencingDemo 
{
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("User will register first");
  }
  
  @Test(priority=2)
  public void loginTest() 
  {
	  System.out.println("User will login ");
  }
  
  
  @Test(priority=3)
  public void searchProductTest() 
  {
	  System.out.println("User will search a product ");
  }
  
  
  @Test(priority=4)
  public void addToCartTest() 
  {
	  System.out.println("User will add the product into cart");
  }
  
  @Test(priority=5,enabled=false)
  public void logoutTest() 
  {
	  System.out.println("User will logout");
  }
}
