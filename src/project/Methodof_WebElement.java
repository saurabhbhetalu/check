package project;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Methodof_WebElement 
{
	
	static WebDriver driver; 
	
	public static void screenshot() throws IOException
	{
		System.out.println("Take Screenshot");
		DateFormat d = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		Calendar cal = Calendar.getInstance();
		String filename = d.format(cal.getTime());
		
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File sourceFile = t.getScreenshotAs(OutputType.FILE);
		File destfile = new File("G:\\Velocity Classes\\Automation Testing\\Screenshot\\"+filename+"Methodof_WebElement.jpg");
		FileHandler.copy(sourceFile, destfile);
		System.out.println("Screenshot is taken");
	}
	
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/");
		
		screenshot();
	
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		password.sendKeys("secret_sauce");
		
		screenshot();
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@name='login-button']"));
		loginbutton.click();
		
		screenshot();
		
		WebElement addtocart = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
		addtocart.click();    //a[@class='shopping_cart_link']
		
		
		WebElement cartbutton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartbutton.click();  //button[@data-test='checkout']
		
		
		screenshot();
		
		WebElement checkoutbutton = driver.findElement(By.xpath("//button[@data-test='checkout']"));
		checkoutbutton.click();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@data-test='firstName']"));
		FirstName.sendKeys("saurabh");
		
		
		WebElement LastName = driver.findElement(By.xpath("//input[@data-test='lastName']"));
		LastName.sendKeys("Bhetalu");
		
		WebElement Zip = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
		Zip.sendKeys("444704");
		
		screenshot();
		
		WebElement continuebutton = driver.findElement(By.xpath("//input[@data-test='continue']"));
		continuebutton.click();
		
		screenshot();
		
		System.out.println("End of Program");
		
		
		driver.quit();
	
		
	}

}
