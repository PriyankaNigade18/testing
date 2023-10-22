package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	@DataProvider(name="TestData")
	public Object[][] testData()
	{
		Object[][] data= {{"Admin","admin123"},{"Tester1","test123"},{"Admin","admin123"}};
		return data;
	}
	
	@DataProvider(name="ExcelData")
	public Object[][] excelData()
	{
		 XSSFWorkbook wb;
		 Object [][]data=null;
		  File f1=new File("./"+"\\TestData\\Data.xlsx");
		  FileInputStream fs;
		  try {
			fs=new FileInputStream(f1);
			wb=new XSSFWorkbook(fs);
			  //Number of rows
			  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
			  
			  //Number of columns
			 int columns= wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
			  
			  //Object[][] array
			 	 data=new Object[rows-1][columns];//5 2
			  
			  //read data from file and pass it to this array
			 	 
			  for(int i=1;i<rows;i++)
			  {
				  for(int j=0;j<columns;j++)
				  {
					  data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
					  //System.out.print(data[i-1][j]+" ");
				  }
				  System.out.println();
			  }
			  
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return data;
		  
		
	}
}
