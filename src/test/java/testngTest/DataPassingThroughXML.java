package testngTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DataPassingThroughXML
{
	@Parameters({"un","psw"})
  @Test
  public void loginTest(String un,String psw) 
  {
	  System.out.println("User name is: "+un);
	  System.out.println("Password is:"+psw);
  }
}
