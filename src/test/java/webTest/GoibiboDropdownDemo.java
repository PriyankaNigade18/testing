package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboDropdownDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
		//close the pop up
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
		
		
		List<WebElement> fromList=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']"));
		
		
		System.out.println("Total Options are: "+fromList.size());
		
		for(WebElement i: fromList)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Pantnagar, India"))
			{
				i.click();
				
				break;
			}
		}
		
		
		
		
		
		
	}

}
