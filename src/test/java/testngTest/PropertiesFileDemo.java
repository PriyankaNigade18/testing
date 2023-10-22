package testngTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import generic.PropertiesUtil;

public class PropertiesFileDemo {
  @Test
  public void fileRead() throws IOException
  {
//	  File f1=new File("./"+"\\Config.properties");
//	  FileInputStream fs=new FileInputStream(f1);
//	  
//	  Properties p1=new Properties();
//	  p1.load(fs);
	  
	  PropertiesUtil p1=new PropertiesUtil();
	  
	  
//	  System.out.println(p1.getProperty("un"));
//	  System.out.println(p1.getProperty("psw"));
	  
	  System.out.println(p1.getData("un"));
	  System.out.println(p1.getData("bname"));
	  
	  
	  
	  
			 
	  
  }
}
