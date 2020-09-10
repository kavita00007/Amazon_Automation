package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPageObject {
	
	private WebDriver driver;
	private By result= By.xpath("//span[contains(text(),'1-16 of over 50,000 results for')]");
	private By expected_product=By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple AirPods with Charging Case')]");
	
	public SearchPageObject(WebDriver driver)
	{
		this.driver=driver;
	}


	public void searchresult() {
		boolean b = driver.findElement(result).isDisplayed();
		Assert.assertEquals("HambargerMenu Tab",true, b);
	}
	
	public void clickonproduct() {
		driver.findElement(expected_product).click();
	}
}
