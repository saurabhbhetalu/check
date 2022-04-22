package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
//		Actions act = new Actions(driver);
//		
//		WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//		act.doubleClick(doubleclick).perform();
//		 
//		WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//		act.contextClick(rightclick).perform();
//		
//		WebElement click = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
//		act.click(click).perform();
		
		Actions act = new Actions(driver);
		
		WebElement wishington = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement us = driver.findElement(By.xpath("//div[@id='box103']"));
		act.dragAndDrop(wishington, us).perform();
		
		WebElement soual = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement southkorea = driver.findElement(By.xpath("//div[@id='box105']"));
		act.dragAndDrop(soual, southkorea).perform();

		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop(rome, italy).perform();
		
		WebElement Copenhagen = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement Denmark = driver.findElement(By.xpath("//div[@id='box104']"));
		act.dragAndDrop(Copenhagen, Denmark).perform();
		
		WebElement Madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		act.dragAndDrop(Madrid, spain).perform();
		
		WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement norway = driver.findElement(By.xpath("//div[@id='box101']"));
		act.dragAndDrop(oslo, norway).perform();
		
		WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement sweden = driver.findElement(By.xpath("//div[@id='box102']"));
		act.dragAndDrop(stockholm, sweden).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 2000)");
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0, -2000)");
		
//		driver.close();
	}

}
