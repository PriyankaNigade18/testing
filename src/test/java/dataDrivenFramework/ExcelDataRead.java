package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ExcelDataRead {
  @Test
  public void fileRead() throws IOException
  {
	  File f1=new File("./"+"\\TestData\\Data.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //Number of rows
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  
	  //Number of columns
	 int columns= wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  
	  //Object[][] array
	 	 Object [][]data=new Object[rows-1][columns];
	  
	  //read data from file and pass it to this array
	 	 
	  for(int i=1;i<rows;i++)
	  {
		  for(int j=0;j<columns;j++)
		  {
			  data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
			  System.out.print(data[i-1][j]+" ");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //single data read
//	  String value=wb.getSheet("userdata").getRow(4).getCell(0).getStringCellValue();
//	  
//	  System.out.println(value);
//	  XSSFSheet sheet1=wb.getSheet("userdata");
//	  XSSFRow row=sheet1.getRow(2);
//	  XSSFCell cell=row.getCell(0);
//	  String value=cell.getStringCellValue();
//	  System.out.println(value);
//	  
	  
	  
	  
	  
	  
  }
}
