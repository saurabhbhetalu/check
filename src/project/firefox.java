package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		// microsoft edge setup
//		System.setProperty("webdriver.edge.driver","C:\\Users\\user\\Desktop\\selenium\\msedgedriver.exe");
//
//		WebDriver driver = new EdgeDriver();
//		
//		
//		driver.get("https://www.flipkart.com");    // to open url
//	
		
	}

}
