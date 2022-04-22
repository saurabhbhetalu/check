package project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class random 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\user\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		
		
		
//		WebElement clickbutton = driver.findElement(By.xpath("//button[@id='promtButton']"));
//		clickbutton.click();
//		
//		Alert alt = driver.switchTo().alert();
//		alt.dismiss();
		
		
		
		
		
		
	

}
}