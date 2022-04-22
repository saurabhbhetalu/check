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

public class Allconcept 
{
	static WebDriver driver;
	
	public static void screenshot() throws IOException
	{
		System.out.println("takes screenshot");
		DateFormat date = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		Calendar cal = Calendar.getInstance();
		String filename = date.format(cal.getTime());
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File sourcefile = t.getScreenshotAs(OutputType.FILE);
		File destfile = new File("G:\\Velocity Classes\\Automation Testing\\Screenshot\\"+filename+"Allconcept.jpg");
		FileHandler.copy(sourcefile, destfile);
		System.out.println("screenshot was taken");
	}
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	//	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		
		screenshot();
		
		System.out.println("Click on SignIn ");
	
		WebElement clicksignbutton = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		clicksignbutton.click();
		
		screenshot();
		
		System.out.println("click on create account button");
		
		WebElement createaccount = driver.findElement(By.xpath("//a[contains(@id,'createAccountSubmit')]"));
		createaccount.click();
		
		//input[contains(@id,'ap_customer_name')]
		
		WebElement entername = driver.findElement(By.xpath("//input[contains(@id,'ap_customer_name')]"));
		entername.sendKeys("Velocity Cop");
		
		
		
//		WebElement dropdown = driver.findElement(By.xpath("//span[contains(@data-action,'a-dropdown-button')]"));
//		Select s = new Select(dropdown);
//		s.selectByValue("IN +91");
		
				
					
				
		WebElement entermobino = driver.findElement(By.xpath("//input[@id='ap_email']"));
		entermobino.sendKeys("9876543211");
		
		//*[@id="ap_password_check"]
		
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		pass.sendKeys("Pass@123445");
		
		WebElement pass1 = driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]"));
		pass1.sendKeys("Pass@123445");
		
		WebElement continuebutton = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		continuebutton.click();
		
		screenshot();
		
		System.out.println("end");
		
		
		
		
		
		
				
		
		
	}

}
