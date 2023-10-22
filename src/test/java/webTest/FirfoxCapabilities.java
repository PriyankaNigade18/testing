package webTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirfoxCapabilities {

	public static void main(String[] args) {

		FirefoxOptions options =new FirefoxOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
	}

}
