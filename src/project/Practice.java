package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		
		username.sendKeys("saurabhbhetalu17@gmail.com");
		
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		
		password.sendKeys("passssssss");
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		loginbutton.click();
		
		driver.navigate().refresh();
		
		
//		WebElement dropbutton = driver.findElement(By.xpath("//div[@aria-label='Account']"));
//		dropbutton.click();
//		
//		WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span"));
//		logout.click();
		
		
		
		
		//WebElement Forgotbutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3NgS1a']"));
		//Forgotbutton.click();

		
}
	
}	
