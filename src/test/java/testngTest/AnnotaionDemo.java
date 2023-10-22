package testngTest;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotaionDemo
{
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("This is register test");
  }
  
  @Test(priority=2)
  public void loginTest()
  {
	  System.out.println("This is login test");
  }
  
  
  @Test(priority=3)
  public void logoutTest()
  {
	  System.out.println("This is logout test");
  }
  
  //Annotation-Rule
  @BeforeMethod
  public void bmethod()
  {
	System.out.println("BeforeMethod will run before every method");  
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("AfterMethod will run after every method");
  }

  @BeforeClass
  public void bclass()
  {
	  System.out.println("Before Class will run before only first test case");
  }
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("After Class will run after only last test case");
  }
  
  @BeforeTest
  public void btest()
  {
	  System.out.println("Before test will run before class");
  }
  
  @AfterTest
  public void atest()
  {
	  System.out.println("After test will run After class");
  }
  
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("Before Suite will run before test");
  }
  
  @AfterSuite
  public void asuite()
  {
	  System.out.println("After Suite will run after test");
  }
}
