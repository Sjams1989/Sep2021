package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class BrowserFactory {

	static WebDriver driver;
	static String browser = "chrome";
	static String url = "https://techfios.com/billing/?ng=admin/";
	
	
	public  static WebDriver init() {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver101.exe");
			driver = new ChromeDriver();
			
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
			
	}
	
	public static void teardown() {
	
	driver.close();
	driver.quit();	
}}