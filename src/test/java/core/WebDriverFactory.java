package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	
	private static WebDriver driver = null;
	public static WebDriver getbrowser(String browser) throws Exception{
		
		switch(browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
			default:  throw new Exception("No such browser is implemented.Browser name sent: " + browser);
		}
		return driver;
		
	}
}
