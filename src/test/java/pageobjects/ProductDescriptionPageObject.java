package pageobjects;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*This class is used for rpoduct description which shown after selecting particular product.
1) productname
2)add to cart button
3)Add to wishlist
4) Buy now
5)Quantity and price*/

public class ProductDescriptionPageObject {
	private WebDriver driver;

	
    private By ProductName=By.id("productTitle");
    private By cartbutton = By.xpath("//input[@id='add-to-cart-button']");
    private By buynow= By.xpath("//input[@id='buy-now-button']");
    private By addtowishlist= By.xpath("//a[@id='wishListMainButton-announce']");
    private By price= By.xpath("//td[@id='priceblock_ourprice_lbl']");

    public ProductDescriptionPageObject(WebDriver driver) {
		this.driver = driver;
	}
    
   public void checkingproducttitle() {
	   boolean b = driver.findElement(ProductName).isDisplayed();
		Assert.assertEquals("Product Name",true, b);
    }
   
   public void checkingaddtowishlist() {
	   boolean b = driver.findElement(addtowishlist).isDisplayed();
				Assert.assertEquals("Wishlist",true, b);

   }
   
   public void buynowbutton() {
	   boolean b = driver.findElement(buynow).isDisplayed();
	   Assert.assertEquals("Buy Now",true, b);
   }
   
   public void checkingprice()  {
	   boolean b = driver.findElement(price).isDisplayed();
	   Assert.assertEquals("Price",true, b);
   }
   
   public void checkingcartbutton()  {
	   
		driver.findElement(cartbutton).click();
	   
   }
}









