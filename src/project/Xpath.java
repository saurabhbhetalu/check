package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	public static void main(String[] agrs) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(1200);
		
		//using xpath by index (syntax by contains & attribute)
		WebElement username = driver.findElement(By.xpath("(//input[contains(@aria-required,'true')])[1]"));
		username.sendKeys("saurabhbhetalu17@gmail.com");
		
		
		//using xpath by index (syntax by contains & attribute)
		WebElement pass = driver.findElement(By.xpath("(//input[contains(@aria-required,'true')])[2]"));
		pass.sendKeys("pass123456");
		
		
		//using xpath by contains (syntax by attribute)
		WebElement login = driver.findElement(By.xpath("//button[contains(@class,'sqdOP  L3NKy   y3zKF     ')]"));
		login.click();
		Thread.sleep(5000);
		
		// using xpath by contains (syntax = attribute)
		WebElement notnowbutton = driver.findElement(By.xpath("(//button[contains(@type,'button')])[2]"));
		notnowbutton.click();
		
		
		//using xpath by syntax
		WebElement notnow = driver.findElement(By.xpath("//button[contains(@class,'aOOlW   HoLwm ')]"));
		notnow.click();
		
		// using xpath by copy xpath
		WebElement profile = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[6]/span/img"));
		profile.click();
		
		Thread.sleep(5000);
		
		
		// using xpath by copy full xpath
		WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[3]/div/div[6]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div"));
		logout.click();
		
		
		String expectedurl = "https://www.instagram.com/";
		
		String actualurl = driver.getCurrentUrl();
		
		
		if(expectedurl.equals(actualurl))
		{
			System.out.println("Test case passed");
			
		}
		else
		{
			System.out.println("Test is Failed");
		}
				
				
				
				
				
				
	}

}
