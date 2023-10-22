package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic.Utility;

public class AmazonDropdown {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//drop down ele
		WebElement ele=driver.findElement(By.id("searchDropdownBox"));

		
		Utility.selectBasedDropdown(ele,"Prime Video");
		
		/*
		//select class
		Select dd=new Select(ele);
		
		System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
		
		//single selection
		dd.selectByIndex(3);
		Thread.sleep(2000);
		dd.selectByValue("search-alias=baby");
		Thread.sleep(2000);
		dd.selectByVisibleText("Gift Cards");
		
		//to get all options 
		List<WebElement> list1=dd.getOptions();
		System.out.println("Total options are: "+list1.size());
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Video Games"))
			{
				i.click();
				break;
			}
		}
		
		*/
		
		
		
	}

}
