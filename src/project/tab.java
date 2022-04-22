package project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tab 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("1");
//		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("2");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"T");
		
		
		System.out.println("3");
	
		driver.navigate().to("https://www.youtube.com/");
		System.out.println("4");

}

}
