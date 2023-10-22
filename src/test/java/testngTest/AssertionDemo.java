package testngTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo 
{
  @Test
  public void hardAssertTest() 
  {
	  String act="Selenium WebDriver is webui automation library";
	  String exp="TestNG";
	  	/*
	  	 * When Assertion fail you will get AssertionError
	   */
	  //Assert.assertEquals(act,exp,"Error-Strings are not equal!");
	  
	  //Assert.assertTrue(act.contains(exp),"Error-String does not contains Selenium!");
	  
	  Assert.assertFalse(act.contains(exp), "Error-String contains TestNG!Which should not be a part of a string");
	  
	  System.out.println("Pass-String does not contains TestNG!");
	  System.out.println("Hard Assert demo completed!");
  }
  
  
  @Test
  public void softAssertTest()
  {
	  
	  SoftAssert sf=new SoftAssert();
	  int a=10,b=10;
	  //sf.assertEquals(a,b,"Error-Numbers are not equal");
	  //sf.assertTrue(a==b, "Error-Numbers are not equal");
	  sf.assertFalse(a==b, "Error-Numbers are equal!");
	  System.out.println("Numbers are  not equal!");
	  sf.assertAll();
	  
	  
  }
  
}
