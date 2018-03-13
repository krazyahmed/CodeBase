package day32.pagetestcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AlertHandling {

	static FirefoxDriver driver;
	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello Selenium');");
		alertHandler();
		
		
		

	}
	public static void alertHandler()
	{
		try
		{
			Alert myalert=driver.switchTo().alert();
			myalert.accept();
		}
		catch(Exception e)
		{
			
		}
	}

}
