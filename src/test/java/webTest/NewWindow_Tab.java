package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class NewWindow_Tab {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//new Tab-->facebook
		for(int i=1;i<=10;i++)
		{
		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		newTab.get("https://www.facebook.com");
		System.out.println("Title is: "+newTab.getTitle());
		}
		
		//new Window ---->amazon 
		WebDriver window=driver.switchTo().newWindow(WindowType.WINDOW);
		window.get("https://www.amazon.com");
		System.out.println(window.getTitle());
	}

}
