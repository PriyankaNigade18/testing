package webTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		
		driver.findElement(By.id("login1")).sendKeys("Priyanka");
		//button
		
		driver.findElement(By.name("proceed")).click();
		//alert window will open
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println("Text of the alert: "+alt.getText());
		
		alt.accept();
		
		//password
		driver.findElement(By.id("password")).sendKeys("test123");
		
		
		
		
		
		
	}

}
