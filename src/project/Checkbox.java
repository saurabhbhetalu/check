package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox 

{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy(0, 700)");
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='Radio3']"));
		checkbox1.click();
		
		WebElement drop = driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		drop.click();
		
		
		Select s = new Select(drop);
		
		s.selectByValue("option2");
		
		s.selectByValue("option3");
		
		boolean result = checkbox1.isSelected();
		System.out.println(result);
		
		
		if(result ==true)
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}
	}

}
