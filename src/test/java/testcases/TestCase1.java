package testcases;

import org.junit.Test;
import core.BaseClass;
import pageobjects.CmnPageObjects;
import pageobjects.ProductDescriptionPageObject;
import pageobjects.SearchPageObject;
import pageobjects.ShoppingCartObjects;

public class TestCase1 extends BaseClass {
	


	
	
	
	
	//  @Test 
	 // public void Checking_Website_Navigation() { 
	  //driver.get(url);
	  //CmnPageObjects object = new CmnPageObjects(driver); 
	  //object.amazonLogo();
	  //object.searchtextbox("mobile"); 
	//  object.validatePageTitle(PageTitle); //only checking browser navigation successful or not
	 // System.out.println("Navigation Successful"); }
	 
	 // @Test 
	  //public void ProductSearch() { 
	  //driver.get(url); 
	  //CmnPageObjects object=new CmnPageObjects(driver); 
	  //object.searchtextbox("earphone");
	  //object.searchbutton(); 
	  //object.validatePageTitle("Amazon.in : earphone");  //validating title and visibility of searchbox and searching earphone
	  //SearchPageObject obj=new SearchPageObject(driver);
	  //obj.searchresult();
	  //System.out.println("Result page of earphone");
	  
	  //}
	 
	
	  
	
	  @Test 
	  public void productdescription() { 
	  driver.get(url);
	  ProductDescriptionPageObject product= new ProductDescriptionPageObject(driver); 
	  CmnPageObjects object = new CmnPageObjects(driver); 
	  object.searchtextbox("Apple earpods");
	  object.searchbutton(); 
	  SearchPageObject obj=new SearchPageObject(driver);
      obj.clickonproduct();
	  product.buynowbutton(); product.checkingaddtowishlist();
	  product.checkingprice(); product.checkingproducttitle();
	  product.checkingcartbutton();
	  object.validatePageTitle("Amazon.in Shopping Cart");
	  ShoppingCartObjects cart=new ShoppingCartObjects(driver);
	  cart.checkingquantity();
	  cart.checkingaadddedtocart();
	  cart.clickonproceedbutton();
	  
	  
	  }
	 
	
	/*
	 * @Test public void addtocartobject() { productdescription();
	 * ShoppingCartObjects cart=new ShoppingCartObjects(driver); CmnPageObjects
	 * object = new CmnPageObjects(driver);
	 * object.validatePageTitle("Amazon.in Shopping Cart");
	 * cart.checkingaadddedtocart(); cart.clickonproceedbutton();
	 * 
	 * 
	 * }
	 */
	
}
