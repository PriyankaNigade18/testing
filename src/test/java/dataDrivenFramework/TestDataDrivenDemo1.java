package dataDrivenFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataDrivenDemo1
{
//	@DataProvider(name="TestData")
//	public Object[][] testData()
//	{
//		Object[][] data= {{"Admin","admin123"},{"Tester1","test123"},{"Admin","admin123"}};
//		return data;
//	}
	
	
	
	
  @Test(dataProvider ="TestData",dataProviderClass = CustomData.class)
  public void loginTest(String un,String psw)
  {
	  System.out.println("User Name is: "+un);
	  System.out.println("Password is: "+psw);
  }
}
