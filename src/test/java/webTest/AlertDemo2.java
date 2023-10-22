package webTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//alert1
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(2000);
		
		//alert handling
		Alert alt1=driver.switchTo().alert();
		System.out.println("Alert text: "+alt1.getText());
		alt1.accept();
		
		//result
		WebElement res=driver.findElement(By.xpath("//p[@id='result']"));
		System.out.println(res.getText());
		
		
		
		
	}

}
