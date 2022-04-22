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
import org.openqa.selenium.support.ui.Select;

public class Signupfacebook 
{
	
	static WebDriver driver;
	
	public static void screenshot() throws IOException
	{
		
		System.out.println("Takes ScreenShot");

		DateFormat d = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		Calendar cal = Calendar.getInstance();
		String filename= d.format(cal.getTime());
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File sourcefile = t.getScreenshotAs(OutputType.FILE);
		File destfile = new  File("G:\\Velocity Classes\\Automation Testing\\Screenshot\\"+filename+"Signupfacebook.jpg");
		FileHandler.copy(sourcefile, destfile);
		
		System.out.println("ScreenShot has Taken");
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		System.out.println("Open Chrome Browser");
		driver = new ChromeDriver();
		
//		System.out.println("maximize the Browser");
//		driver.manage().window().maximize();
		
		System.out.println("Give 20 Second wait");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		
		System.out.println("Open Facebook Website");
		driver.get("https://www.facebook.com/");
		
		screenshot();
		
		System.out.println("Click on Register button");
		WebElement registerbutton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		registerbutton.click();
		

		screenshot();
		
		System.out.println("Enter First name");
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Saurabh");
		
		System.out.println("Enter Last Name");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Bhetalu");
		
		
		System.out.println("Enter mobile number");
		WebElement mobino = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobino.sendKeys("9767578574");
		
		
		System.out.println("Enter Password");
		WebElement newpass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		newpass.sendKeys("Pass@976757");
		
		
		System.out.println("Select day 13");
		WebElement daydrop = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s1 = new  Select(daydrop);
		s1.selectByValue("13");
		
		
		System.out.println("Select month November");
		WebElement monthdrop = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s2 = new  Select(monthdrop);
		s2.selectByValue("11");
	
		System.out.println("Select year 1996");
		WebElement yeardrop = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s3 = new  Select(yeardrop);
		s3.selectByValue("1996");
	
		
		System.out.println("Click male checkbox");
		WebElement gender = driver.findElement(By.xpath("(//input[contains(@class,'_8esa')])[2]"));
		gender.click();
		
		boolean result = gender.isSelected();
		System.out.println(result);
		if (result = true)
		{
			System.out.println("male gender is selected");
		}
		else 
		{
			System.out.println("gender is not selected");
		}
		

		screenshot();
		
		System.out.println("Click sign in button");
		WebElement signinbutton = driver.findElement(By.xpath("//div[@class='_1lch']"));
		signinbutton.click();
		
		
		

		screenshot();
		
		
		
	}

	
}
