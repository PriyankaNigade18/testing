package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		//Top-->left
		driver.switchTo().frame("frame-top").switchTo().frame("frame-left");
		
		String text1=driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();		
		System.out.println("Left frame text is: "+text1);
		System.out.println(driver.getPageSource());
		
		
		//Top--middle
		//come back to top frame
				driver.switchTo().defaultContent();
		
			driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
			
			System.out.println(driver.getPageSource());
			
			//top--->right
			//come back to top frame
			driver.switchTo().defaultContent();
	
		driver.switchTo().frame("frame-top").switchTo().frame("frame-right");
		
		System.out.println(driver.getPageSource());
		
		driver.switchTo().defaultContent();
		
		//bottom
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.getPageSource());
				
		
		
		
	}

}
