package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
//by creating an object
//by the name of the Class
	 WebDriver driver;
	
	 @Test
	public void ValidUserShouldBeAbleTologinTest() {
		
	 driver = BrowserFactory.init();
		
	//LoginPage loginPage1 = new LoginPage();
	
	//LoginPage insertUserName = PageFactory.initElements(driver, LoginPage.class);
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.insertUsername("demo@techfios.com");
	loginPage.insertPassword("abc123");
	loginPage.clickOnSigninButton();
	
	BrowserFactory.teardown();
	
	}
}