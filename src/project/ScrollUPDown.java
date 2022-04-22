package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUPDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://bollydrip.pro/");
		Thread.sleep(2000);
		
//		WebElement ew = driver.findElement(By.xpath("//span[text()='2']"));
		
//		Thread.sleep(5000);
		JavascriptExecutor a = (JavascriptExecutor)driver;
//		a.executeScript("arguments[0].scrollIntoView();",ew);
//		Thread.sleep(5000);
//		a.executeScript("arguments[0].click();",ew);
		
		a.executeScript("window.scrollBy(0, 2000)");
		Thread.sleep(2000);
		
		a.executeScript("window.scrollBy(0,-1500)");
		
	}
	

}
