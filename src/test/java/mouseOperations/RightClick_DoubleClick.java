package mouseOperations;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_DoubleClick {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//right click
		WebElement rele=driver.findElement(By.xpath("//span[text()='right click me']"));

		//Actions class
		Actions act=new Actions(driver);
		act.contextClick(rele).perform();
		
		//to capture menu
		List<WebElement> list1=driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]//li"));
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Delete"))
			{
				i.click();
				//alert will open
				
				driver.switchTo().alert().accept();
				break;
				
			}
		}
		
		//double click
		WebElement dele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(dele).perform();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		
	}

}
