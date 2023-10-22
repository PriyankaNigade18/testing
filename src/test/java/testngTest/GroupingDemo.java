package testngTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupingDemo 
{
  @Test(groups = "SmokeTest")
  public void testCase1() 
  {
	  System.out.println("This is first test case!");
  }
  
  @Test(groups = "SmokeTest")
  public void testCase2() 
  {
	  System.out.println("This is second test case!");
  }
  
  
  @Test(groups = "RegressionTest")
  public void testCase3() 
  {
	  System.out.println("This is Third test case!");
  }
  
}
