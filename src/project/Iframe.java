package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\user\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		driver.switchTo().frame(frame2);
		
		WebElement dropbox = driver.findElement(By.xpath("//select[@id='animals']"));
		dropbox.click();
		
		Select s = new Select(dropbox);
		s.selectByVisibleText("Big Baby Cat");
		
		driver.switchTo().defaultContent();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);
		
		
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		
		driver.switchTo().frame(frame3);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
		checkbox.click();
		
		driver.switchTo().parentFrame();
		
		WebElement textbox = driver.findElement(By.xpath("(//html//body//input)[1]"));
		textbox.sendKeys("november");
	
	}

}
