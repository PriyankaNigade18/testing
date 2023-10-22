package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Utility;

public class ExplicitDemo2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		//By
		By btn=By.xpath("//button[text()='Start']");
		By text=By.xpath("//h4[text()='Hello World!']");
		
		driver.findElement(btn).click();
		
		String res=Utility.waitForElementVisbiblity(driver, text).getText();
		
//		String res=driver.findElement(text).getText();
//		
		System.out.println(res);
		
			
		
		
		
		
		
		
		
		
		
	}

}
