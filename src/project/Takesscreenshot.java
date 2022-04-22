package project;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takesscreenshot 
{
	static WebDriver driver;
	
	public static void screenshot() throws IOException
	{
		System.out.println("take screenshot");
		
		DateFormat d = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		Calendar cal = Calendar.getInstance();
		String newdate = d.format(cal.getTime());
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File sourcefile = t.getScreenshotAs(OutputType.FILE);
		File destfile = new File("G:\\Velocity Classes\\Automation Testing\\Screenshot\\"+newdate+"Takesscreenshot.jpg");
		FileHandler.copy(sourcefile, destfile);
		
		System.out.println("Screenshot has taken.");
	}
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		 
		System.out.println("open flipkart website");
		driver.get("http://www.flipkart.com");
		
		screenshot();
		
		System.out.println("close login window");
		WebElement closelogin = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4')]")); 
		closelogin.click();
		
		screenshot();
		
		System.out.println("click on mobile module");
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img"));
		mobile.click();
		
		screenshot();
		
//		System.out.println("click on realme 8");
//		WebElement realme = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[4]/div/div[1]/a/div/img[2]"));
//		realme.click();
		
		
		
		
		
		
		
		
		
		
		
		//	driver.quit();
	}

}
