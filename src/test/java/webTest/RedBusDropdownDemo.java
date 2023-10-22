package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusDropdownDemo {

	public static void main(String[] args) 
	{
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		
		List<WebElement> fromList=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']"));
		
		System.out.println("Total Options are: "+fromList.size());
		
		for(WebElement i:fromList)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Viman Nagar"))
			{
				i.click();
				break;
				
			}
		}
		
		

	}

}
