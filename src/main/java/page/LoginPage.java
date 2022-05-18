package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {
	

 WebDriver driver;

public LoginPage(WebDriver driver) {
		
		this.driver = driver;
}
		
	//We can't use BY CLASS OR WEBELEMENT 
	//We must use this method below to store elements 
	//Element Library
	// two arguments (how and using) 
	@FindBy(how = How.XPATH, using= "//*[@id=\"username\"]") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_BUTTON_ELEMENT;
		
	//cant hard code so we enter a parameter for each method String username/password. so when we call it in the logintest page,
	//the user can pass on the username/password they want
	public void insertUsername(String userName) {
		
	USERNAME_ELEMENT.sendKeys(userName);
	}
	
	public void insertPassword(String password) {
		
	PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickOnSigninButton() {
		
		SIGNIN_BUTTON_ELEMENT.click();
		
	}

	
	// we can use one method instead of seperate methods too like below V
	//public void loginTest(String userName,String password) {
	//	USERNAME_ELEMENT.sendKeys(userName);
	//	PASSWORD_ELEMENT.sendKeys(password);
	//	SIGNIN_BUTTON_ELEMENT.click();	
	//}
		
		//the above way is better because you can figure out where your code fails, the maintence is harder if you use one method
	//and many arguments maybe 60 or 100 in one page. but if we use sepearte method and one orgument, you can pinpoint exactly which one fails.
	
	}

