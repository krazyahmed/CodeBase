package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class YahooLogin {


	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://yahoomail.com");
		driver.findElement(By.id("login-username")).sendKeys("saikrishna_rhce");
		driver.findElement(By.id("login-signin")).click();
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.name("password")).sendKeys("abcd");
		driver.findElement(By.id("login-signin")).click();

	}

}
