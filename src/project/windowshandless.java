package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandless 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement orange = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		orange.click();
		
//		Set<String> mainpage = driver.getWindowHandles();
//		System.out.println(mainpage);
		
		List<String> nextpage = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(nextpage.get(1));
	
		
		
		WebElement sales = driver.findElement(By.xpath("//a[text()='Contact Sales']"));
		sales.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@id='Form_submitForm_FullName']"));
		name.sendKeys("saurabh");
		
		WebElement company = driver.findElement(By.xpath("//input[@id='Form_submitForm_CompanyName']"));
		company.sendKeys("velocity");
		
		driver.quit();
		System.out.println("finish");
	
//		CDwindow-F78D17B3D79121A4079EE13C9EF202BD, 
//		CDwindow-E2BA23300600E99E6E0870D57D30546D]
		
//		[CDwindow-BF1051B98A29738E0E6E76018CBC4F47, --main page--0
//		CDwindow-0651CD2FF683B96DB2F01B01093BA7D4]-- nextpage--1
	
	}
}

