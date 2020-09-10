package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {
	
	private WebDriver driver;
	private By email= By.id("ap_email");
	private By Continue=By.id("continue");
	private By pass= By.id("ap_password");
	private By signin=By.id("signInSubmit");

	
	
	public void login(String str) {
        driver.findElement(email).sendKeys(str);
		driver.findElement(Continue).click();
		
	}
	
	public void login1(String str) {
		driver.findElement(pass).sendKeys(str);
		driver.findElement(signin).click();

	}
	
	
	
	

}
