package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessDemo {

	public static void main(String[] args)
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		System.out.println("Driver session is created");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		System.out.println("Google application open");
		
		//search
		driver.findElement(By.name("q")).sendKeys("Java");
		
		System.out.println("Keyword search");
		//get all options
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println("Total Options are: "+list.size());
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}

		System.out.println("Test Completed!");
	}

}
