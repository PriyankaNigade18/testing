package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAutomation {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=sadsadasd&submit-name=");
		
		System.out.println("Print all Headings of the table");
		List<WebElement> headings=driver.findElements(By.xpath("//thead//tr//th"));
		System.out.println("Total Heading are: "+headings.size());
		
		for(WebElement i:headings)
		{
			System.out.println(i.getText());
		}
		System.out.println("********************************");
		System.out.println("Calculate number of rows");
		int rows=driver.findElements(By.xpath("//tbody//tr")).size();
		System.out.println("Number of rows are: "+rows);
		System.out.println("********************************");
		//row--cell--data
		System.out.println("Calculate number of columns");
		int cells=driver.findElements(By.xpath("//tbody//tr[1]//td")).size();
		System.out.println("Number of Columns are: "+cells);
		System.out.println("********************************");
		System.out.println("Print row 4 data");
		List<WebElement> row4=driver.findElements(By.xpath("//tbody//tr[4]//td"));
		for(WebElement i:row4)
		{
			System.out.print(i.getText()+"  ");
		}
		System.out.println("********************************");

		System.out.println("Print 2 columns data");
		List<WebElement> cell2=driver.findElements(By.xpath("//tbody//tr//td[2]"));
		for(WebElement i:cell2)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("********************************");

		System.out.println("All data from table");
		List<WebElement> all=driver.findElements(By.xpath("//tbody//tr//td"));
		
		for(WebElement i:all)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		

	}

}
