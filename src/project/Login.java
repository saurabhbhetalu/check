package project;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Login 
{
	static WebDriver driver;

	public static void screenshot() throws IOException
	{
		System.out.println("takes screenshot");
		Date date = new Date(0);
		DateFormat d = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String filename = d.format(date);
		
		TakesScreenshot t = (TakesScreenshot)driver; 
		File sourcefile = t.getScreenshotAs(OutputType.FILE);
		File destfile = new File("G:\\Velocity Classes\\Automation Testing\\Screenshot\\"+filename+".jpg");
		FileHandler.copy(sourcefile, destfile);
		System.out.println("screenshot is taken");
		
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		
//		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/"); 
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		password.sendKeys("secret_sauce");
		
	//	Thread.sleep(3000);
		WebElement loginbutton = driver.findElement(By.xpath("//input[@name='login-button']"));
		loginbutton.click();
		
		//Thread.sleep(7000);
		
		List<WebElement> addtocart = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		
		
		for (int i=0; i<addtocart.size(); i++)
		{
			addtocart.get(i).click();
		
		}
		
		//Thread.sleep(3000);
		WebElement cartbutton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartbutton.click();  //button[@data-test='checkout']
		
		//Thread.sleep(3000);
		screenshot();
		
		WebElement checkoutbutton = driver.findElement(By.xpath("//button[@data-test='checkout']"));
		checkoutbutton.click();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@data-test='firstName']"));
		FirstName.sendKeys("saurabh");
		
		
		WebElement LastName = driver.findElement(By.xpath("//input[@data-test='lastName']"));
		LastName.sendKeys("Bhetalu");
		
		WebElement Zip = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
		Zip.sendKeys("444704");
//		Thread.sleep(3000);
		screenshot();
		WebElement continuebutton = driver.findElement(By.xpath("//input[@data-test='continue']"));
		continuebutton.click();
		
//		Thread.sleep(5000);
		
		WebElement finishbutton = driver.findElement(By.xpath("//button[@id='finish']"));
		finishbutton.click();
		
		WebElement backtohome = driver.findElement(By.xpath("//button[@id='back-to-products']"));
		backtohome.click();
		
//		Thread.sleep(5000);
		
		WebElement buggerbutton = driver.findElement(By.id("react-burger-menu-btn"));
		buggerbutton.click();
		
//		Thread.sleep(3000);
		
		WebElement logoutbutton = driver.findElement(By.id("logout_sidebar_link"));
		logoutbutton.click();
		
		screenshot();
		
		
		
//		Thread.sleep(3000);
		
		driver.quit();
		
		System.out.println("end of program");
		
		
		
		
		
		
	}
	

}
