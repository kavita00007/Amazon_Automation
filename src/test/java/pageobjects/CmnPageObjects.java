package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CmnPageObjects {
	
private WebDriver driver;
	
	private By HambargerMenu =  By.id("nav-hamburger-menu");
	private By AmazonLogo = By.id("nav-logo");
	private By SearchBox = By.id("twotabsearchtextbox");
	private By SearchButton = By.xpath("//input[@value='Go']");
	private By Orders =  By.id("nav-orders");
	private By Prime =  By.id("nav-link-prime");
    private By Cart =  By.id("nav-cart");
	
	public CmnPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickonhamburgermenubutton() {
		boolean b = driver.findElement(HambargerMenu).isDisplayed();
		Assert.assertEquals("HambargerMenu Tab",true, b);
	}

	public void searchtextbox(String text) {
		boolean b=driver.findElement(SearchBox).isDisplayed();
		Assert.assertEquals("SearchTextbox Tab",true, b);
		driver.findElement(SearchBox).sendKeys(text);
    }
	
	public void searchbutton() {
	
	boolean b = driver.findElement(SearchButton).isDisplayed();
	Assert.assertEquals("Search bar",true, b);
	driver.findElement(SearchButton).click();
	}
	
	public void amazonLogo() {
		boolean b = driver.findElement(AmazonLogo).isDisplayed();
		Assert.assertEquals("Navigation link logo",true, b);
	}
	
	public void cartitems() {
		boolean b= driver.findElement(Cart).isDisplayed();
		Assert.assertEquals("Cart ",true, b);

	}
	
	public void primecheck() {
		boolean b= driver.findElement(Prime).isDisplayed();
		Assert.assertEquals("Cart ",true, b);

	}
	
	public void validatePageTitle(String expected) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains(expected));
		String search = driver.getTitle();
		Assert.assertEquals("Match Search Title", expected, search);
	}
	
	
	

}
