package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
//		System.out.println("1");
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("2");
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
//		System.out.println("3");
//		driver.get("https://www.youtube.com/");
//		System.out.println("4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		
		WebElement email = driver.findElement(By.xpath("(//div//label//span)[1]"));
		email.sendKeys("saurabh");
		
		WebElement fn = driver.findElement(By.xpath("(//div//label//span)[2]"));
		fn.sendKeys("saubh");
		
		WebElement un = driver.findElement(By.xpath("(//div//label//span)[3]"));
		un.sendKeys("saurabh");
		
		WebElement pw = driver.findElement(By.xpath("(//div//label//span)[4]"));
		pw.sendKeys("pass");
		
		WebElement sign = driver.findElement(By.xpath("(//div//div//button)[2]"));
		sign.click();
		
	}


}
