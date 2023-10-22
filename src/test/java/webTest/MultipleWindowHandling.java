package webTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);//session id from server
		
		//link
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//new window get open
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows);
		
		
		for(String childId:allWindows)
		{
			//child window
			if(!parentId.equals(childId))
			{
				driver.switchTo().window(childId);
				driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
				//driver.close();//close current focus window
				//driver.quit();//all open windows by selenium get closed
				
			}
		}
		
	//parent window
		
		driver.switchTo().window(parentId);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		
		
		

	}

}
