package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RedBusCalendar {

	public static void main(String[] args) {

		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
			
		//expected result
		String date="20";
		String month="Apr";
		String year="2024";
		
		
		//date
		driver.findElement(By.id("onwardCal")).click();
		
		//month selection
		while(true)
		{
		//current month and year
		String text=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
		System.out.println(text);
		String mon=text.split(" ")[0];
		String yer=text.split(" ")[1];
		
		System.out.println(mon+"  "+yer);
		
		if(mon.contains(month) && yer.contains(year))
		{
			break;
		}else
		{
			driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
		}
		
		
		}	
		
		
		//date selection
		
		List<WebElement> allDates=driver.findElements(By.xpath("//div[contains(@class,'DayTiles')]//span[contains(@class,'DayTiles__CalendarDaysSpan')]"));
		
		for(WebElement i:allDates)
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}
		
		
		
	}

}
