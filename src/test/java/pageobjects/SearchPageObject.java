package pageobjects;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		Assert.assertEquals("Result Tab",true, b);
	}
	
	public void clickonproduct() {
		
		
		driver.findElement(expected_product).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> It = handles.iterator();
		String ParentWindowId = It.next();
		String childWindowId = It.next();
		driver.switchTo().window(childWindowId);
		
		
		
	}
}
