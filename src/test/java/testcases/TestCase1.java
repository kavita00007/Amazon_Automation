package testcases;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import core.BaseClass;
import pageobjects.CmnPageObjects;
import pageobjects.LoginPageObjects;
import pageobjects.ProductDescriptionPageObject;
import pageobjects.SearchPageObject;
import pageobjects.ShoppingCartObjects;

public class TestCase1 extends BaseClass {
	
     @Test 
	  public void Checking_Website_Navigation() { 
	  driver.get(url);
	  CmnPageObjects object = new CmnPageObjects(driver); 
	  object.amazonLogo();
	  object.searchtextbox("mobile"); 
	  object.validatePageTitle(PageTitle); //only checking browser navigation successful or not
	  System.out.println("Navigation Successful"); 
	  
	  }
	 
     @Test 
	 public void ProductSearch() { 
	 driver.get(url); 
	 CmnPageObjects object=new CmnPageObjects(driver); 
	 object.searchtextbox("earphone");
	 object.searchbutton(); 
	 object.validatePageTitle("Amazon.in : earphone");  //validating title and visibility of searchbox and searching earphone
	 SearchPageObject obj=new SearchPageObject(driver);
	 obj.searchresult();
	 System.out.println("Result page of earphone");
	  
	 }
	 
	 @Test 
	  public void productdescription() { 
	  driver.get(url);
	  ProductDescriptionPageObject product= new ProductDescriptionPageObject(driver); 
	  CmnPageObjects object = new CmnPageObjects(driver); 
	  object.searchtextbox("Apple earpods");
	  object.searchbutton(); 
	  SearchPageObject obj=new SearchPageObject(driver);
	  object.validatePageTitle("Amazon.in : apple earpods");
      obj.clickonproduct();
      object.validatePageTitle("Apple Airpods with Charging Case");
      product.buynowbutton(); 
	  product.checkingaddtowishlist();
	  product.checkingprice(); 
	  product.checkingproducttitle();
	  product.checkingcartbutton();
	  object.validatePageTitle("Amazon.in Shopping Cart");
	  ShoppingCartObjects cart=new ShoppingCartObjects(driver);
	  cart.checkingquantity();
	  cart.checkingaadddedtocart();
	  cart.clickonproceedbutton();
	  
	  
	  }
	 
	  @Test 
	  public void addtocartobject() { 
	  
	  ShoppingCartObjects cart=new ShoppingCartObjects(driver); 
	  CmnPageObjects object = new CmnPageObjects(driver);
	  object.validatePageTitle("Amazon.in Shopping Cart");
	  cart.checkingaadddedtocart(); 
	  cart.clickonproceedbutton();
	  
	  
	  }
	 public void logintoaccount() {
		 LoginPageObjects login=new LoginPageObjects();
		 login.login("kavitarpatil27@gmail.com");
		 login.login1("Abc123");
	 }
	
}
