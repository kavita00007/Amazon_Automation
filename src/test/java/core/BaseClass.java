package core;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	protected WebDriver driver;
    protected final static String url = "https://amazon.in";
    protected final static String PageTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

    @Before
    public void browser_setup() {
    	
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
    
    
    @After
	public void clean_up() {
		driver.quit();
	}

}
