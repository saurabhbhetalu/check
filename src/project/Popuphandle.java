package project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuphandle 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
//		//alert pop up 
//		driver.get("https://demoqa.com/alerts");
//		
//		
//		WebElement clickbutton = driver.findElement(By.xpath("//button[@id='alertButton']"));
//		clickbutton.click();
//		
//		Alert alt = driver.switchTo().alert();
//		alt.accept();
//		
//		
//		WebElement timeralertbutton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
//		timeralertbutton.click();
//		
//		Thread.sleep(6000);
//		
//		alt.accept();
//		
//		WebElement alertbutton3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		alertbutton3.click();
//		
//		alt.accept();
//		
//		
//		WebElement alertbutton4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
//
//		alertbutton4.click();
//		
//		
//
//		alt.sendKeys("enter");
//		alt.accept();
		
	
//		//Authanetication pop up
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		System.out.println("End of Program");
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
