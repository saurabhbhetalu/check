package project;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Childpopup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\user\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		String mainpageid = driver.getWindowHandle();
//		System.out.println(mainpageid);
		
		WebElement seleniumbutton = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		seleniumbutton.click();
		
		
//		Set<String> mainpageid = driver.getWindowHandles();
//		System.out.println(mainpageid);	
		
		List<String> popuppage = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(popuppage.get(1));
		
		
		WebElement clickdrop = driver.findElement(By.xpath("//input[@list='mah-district']"));
		clickdrop.click();
		
		
		Select s = new Select(clickdrop);
		s.selectByVisibleText("Amravati");
		
		
		
		
		
		
		
		
		
	
		
		System.out.println("End of Program");
		
	}

}
