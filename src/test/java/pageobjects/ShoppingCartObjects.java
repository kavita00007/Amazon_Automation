package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartObjects {

	private WebDriver driver;
	private By added =By.xpath("//h1[@class='a-size-medium a-text-bold']");
	private By proceed=By.xpath("//a[@id='hlb-ptc-btn-native']");
	private By quantity=By.xpath("//div[@class='a-row a-spacing-micro']//span[contains(text(),'(1 item):')]");

	 public ShoppingCartObjects(WebDriver driver) {
			this.driver = driver;
		}
	 
	 public void checkingaadddedtocart() {
			boolean b = driver.findElement(added).isDisplayed();
			Assert.assertEquals("Item addded to cart",true, b);
		}
	 
	 public void checkingquantity()  {
		 boolean b = driver.findElement(quantity).isDisplayed();
			Assert.assertEquals("Quantity",true, b);
	 }
	 
	 public void clickonproceedbutton() {
			
			driver.findElement(proceed).click();
		}
	 
}
